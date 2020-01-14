package com.my.app.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.my.app.common.ResultMessageObject;
import com.my.app.service.SendMailService;

@Service
public class SendMailServiceImpl implements SendMailService {
	
	@Value("${spring.mail.username}")
	public String sendUser;
	
	@Resource
	private JavaMailSender javaMailSender;
	
	@Override
	public ResultMessageObject sendHtmlMail() {
	    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	    
	    try {
	    	//是否发送的邮件是富文本（附件，图片，html等）
	    	MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

	    	messageHelper.setFrom(sendUser);
	    	messageHelper.setTo(sendUser);

	    	messageHelper.setSubject("测试");
	    	messageHelper.setText("欢迎进入<a href=\"http://www.baidu.com\">百度首页</a>", true);//重点，默认为false，显示原始html代码，无效果

	    	Map<String, String> attachmentMap = new HashMap<String, String>();
	    	String filePath = "F:\\lombok.jar";
	    	String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
	    	attachmentMap.put(fileName, filePath);
	    	if(attachmentMap != null){
	    		attachmentMap.entrySet().stream().forEach(entrySet -> {
	    			File file = new File(entrySet.getValue());
	    			if(file.exists()){
	    				try {
							messageHelper.addAttachment(entrySet.getKey(), new FileSystemResource(file));
						} catch (MessagingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    			}
	    		});
	    	}

	    	javaMailSender.send(mimeMessage);
	    } catch (MessagingException e) {
	    	e.printStackTrace();
	    }

		return null;
	}

}

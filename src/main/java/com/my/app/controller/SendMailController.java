package com.my.app.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sendMail")
public class SendMailController extends BaseController{
	
	@Value("${spring.mail.username}")
	public String sendUser;
	
	@Resource
	private JavaMailSender javaMailSender;

	@PostMapping("send")
	public Object sendMail() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
	    mailMessage.setFrom(sendUser);
	    mailMessage.setTo(sendUser);
	 
	    mailMessage.setSubject("测试");
	    mailMessage.setText("11111");
	 
	    javaMailSender.send(mailMessage);
	    
	    
	    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	    
	    try {
	    	//是否发送的邮件是富文本（附件，图片，html等）
	    	MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

	    	messageHelper.setFrom(sendUser);
	    	messageHelper.setTo(sendUser);

	    	messageHelper.setSubject("测试");
	    	messageHelper.setText("欢迎进入<a href=\"http://www.baidu.com\">百度首页</a>", true);//重点，默认为false，显示原始html代码，无效果

	    	Map<String, String> attachmentMap = new HashMap<String, String>();
	    	attachmentMap.put("附件", "file.txt的绝对路径");
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

	    } catch (MessagingException e) {
	    	e.printStackTrace();
	    }
	    javaMailSender.send(mimeMessage);
	    return "SUCCESS";
	}
}

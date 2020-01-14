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

import com.my.app.service.SendMailService;

@RestController
@RequestMapping("sendMail")
public class SendMailController extends BaseController{
	
	@Value("${spring.mail.username}")
	public String sendUser;
	
	@Resource
	private JavaMailSender javaMailSender;

	@Resource
	SendMailService sendMailService;
	
	@PostMapping("send")
	public Object sendMail() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
	    mailMessage.setFrom(sendUser);
	    mailMessage.setTo(sendUser);
	 
	    mailMessage.setSubject("测试");
	    mailMessage.setText("11111");
	 
	    javaMailSender.send(mailMessage);
	    
	    sendMailService.sendHtmlMail();
	    return "SUCCESS";
	}
}

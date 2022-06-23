package com.example.demo.layer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer4.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	MailService mailService;
	
	
	
	@RequestMapping("/send/{email}")
	public String sendEmailTo(@PathVariable("email") String emailTo) {
		System.out.println("/send to "+emailTo);
		mailService.sendMail("Welcome User\n\tYour loan has been sent for processing.", emailTo);
		return "email sent";
	}
	
}

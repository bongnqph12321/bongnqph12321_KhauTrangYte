package poly.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
	@Autowired
	JavaMailSender javaMailSender;
	@RequestMapping("/send")
	public String SendMail(@RequestParam("to")String to,
			@RequestParam("subject")String subject,
			@RequestParam("content")String content,Model model) {
			
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(content);
		javaMailSender.send(msg);
		model.addAttribute("message","send mail successted !");
		return "admin/detail";
	}
}

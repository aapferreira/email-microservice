package com.emailmicroservice.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emailmicroservice.enums.StatusEmail;
import com.emailmicroservice.model.EmailModel;
import com.emailmicroservice.repository.EmailRepository;

import java.util.Optional;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

//	@Autowired
//	private JavaMailSender emailSender;

	public EmailModel sendEmail(EmailModel emailModel) {
		emailModel.setSendDateEmail(LocalDateTime.now());
		try {
			
//			SimpleMailMessage message = new SimpleMailMessage();
//			message.setFrom(emailModel.getEmailFrom());
//			message.setTo(emailModel.getEmailTo());
//			message.setSubject(emailModel.getSubject());
//			message.setText(emailModel.getText());
//			emailSender.send(message);
			
			System.out.println("Enviando email");

			emailModel.setStatusEmail(StatusEmail.SENT);
		} catch (MailException e) {
			emailModel.setStatusEmail(StatusEmail.ERROR);
		} finally {
			System.out.println("Salvando email no banco");
			return emailRepository.save(emailModel);
		}
	}
	
	public Page<EmailModel> findAll(Pageable pageable) {
        return  emailRepository.findAll(pageable);
    }

    public Optional<EmailModel> findById(Long id) {
        return emailRepository.findById(id);
    }	

}

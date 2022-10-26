package com.example.demo.service;

import com.example.demo.MailContentBuilder;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailPrimaryService extends EmailService {

    @Value("${spring.mail.primary.username}")
    private String fromEmail;

    @Override
    public String getFromEmail() {
        return fromEmail;
    }

    protected EmailPrimaryService(@Qualifier("primarySender") JavaMailSender mailSender, MailContentBuilder mailContentBuilder) {
        super(mailSender, mailContentBuilder);
    }
}

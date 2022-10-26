package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * https://stackoverflow.com/questions/52424116/how-to-configure-two-different-emails-in-springboot
 */
@Configuration
public class MailConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.mail.vertrip")
    public JavaMailSender vertripSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setDefaultEncoding("utf-8");
        return javaMailSender;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.mail.primary")
    public JavaMailSender primarySender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setDefaultEncoding("utf-8");
        return javaMailSender;
    }
}

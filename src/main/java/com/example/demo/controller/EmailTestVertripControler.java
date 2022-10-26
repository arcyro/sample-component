package com.example.demo.controller;


import com.example.demo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;

@Controller
@Slf4j
public class EmailTestVertripControler {

    private final EmailService emailService;

    public EmailTestVertripControler(@Qualifier("emailVertripService") EmailService emailService) {
        this.emailService = emailService;
    }


    @GetMapping("/sample-email-vertrip")
    @ResponseBody
    public void sampleEmail() throws MessagingException {
        emailService.prepareAndSend(ArrayUtils.toArray("arek@arcyro.pl"), "sommmmme message vertrip", "temat");
    }
}

package com.email.server.controller;


import com.email.server.entity.Bulkemail;
import com.email.server.entity.Email;
import com.email.server.service.serviceimp.emailImp;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class emailController
{

    @Autowired
    emailImp emailImp;

    @PostMapping("/emailsend")
    public void sendmail(@RequestBody Email e)
    {
        emailImp.emailsend(e.getTo(),e.getSubject(),e.getMessage());
    }



    @PostMapping("/bulkemail")
    public void bulkemail(@RequestBody Bulkemail e)
    {
        emailImp.Bulkemails(e.getTo(),e.getSubject(),e.getMessage());
    }


    @PostMapping("/emailHtml")
    public void bulkemail(@RequestBody Email e) throws MessagingException {
        emailImp.emailsendWithHTML(e.getTo(),e.getSubject(),e.getMessage());
    }


}

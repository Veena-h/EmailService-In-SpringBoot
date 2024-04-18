package com.email.server.service;

import jakarta.mail.MessagingException;

public interface Emailservices
{

    public void emailsend(String to,String subject,String message);

    public  void Bulkemails(String[] to,String subject,String message);

    public void emailsendWithHTML(String to,String subject,String message) throws MessagingException;

    public boolean otpsend(String email);

//    public  boolean verify(String otp);
}

package com.ashu.service;


import jakarta.mail.MessagingException;

public interface EmailService {
    void sendEmailWithToken(String user, String link) throws MessagingException;
}

package com.ashu.service;

import com.ashu.modal.Invitation;
import jakarta.mail.MessagingException;

public interface InvitationService {

    public void sendInvitation(String email, Long projectId) throws MessagingException;

    public Invitation acceptInvitation(String token, Long UserId) throws Exception;

    public String getTokenByUserMail(String userMail);

    void deleteToken(String token);
}

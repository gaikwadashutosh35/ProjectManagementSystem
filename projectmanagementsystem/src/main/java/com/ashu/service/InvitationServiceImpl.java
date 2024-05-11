package com.ashu.service;

import com.ashu.modal.Invitation;
import com.ashu.repository.InvitationRepository;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InvitationServiceImpl implements InvitationService{
    @Autowired
    private InvitationRepository invitationRepository;

    @Autowired
    private EmailService emailService;
    @Override
    public void sendInvitation(String email, Long profileId) throws MessagingException {

        String invitationToken = UUID.randomUUID().toString();

        Invitation invitation = new Invitation();
        invitation.setEmail(email);
        invitation.setProjectId(profileId);
        invitation.setToken(invitationToken);

        invitationRepository.save(invitation);

        String invitationLink = "http://localhost:5173/accept_invitation?token="+invitationToken;
        emailService.sendEmailWithToken(email,invitationLink);

    }

    @Override
    public Invitation acceptInvitation(String token, Long UserId) throws Exception {
        Invitation invitation = invitationRepository.findByToken(token);

        if (invitation==null){
            throw new Exception("Invitation not found");
        }

        return invitation;
    }

    @Override
    public String getTokenByUserMail(String userMail) {
        Invitation invitation = invitationRepository.findByEmail(userMail);

        return invitation.getToken();
    }

    @Override
    public void deleteToken(String token) {
        Invitation invitation=invitationRepository.findByToken(token);

        invitationRepository.delete(invitation);
    }
}

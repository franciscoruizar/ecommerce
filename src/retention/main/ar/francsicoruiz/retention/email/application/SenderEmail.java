package ar.francsicoruiz.retention.email.application;

import ar.franciscoruiz.shared.domain.Service;
import ar.francsicoruiz.retention.email.domain.EmailSender;
import ar.francsicoruiz.retention.email.domain.Message;

@Service
public final class SenderEmail {
    private final EmailSender sender;

    public SenderEmail(EmailSender sender) {
        this.sender = sender;
    }

    public void send(Message message) {
        this.sender.send(message);
    }
}

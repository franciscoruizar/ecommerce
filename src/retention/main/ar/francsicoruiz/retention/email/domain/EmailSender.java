package ar.francsicoruiz.retention.email.domain;

public interface EmailSender {
    void send(Message message);
}

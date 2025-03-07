package fr.nexa.tp.email.with.design.pattern.strategy;

public class EmailService {

    private IEmailStrategy iEmailStrategy;

    public EmailService(IEmailStrategy iEmailStrategy) {
        this.iEmailStrategy = iEmailStrategy;
    }

    public void envoyer(String destinataire, String sujet, String contenu) {
        iEmailStrategy.envoyerEmail(destinataire, sujet, contenu);
    }

    public void setiEmailStrategy(IEmailStrategy iEmailStrategy) {
        this.iEmailStrategy = iEmailStrategy;
    }
}

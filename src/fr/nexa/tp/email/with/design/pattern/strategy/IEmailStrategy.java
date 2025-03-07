package fr.nexa.tp.email.with.design.pattern.strategy;

public interface IEmailStrategy {

    void envoyerEmail(String destinataire, String sujet, String contenu);
}

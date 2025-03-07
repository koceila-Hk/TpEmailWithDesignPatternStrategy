package fr.nexa.tp.email.with.design.pattern.strategy;

public class SendGridEmailStrategy implements IEmailStrategy {

    @Override
    public void envoyerEmail(String destinataire, String sujet, String contenu) {
        System.out.println("Envoie via SendGird : " + " à " + destinataire +" "+ sujet +" "+ contenu);
    }
}

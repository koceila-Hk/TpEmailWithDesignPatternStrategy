import fr.nexa.tp.email.with.design.pattern.strategy.EmailService;
import fr.nexa.tp.email.with.design.pattern.strategy.SendGridEmailStrategy;
import fr.nexa.tp.email.with.design.pattern.strategy.SmtpEmailStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmailService emailService = new EmailService(new SmtpEmailStrategy());

        // Envoie via SMTP
        emailService.envoyer("koko@gmail.com", "Bienvenue", "Merci pour votre inscription");

        // Envoie via sendGird
        emailService.setiEmailStrategy(new SendGridEmailStrategy());
        emailService.envoyer("koko@gmail.com", "Promo", "Profitez de nos offres");

    }
}
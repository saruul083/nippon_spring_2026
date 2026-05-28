package month03.week01.day03.backend;

public class EmailNotification extends Notification{
    String email;

    EmailNotification(String message, String recipient, String email) {
        super(message, recipient);
        this.email = email;
    }
    
    @Override
    void send() { 
        System.out.println("Email [" + email + "]-ruu: " + message);
    }
}

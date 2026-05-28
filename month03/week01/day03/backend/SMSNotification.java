package month03.week01.day03.backend;

public class SMSNotification extends Notification{
    String phone;

    SMSNotification(String message, String recipient, String phone) {
        super(message, recipient);
        this.phone = phone;
    }

    @Override
    void send() {
        System.out.println("SMS [" + phone + "]-ruu: " + message);;
    }
}


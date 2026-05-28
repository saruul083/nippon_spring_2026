package month03.week01.day03.backend;

public class Notification {
    String message;
    String recipient;

    Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }
    void send() {
        System.out.println("[Medegdel] " + recipient + "-ruu: " + message);
    }
}

package month03.week01.day03.backend;

public class PushNotification extends Notification {
    String appName;

    PushNotification(String message, String recipient, String appName) {
        super(message, recipient);
        this.appName = appName;
    }

    @Override
    void send() {
        System.out.println("Push [" + appName + "] app-aar: " + message);
    }
}

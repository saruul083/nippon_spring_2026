package month03.week01.day03.backend;

public class Main {
    public static void main(String[] args) {
        // Scorer[] scorers = { 
        //     new ExamScorer("Bataa", 85),
        //     new BonusScorer("Sarnai", 70, 15),
        //     new ExamScorer("Dorj", 92)
        // };

        // Scorer best = scorers[0];
        // for (Scorer s : scorers) {
        //     s.showResult();
        //     if (s.getScore() > best.getScore()) best = s;
        // }
        // System.out.println("Hamgiin undur: " + best.name + " (" + best.getScore() + ")");

        Notification[] notifications = {
            new EmailNotification("Hello", "Davga", "Davga@gmail.com"),
            new SMSNotification("Not Hello", "Not Davga", "94442563"),
            new PushNotification("Good Bye", "Uchral", "facebook"),
            new SMSNotification("See you tommoro", "Hundii", "93436833")
        };

        int count = 0;

        System.out.println("=== Medegdel ilgeej bna ===");
        for (Notification n : notifications) {
            n.send();
            count++;
        }
        System.out.println("\nNiit " + count + " Medegdel ilgeegdle.");
    }
}

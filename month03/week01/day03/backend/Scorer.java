package month03.week01.day03.backend;

public class Scorer {
    String name;
    Scorer(String name) {
        this.name = name;
    }

    int getScore() { return 0; }
    void showResult() {
        System.out.println(name + ": " + getScore() + " onoo");
    }
}

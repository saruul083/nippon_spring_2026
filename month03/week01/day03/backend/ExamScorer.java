package month03.week01.day03.backend;

public class ExamScorer extends Scorer{
    int score;

    ExamScorer(String name, int score) {
        super(name);
        this.score = score;
    }
    @Override
    int getScore() { return score; }
}

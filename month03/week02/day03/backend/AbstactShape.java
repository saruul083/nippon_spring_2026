package month03.week02.day03.backend;

public abstract class AbstactShape {
    private String color;

    public AbstactShape(String color) {
        this.color = color;
    }

    public abstract void area();

    public abstract void perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

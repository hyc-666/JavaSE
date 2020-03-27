package poker;

public class Card {
    private String points;//点数
    private String color;//花色

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Card(String points, String color) {
        this.points = points;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                 points  +
                "," + color +
                "}";
    }
}

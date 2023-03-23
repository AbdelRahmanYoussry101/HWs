public abstract class GeometriObject {
    private int sides;
    private String color;
    private boolean filled;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

}

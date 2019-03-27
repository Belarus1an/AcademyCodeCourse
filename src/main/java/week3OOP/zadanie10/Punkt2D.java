package week3OOP.zadanie10;

public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D() {
        x = 0;
        y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D { " + x + " " + y + " }";
    }
}

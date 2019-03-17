package week3OOP.zadanie10;

public class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D() {
        z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

package week3OOP.zadanie10;

public class TestPunkt {

    public static void main(String[] args) {

        Punkt2D punkt2D1 = new Punkt2D();
        Punkt2D punkt2D2 = new Punkt2D(5, 10);

        Punkt3D punkt3D1 = new Punkt3D();
        Punkt3D punkt3D2 = new Punkt3D(5, 5, 5);

        System.out.println(punkt3D1.getX() + " " + punkt3D1.getY() + " " + punkt3D1.getZ());
    }
}

package myTestDziedziczenie;

public class TestTransport {

    public static void main(String[] args) {

        Transport train = new Train(150, 300, 10, 10);
        Transport bus = new Bus(70, 120, 5, 35);
        Transport tram = new Tram(90, 0, 0, 2, 20);

        train.showInfo();
        System.out.println();
        bus.showInfo();
        System.out.println();
        tram.showInfo();
    }
}

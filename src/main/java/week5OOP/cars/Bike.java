package week5OOP.cars;

public class Bike extends VehicleConstructor implements Vehicle {

    private static final double COMSUMES = 2.4;

    public Bike() {
    }

    public Bike(String name, int wheels, String engine, int fuel) {
        super(name, wheels, engine, fuel);
    }

    @Override
    public void run(int distance) {

        double result = (double) distance / COMSUMES;
        System.out.println("run to" + result + " ");
    }

    @Override
    public void tank() {

        System.out.println("tank");
    }

    @Override
    public void stop() {

        System.out.println("stop");
    }
}

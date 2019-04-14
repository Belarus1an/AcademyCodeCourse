package week5OOP.cars;

public class Car extends VehicleConstructor implements Vehicle {

    private static final double COMSUMES = 2.4;

    public Car() {
    }

    public Car(String name, int wheels, String engine, int fuel) {
        super(name, wheels, engine, fuel);
    }

    @Override
    public void run(int distance) {

        double result = distance / COMSUMES;
        System.out.println("run to" + result + " ");
    }

    @Override
    public void tank() {

    }

    @Override
    public void stop() {

    }
}

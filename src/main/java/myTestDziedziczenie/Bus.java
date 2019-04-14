package myTestDziedziczenie;

public class Bus extends Transport {

    private int passengers;

    public Bus(double speed, double tankVolume, double fuelConsumption, int passengers) {
        super(speed, tankVolume, fuelConsumption);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Максимальное количество посажиров: " + getPassengers());
    }
}

package myTestDziedziczenie;

public class Tram extends Train {

    private int passengers;

    public Tram(double speed, double tankVolume, double fuelConsumption, int wagons, int passengers) {
        super(speed, tankVolume, fuelConsumption, wagons);
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
        System.out.println("Максимальное количество пассажиров: " + getPassengers() * getWagons());
    }
}

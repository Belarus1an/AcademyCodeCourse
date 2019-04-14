package myTestDziedziczenie;

public class Train extends Transport {

    private int wagons;

    public Train(double speed, double tankVolume, double fuelConsumption, int wagons) {
        super(speed, tankVolume, fuelConsumption);
        this.wagons = wagons;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Количество вагонов: " + getWagons());
    }
}

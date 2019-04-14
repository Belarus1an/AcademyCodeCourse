package myTestDziedziczenie;

public class Transport {

    private double speed;
    private double tankVolume;
    private double fuelConsumption;

    public Transport(double speed, double tankVolume, double fuelConsumption) {
        this.speed = speed;
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void showInfo(){
        System.out.println("Максимальная скорость: " + getSpeed() + " Емкость бака: " + getTankVolume()
        + " Расход топлива на км: " + getFuelConsumption());
    }
}

package myTestTanksPolygon;

public abstract class FightingMachine {

    private String name;
    private double speed;
    private double armor;
    private double attack;
    private int crew;

    FightingMachine(String name, double speed, double armor, double attack, int crew) {
        this.name = name;
        this.speed = speed;
        this.armor = armor;
        this.attack = attack;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

}

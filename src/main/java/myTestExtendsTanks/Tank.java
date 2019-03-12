package myTestExtendsTanks;

public abstract class Tank {

    private String name;
    private double speed;
    private double armor;
    private double attack;
    private int crew;

    public Tank(String name, double speed, double armor, double attack, int crew) {
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

    public void attack(Tank tank){
        if (attack > tank.getArmor()){
            System.out.println("Пробитие(Breaking through)");
        } else
            System.out.println("Не пробил(Not breaking through)");
    }
}

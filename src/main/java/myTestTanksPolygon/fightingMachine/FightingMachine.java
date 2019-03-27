package myTestTanksPolygon.fightingMachine;

public abstract class FightingMachine {

    private String name;
    private double vision; //обзор
    private int healthPoints; //уровень здоровья
    private int damage; //наносимый урон

    public FightingMachine(String name, double vision, int healthPoints, int damage) {
        this.name = name;
        this.vision = vision;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVision() {
        return vision;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static void battle (FightingMachine machine1, FightingMachine machine2){

        vision(machine1, machine2);
    }

    public void attack(FightingMachine machine) {

        int startHP = machine.getHealthPoints();
        int randomDamage = (int) ((getDamage() / 2) + Math.random() * (getDamage() / 2));
        machine.setHealthPoints(machine.getHealthPoints() - randomDamage);

        System.out.println(getName() + " --> " + machine.getName() + " "
                + startHP + "|" + machine.getHealthPoints() + " (-" + randomDamage + ")");
    }

    public static void vision(FightingMachine machine1, FightingMachine machine2) {

        if (machine1.getVision() > machine2.getVision()){
            machine1.attack(machine2);
        } else
            machine2.attack(machine1);

    }
}

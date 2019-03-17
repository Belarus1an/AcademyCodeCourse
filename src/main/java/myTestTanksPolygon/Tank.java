package myTestTanksPolygon;

import myTestTanksPolygon.taksInts.ITank;

public class Tank extends FightingMachine implements ITank {

    Tank(String name, double speed, double armor, double attack, int crew) {
        super(name, speed, armor, attack, crew);
    }

    @Override
    public void goTank() {

        System.out.println(getName() + " едет со скоростью - " + getSpeed());
    }

    @Override
    public void attackTank(FightingMachine tank) {

        if (getAttack() > tank.getArmor()){
            System.out.println("Пробил");
        } else
            System.out.println("Не пробил");
    }
}

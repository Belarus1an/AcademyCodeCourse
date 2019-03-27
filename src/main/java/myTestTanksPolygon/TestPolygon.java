package myTestTanksPolygon;

import myTestTanksPolygon.fightingMachine.Artillery;
import myTestTanksPolygon.fightingMachine.FightingMachine;
import myTestTanksPolygon.fightingMachine.Tank;

public class TestPolygon {

    public static void main(String[] args) {

        Tank tank1 = new Tank("T-34-85", 12, 1300, 150);
        Tank tank2 = new Tank("T-34", 10, 900, 90);

        Artillery artillery1 = new Artillery("СУ-100", 20, 1000, 200);

        //artillery1.attack(tank1);

        //FightingMachine.vision(artillery1, tank2);

        FightingMachine.battle(tank1, tank2);

    }
}

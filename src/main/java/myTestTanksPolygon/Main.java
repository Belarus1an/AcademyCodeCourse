package myTestTanksPolygon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Tank tankT3485 = new Tank("T-34-85", 22, 35, 42, 5);
        Tank tankTiger = new Tank("Tiger", 20, 48, 51, 5);

        List<Tank> tanks = new ArrayList<>();
        tanks.add(tankT3485);
        tanks.add(tankTiger);

        for (Tank tank: tanks){
            tank.goTank();
        }

        tankT3485.attackTank(tankTiger);
        tankTiger.attackTank(tankT3485);

    }
}

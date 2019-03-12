package myTestExtendsTanks;

public class Main {

    public static void main(String[] args) {

        Tank t3485 = new Tank_T3485("T-34-85", 55, 45, 85, 5);
        Tank tiger = new Tank_Tiger("Tiger", 44, 100, 88, 5);

        tiger.attack(t3485);
        t3485.attack(tiger);

    }
}

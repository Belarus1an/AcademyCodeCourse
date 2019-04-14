package onlineJavaBootcamp.laptop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("ASUS", 40);
        Laptop laptop2 = new Laptop("Samsung", 10);
        Laptop laptop3 = new Laptop("iMac", 50);
        Laptop laptop4 = new Laptop("ASER", 9);
        Laptop laptop5 = new Laptop("ASUS", 5);

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);

        for (Laptop value: laptopList){
            value.introduce();
        }
    }
}

package week3OOP;

import java.util.ArrayList;
import java.util.List;

public class TestMem {

    public static void main(String[] args) {

        Mem mem1 = new Mem();
        Mem mem2 = new Mem();
        Mem mem3 = new Mem();

        mem1.setNazwa("Dog");
        mem1.setUrl("www.MyDog");
        mem1.setOpis("My Dog");
        mem1.setLike(true);

        mem2.setNazwa("Cat");
        mem2.setUrl("www.Cat");
        mem2.setOpis("My Cat");
        mem2.setLike(true);

        mem3.setNazwa("car");
        mem3.setUrl("www.MyCar");
        mem3.setOpis("My car");
        mem3.setLike(false);

        List<Mem> myMem = new ArrayList<>();
        myMem.add(mem1);
        myMem.add(mem2);
        myMem.add(mem3);

        for (Mem value: myMem){
            if (value.getLike()) {
                System.out.println(value.getNazwa() + " " + value.getUrl());
            }
        }
    }
}

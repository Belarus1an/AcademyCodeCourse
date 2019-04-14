package week5OOP.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear("Yogi",200, 40);
        Tiger tiger = new Tiger("Toszka", 15, 10);
        Wolf wolf = new Wolf("Holer", 70, 40);
        Dog dog = new Dog("Scooby", 30);

        List<Animal> animals = new ArrayList<>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);

        for (Animal a: animals){
            System.out.print(a.getId() + " : ");
            a.introduce();
        }

        List<Cannie> cannieList = new ArrayList<>();
        cannieList.add(wolf);
        cannieList.add(dog);

        for (Cannie c: cannieList){
            if (c instanceof Animal){
                Animal a = (Animal) c;
                System.out.print("Ma name is " + a.getName() + " and I barking: ");
            }
            c.bark();

            if (c instanceof  Dog){
                Dog d = (Dog)c;
                d.sitPretty();
            }
        }
    }
}

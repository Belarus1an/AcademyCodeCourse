package week3OOP.car;

import java.util.ArrayList;
import java.util.List;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("BMW" , "X6" , 5000);
        Car car2 = new Car("Audi" , "A6" , 4500);
        Car car3 = new Car("Audi" , "100" , 1500);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        Car.showCar(carList);
    }
}

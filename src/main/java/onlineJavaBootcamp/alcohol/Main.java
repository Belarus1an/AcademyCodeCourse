package onlineJavaBootcamp.alcohol;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Alcohol> alcohols = new ArrayList<>();
        alcohols.add(new Alcohol("Beer", 0.05f));
        alcohols.add(new Alcohol("Vodka", 0.4f));
        alcohols.add(new Alcohol("Wine", 0.14f));
        alcohols.add(new Alcohol("Hooch", 0.7f));

        int wieght = 80;
        int quantity = 100;
    }
}

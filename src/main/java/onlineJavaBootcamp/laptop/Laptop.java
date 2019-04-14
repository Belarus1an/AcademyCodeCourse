package onlineJavaBootcamp.laptop;

public class Laptop {

    private String name;
    private int grade;

    public Laptop() {
    }

    public Laptop(String name, int price) {
        this.name = name;
        this.grade = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return grade;
    }

    public void setPrice(int price) {
        this.grade = price;
    }

    public void introduce(){

        String message = "I'm " + name + " and ";

        if (getPrice() < 10){
            System.out.println(message + "I'm very slow laptop");
        } else if (getPrice() >= 10 && getPrice() <= 30){
            System.out.println(message + "im ok laptop");
        } else
            System.out.println(message + "im gaming machine");
    }
}

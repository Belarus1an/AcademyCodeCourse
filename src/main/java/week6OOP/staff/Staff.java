package week6OOP.staff;

public abstract class Staff {

    private String name;
    private int salary;

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void getInfo(){
        System.out.println(name + " " + salary);
    }
}

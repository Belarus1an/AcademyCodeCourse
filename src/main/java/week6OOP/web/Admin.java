package week6OOP.web;

public class Admin implements IWebUser{

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

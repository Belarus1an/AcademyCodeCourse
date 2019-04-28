package week6OOP.web;

public class User implements IWebUser{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

package week6OOP.web;

public class Moderator implements IWebUser{

    private String name;

    public Moderator(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

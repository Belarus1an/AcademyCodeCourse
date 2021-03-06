package week3OOP.game;

import java.util.Collections;
import java.util.List;

public class Player {

    private String name;
    private String surname;
    private int points;

    public Player(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static void winner(List<Player> players){

        for (Player value1: players){
            if (value1.getPoints() >= 100){
                System.out.println("Winner - " + value1.getName() + " " + value1.getSurname());
            }
        }
    }
}

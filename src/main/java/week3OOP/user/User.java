package week3OOP.user;

import java.util.List;

public class User {

    private String userName;
    private String password;
    private String name;
    private String surname;

    public User(String userName, String password, String name, String surname) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public static void getAll(List<User> userList){

        for (User value: userList){
            System.out.println(value.getUserName());
        }
    }
}

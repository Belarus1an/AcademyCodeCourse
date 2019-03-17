package week3OOP.user;

import java.util.ArrayList;
import java.util.List;

public class TestUser {

    public static void main(String[] args) {

        User user1 = new User("Belarus1an", "12345qwe", "Pavel", "Samsonenka");
        User user2 = new User("AlexCool", "000qwe", "Jan", "Doks");
        User user3 = new User("PunksNotDead", "123Punk", "Tom", "Sik");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        User.getAll(userList);

    }
}

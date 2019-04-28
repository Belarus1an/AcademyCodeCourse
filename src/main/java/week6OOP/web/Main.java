package week6OOP.web;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IWebUser admin1 = new Admin("Admin1");
        IWebUser admin2 = new Admin("Admin2");
        IWebUser admin3 = new Admin("Admin3");
        IWebUser user1 = new User("User1");
        IWebUser user2 = new User("User2");
        IWebUser moderator1 = new Moderator("Moderator1");

        List<IWebUser> webUsers = new ArrayList<>();
        webUsers.add(admin1);
        webUsers.add(admin2);
        webUsers.add(admin3);
        webUsers.add(user1);
        webUsers.add(user2);
        webUsers.add(moderator1);
        for (IWebUser users: webUsers){
            System.out.println(users.getName());
        }
    }
}

package week2TabliceLatwe;

public class Task_01 {

    public static void main(String[] args) {

        String[] users = new String[4];
        users[0] = "Adam";
        users[1] = "Piotr";
        users[2] = "Anna";

        System.out.println(users[0]);
        System.out.println(users[3]);

        int index = 2;
        System.out.println(users[index]);

        System.out.println("----------------");

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        System.out.println("----------------");

        for (String value: users){
            System.out.println(value);
        }


    }
}

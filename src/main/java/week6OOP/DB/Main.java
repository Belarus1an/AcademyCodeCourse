package week6OOP.DB;

public class Main {

    public static void main(String[] args) {

        Main.connectDB(new DBOracle());

    }

    static void connectDB(IConnectDB iConnectDB){
        iConnectDB.connectDB();
    }
}

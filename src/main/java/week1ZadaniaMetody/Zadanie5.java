package week1ZadaniaMetody;

public class Zadanie5 {

    public static void main(String[] args) {

        System.out.println(test(6, 8, 11));

    }

    static boolean test(int a, int b, int c){

        if ((a * a) + (b * b) == (c * c)){
            return true;
        }

        return false;
    }
}

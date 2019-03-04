package week1ZadaniaMetody;

public class Zadanie10 {

    public static void main(String[] args) {

        maxStringLength("aaaa", "sad");
        maxStringLength("aaksadui", "aaa");

    }

    static void maxStringLength(String str1, String str2){

        int num1 = str1.length();
        int num2 = str2.length();

        if (num1 > num2){
            System.out.println("Max " + num1);
        } else
            System.out.println("Max " + num2);

    }
}

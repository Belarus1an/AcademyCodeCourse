package week1ZadaniaMetody;

public class Zadanie4 {

    public static void main(String[] args) {

        float result = divide(6, 4);
        System.out.println(result);

    }

    static float divide(float a, float b){

        float result = 0;

        if (b == 0){
            System.out.println("Error!");
        } else
            result = a / b;

        return result;
    }
}

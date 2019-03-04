package week1ZadaniaMetody;

public class Main {

    public static void main(String[] args) {

        int[] mas = new int[5];
        int sum = 0;
        int size = 0;

        for (int i = 0; i < mas.length; i++) {
            if (size != mas.length - 1){
            System.out.print((mas[i] = i) + " + ");
            sum += mas[i];
            size ++;
            } else
                System.out.print((mas[size] = i) + " = ");
        }

        System.out.println(sum);
    }
}

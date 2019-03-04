package week2TabliceLatwe;

public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println(Task6.sumRight(array, 1));
    }

    public static int sumRight(int[] array, int index){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (index < i){
                sum += array[i];
            }
        }
        return sum;
}}


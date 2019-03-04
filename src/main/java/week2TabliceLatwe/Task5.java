package week2TabliceLatwe;

public class Task5 {

    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 3;
        array[1] = 3;
        array[2] = 5;
        array[3] = 1;
        array[4] = 2;

        System.out.println(Task5.sumLeft(array, 2));

    }

    public static int sumLeft(int[] array, int index){

        int sum = 0;

        for (int i = 0; i < index; i++) {
            sum += array[i];
        }

        return sum;
    }


}

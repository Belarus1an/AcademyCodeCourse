package week2TabliceSrednie;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(end(array));
    }

    static int end(int[] array){
        return array[array.length - 1];
    }
}

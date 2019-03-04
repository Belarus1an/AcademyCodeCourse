package week2TabliceSrednie;

public class Task4 {

    public static void main(String[] args) {

        int[] array = new  int[]{1, 2, 3};

        System.out.println(sum(array));
    }

    static int sum(int[] array){
        return array[0] + array[array.length - 1];
    }
}

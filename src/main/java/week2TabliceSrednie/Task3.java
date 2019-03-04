package week2TabliceSrednie;

public class Task3 {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{4, 8};

        System.out.println(sum(array1));
        System.out.println(sum(array2));
    }

    static int sum(int[] array){
        return array[0] + array[1];
    }
}

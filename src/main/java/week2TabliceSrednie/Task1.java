package week2TabliceSrednie;

public class Task1 {

    public static void main(String[] args) {

        int[] array1 = new int[] {1,2,3,4};
        int[] array2 = new int[] {4,9,12,1};


        System.out.println(first(array1));
        System.out.println(first(array2));

    }

    static int first(int[] array){
        return array[0];
    }
}

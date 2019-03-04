package week2TabliceSrednie;

public class Task6 {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{1, 5};

        System.out.println(plusTwoArrays(array1, array2));

    }

    static int[] plusTwoArrays(int[] array1, int[] array2){
        
        int[] array = new int[array1.length + array2.length];

        for (int i = 0; i < array.length; i++) {
            if (i < array1.length){
                array[i] = array1[i];
            } else
                array[i] = array2[i];
        }

        return array;


    }
}

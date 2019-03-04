package week2TabliceSrednie;

public class Task5 {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 5, 3, 4};

    }

    public static int middleElemet(int[] array){

        if (array.length > 0){
            return array[(array.length - 1) / 2];
        } else {
            return -1;
        }
    }
}

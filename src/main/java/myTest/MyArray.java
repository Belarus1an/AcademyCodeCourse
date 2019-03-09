package myTest;

import java.util.concurrent.ExecutionException;

public class MyArray {

    private int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int[] sumArray(int[] array1, int[] array2){

        int[] sumArray = new int[array1.length];

        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] + array2[i];
            }
        } else
            throw new ArithmeticException();

        return sumArray;
    }
}

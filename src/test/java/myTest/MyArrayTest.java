package myTest;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayTest {

    @Test
    public void myArraySumTest(){

        MyArray myArray = new MyArray();

        int[] expected = {10, 15, 50};
        int[] arr1 = {5, 10, 25};
        int[] arr2 = {5, 5, 25};

        Assert.assertArrayEquals(expected, myArray.sumArray(arr1, arr2));
    }

    @Test(expected = ArithmeticException.class)
    public void myArrayExceptionTest(){
        MyArray myArray = new MyArray();

        int[] expected = {10, 15, 50};
        int[] arr1 = {5, 10, 25, 30};
        int[] arr2 = {5, 5, 25};

        Assert.assertArrayEquals(expected, myArray.sumArray(arr1, arr2));
    }
}

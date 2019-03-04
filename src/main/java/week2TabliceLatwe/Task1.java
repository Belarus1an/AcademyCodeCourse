package week2TabliceLatwe;

import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         int[] nums = new int[3];
        int sum = sum3(nums);
        System.out.println(sum);

    }

    static int sum3(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        return sum;
    }


}

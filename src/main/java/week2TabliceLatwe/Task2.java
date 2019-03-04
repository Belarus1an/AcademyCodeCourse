package week2TabliceLatwe;

public class Task2 {

    public static void main(String[] args) {

        int[] nums = new int[3];

        for (int result: nums){
            System.out.println(nums);
        }

    }

    static int[] makeLast(int[] nums) {

        int nums2[] = new int[nums.length * 2];
        nums2[nums2.length - 1] = nums.length;

        return nums2;
    }

}

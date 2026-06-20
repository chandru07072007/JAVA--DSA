package Leadcode_solution;

import java.util.Arrays;

public class problem1480 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] num = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (i == 0) {
                temp = nums[i];
                num[i] = temp;
            } else {

                temp = nums[i];
                int temp1 = num[i-1];
                int sum = temp+temp1;
                num[i] = sum;
            }

        }
        System.out.println(Arrays.toString(num));
    }
}

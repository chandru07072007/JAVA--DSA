package Leadcode_solution;

import java.util.Arrays;

public class problem1470 {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4};
        int n = 2;
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i <  n; i++) {

            x[i] = nums[i];

        }
        for (int j = 0; j <  n; j++) {
            y[j] = nums[n + j];
        }
        int[] ans = new int[nums.length];
        for (int z = 0; z < n; z++) {
            ans[2*z] = x[z];
            ans[2*z+1]=y[z];

        }
        System.out.println(Arrays.toString(ans));

    }
}

//https://leetcode.com/problems/shuffle-the-array/solutions/8346863/easy-java-solution-split-and-alternate-m-6499/


//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] x = new int[n];
//        int[] y = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            x[i] = nums[i];
//        }
//
//        for (int j = 0; j < n; j++) {
//            y[j] = nums[n + j];
//        }
//
//        int[] ans = new int[2 * n];
//
//        for (int z = 0; z < n; z++) {
//            ans[2 * z] = x[z];
//            ans[2 * z + 1] = y[z];
//        }
//
//        return ans;
//    }
//}
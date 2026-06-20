package Leadcode_solution;

import java.util.Arrays;

public class problem1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3},
                {2, 3, 4}};
        int[] max =new int[accounts.length];
        int add = 0;
        for (int i = 0; i < accounts.length; i++) {
            add =0;
            int[] temp = accounts[i];
            for (int j = 0; j < temp.length; j++) {

                 add += temp[j];


            }

            max[i] =add;



        }
        System.out.println(Arrays.toString(max));
        int max1= max[0];
        for (int i = 1; i < max.length; i++) {
            if(max[i]>max1){
                System.out.println(max[i]);
            }
            else{
                System.out.println(max1);
            }

        }

    }
}



//for leetcode

//class Solution {
//
//    public int maximumWealth(int[][] accounts) {
//
//        int[] max =new int[accounts.length];
//
//        int add = 0;
//
//        for (int i = 0; i < accounts.length; i++) {
//
//            add =0;
//
//            int[] temp = accounts[i];
//
//            for (int j = 0; j < temp.length; j++) {
//
//                add += temp[j];
//
//            }
//
//            max[i] =add;
//
//
//
//        }
//
//        int max1= max[0];
//
//        for (int i = 1; i < max.length; i++) {
//
//            if(max[i]>max1){
//
//                max1=max[i];
//
//            }
//
//        }
//
//        return max1;
//
//    }
//
//}
package Leadcode_solution;

import java.util.Arrays;

public class problem1389 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] index ={0,1,2,1};
        int shift =0;
        int[]  ans = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {

            for (int j = shift; j > index[i] ; j--) {
                ans[j] = ans[j-1];

            }
            System.out.println(shift);
           ans[index[i]] = arr[i];
            shift++;

        }
        System.out.println(Arrays.toString(ans));
    }
}

package Leadcode_solution;

import java.util.Arrays;

public class problem1732 {
    public void main(String[] args) {
        int[] arr = {1,2,3,4};
        int loop = arr.length+1;
        int[] ans =new int[loop];
        ans[0] =0;

        for (int i = 0; i < arr.length; i++) {

            ans[i+1] =ans[i]+arr[i];


        }
        System.out.println(Arrays.toString(ans));
        int max = ans[0];
        for (int j = 1; j < ans.length ; j++) {
            if(max<ans[j]){
                max = ans[j];
            }

        }
        System.out.println(max);


    }
}

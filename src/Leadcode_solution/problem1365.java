package Leadcode_solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class problem1365 {
    public void main(String[] args) {
        int[] arr = {4, 1, 2, 5};
        int max = 0;
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            max = arr[i];



            int cout = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max > arr[j]) {
                    cout++;
                }

            }


                ans[i] = cout;

            }
        System.out.println(Arrays.toString(ans));

        }


    }
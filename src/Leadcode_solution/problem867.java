package Leadcode_solution;

import java.util.Arrays;

public class problem867 {
    static void main(String[] args) {
        int[][] arr= {{1,2,3},{5,6,7},{2,4,6}};
        System.out.println(arr.length);
        System.out.println(Arrays.deepToString(arr));
        int[][] ans = new int[arr[1].length][arr.length];
        System.out.println(ans[1].length);
        for (int i = 0; i < arr[1].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                ans[i][j] = arr[j][i];

            }

        }
        System.out.println(Arrays.deepToString(ans));
    }
}

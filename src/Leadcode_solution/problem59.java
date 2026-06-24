package Leadcode_solution;

import java.util.Arrays;

public class problem59 {
    public static void main(String[] args) {

        int n = 3;
        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int right = n - 1;
        int left = 0;
        int num = 1;

        while (num <= n * n) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            left++;
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
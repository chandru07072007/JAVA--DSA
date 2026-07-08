package Leadcode_solution;

import java.util.Arrays;

public class problem1252 {

    public static void main(String[] args) {

        int m = 2;
        int n = 3;

        int[][] indices = {
                {0, 1},
                {1, 1}
        };


        int[][] matrix = new int[m][n];


        for (int i = 0; i < indices.length; i++) {

            int row = indices[i][0];
            int col = indices[i][1];


            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }


            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }


        System.out.println("Matrix:");
        System.out.println(Arrays.deepToString(matrix));


        int oddCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        System.out.println("Number of odd cells: " + oddCount);
    }
}



// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
        
//         int[][] matrix = new int[m][n];


//         for (int i = 0; i < indices.length; i++) {

//             int row = indices[i][0];
//             int col = indices[i][1];


//             for (int j = 0; j < n; j++) {
//                 matrix[row][j]++;
//             }


//             for (int j = 0; j < m; j++) {
//                 matrix[j][col]++;
//             }
//         }


      


//         int oddCount = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] % 2 != 0) {
//                     oddCount++;
//                 }
//             }
//         }
//   return oddCount;
        
//     }
  
//     }

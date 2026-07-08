package Leadcode_solution;

import java.util.Arrays;

public class problem1572 {
    static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}};
        int[][] arr1 = {{5}};

        System.out.println(Arrays.deepToString(arr));
        int length = arr.length;
        System.out.println(length);
//        if(length == 3){
//            int sum = arr[0][0]+arr[1][1]+arr[2][2]+ arr[0][2]+ arr[0][0]+arr[2][0];
//            System.out.println(sum);
//        }
//        if(length == 4){
//            int sum = arr[0][0]+arr[1][1]+arr[1][2]+ arr[2][1]+ arr[2][2]+arr[3][3]+arr[0][3]+arr[3][0];
//            System.out.println(sum);
//        }
//        if(length ==  1){
//           int  sum = arr[0][0];
//            System.out.println(sum);
     int ans =0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i][i];
            ans += arr[i][length - 1-i];

        }
        if(length%2 != 0){
            ans-= arr[length/2][length/2];

        }
        System.out.println(ans);
        }

    }

// # Intuition

// The matrix has two diagonals:

// - **Primary diagonal:** Elements where `row == column`.
// - **Secondary diagonal:** Elements where `row + column == n - 1`.

// We can traverse the matrix once and add both diagonal elements in each iteration. If the matrix size is odd, the center element belongs to both diagonals, so we subtract it once to avoid counting it twice.

// # Approach

// 1. Store the matrix size `n`.
// 2. Traverse from `0` to `n - 1`.
// 3. Add the primary diagonal element `arr[i][i]`.
// 4. Add the secondary diagonal element `arr[n - 1 - i][i]`.
// 5. If `n` is odd, subtract the center element `arr[n / 2][n / 2]`.
// 6. Return the final sum.

// # Complexity

// - **Time complexity:** `O(n)`
// - **Space complexity:** `O(1)`

// # Code

// ```java
// class Solution {
//     public int diagonalSum(int[][] arr) {
//         int length = arr.length;
//         int ans = 0;

//         for (int i = 0; i < length; i++) {
//             ans += arr[i][i];
//             ans += arr[length - 1 - i][i];
//         }

//         if (length % 2 != 0) {
//             ans -= arr[length / 2][length / 2];
//         }

//         return ans;
//     }
// }
// ```

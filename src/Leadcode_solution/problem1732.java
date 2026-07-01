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


// # Intuition
// The biker starts at altitude `0`. Each value in the `gain` array represents the change in altitude between two points. By continuously adding each gain to the previous altitude, we can determine the altitude at every point. While calculating these altitudes, we find the maximum altitude reached.

// # Approach
// 1. Create an array `ans` of size `gain.length + 1` to store the altitude at each point.
// 2. Initialize the starting altitude `ans[0] = 0`.
// 3. Traverse the `gain` array and calculate each new altitude using:
//    `ans[i + 1] = ans[i] + gain[i]`.
// 4. Traverse the `ans` array to find the maximum altitude.
// 5. Return the maximum altitude.

// # Complexity
// - **Time complexity:** `O(n)`
//   - One pass to calculate altitudes and another pass to find the maximum altitude.

// - **Space complexity:** `O(n)`
//   - An additional array of size `n + 1` is used to store all altitudes.

// # Code
// ```java
// class Solution {
//     public int largestAltitude(int[] gain) {

//         int[] ans = new int[gain.length + 1];
//         ans[0] = 0;

//         for (int i = 0; i < gain.length; i++) {
//             ans[i + 1] = ans[i] + gain[i];
//         }

//         int max = ans[0];

//         for (int i = 1; i < ans.length; i++) {
//             if (max < ans[i]) {
//                 max = ans[i];
//             }
//         }

//         return max;
//     }
// }
// ```

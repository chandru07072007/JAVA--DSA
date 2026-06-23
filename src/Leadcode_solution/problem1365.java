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





//  leadcode solution  https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/8354192/leetcode-1365-java-brute-force-solution-5tjrt



// # Intuition
// For each element in the array, count how many numbers are smaller than it. By comparing the current element with every other element, we can determine the number of smaller elements and store the count in the answer array.

// # Approach
// 1. Create an answer array `ans` of the same size as the input array.
// 2. Traverse each element `nums[i]`.
// 3. For every `nums[i]`, compare it with all elements `nums[j]`.
// 4. If `nums[i] > nums[j]`, increment the count.
// 5. Store the count in `ans[i]`.
// 6. Return the answer array.

// # Complexity
// - Time complexity:
//   - $$O(n^2)$$
//   - Two nested loops are used to compare each element with every other element.

// - Space complexity:
//   - $$O(n)$$
//   - An additional array of size `n` is used to store the result.

// # Code
// ```java
// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] ans = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;

//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] > nums[j]) {
//                     count++;
//                 }
//             }

//             ans[i] = count;
//         }

//         return ans;
//     }
// }

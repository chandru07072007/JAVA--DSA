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


//https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/8354390/1389-create-target-array-in-the-given-or-fluu
// # Intuition
// To build the target array, each element from `nums` must be inserted at the position specified by `index`. If that position is already occupied, the existing elements need to be shifted one step to the right to make room for the new element.

// # Approach
// 1. Create an array `ans` of the same size as `nums`.
// 2. Maintain a variable `size` representing the number of elements currently inserted.
// 3. For each element `nums[i]`:
//    - Shift all elements from position `size - 1` down to `index[i]` one position to the right.
//    - Place `nums[i]` at `ans[index[i]]`.
//    - Increment `size`.
// 4. Return the resulting array.

// # Complexity
// - Time complexity:
//   - $$O(n^2)$$
  
//   In the worst case, each insertion may require shifting all previously inserted elements.

// - Space complexity:
//   - $$O(n)$$
  
//   An additional array of size `n` is used to store the result.

// # Code
// ```java
// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {

//         int[] ans = new int[nums.length];
//         int size = 0;

//         for (int i = 0; i < nums.length; i++) {

//             for (int j = size; j > index[i]; j--) {
//                 ans[j] = ans[j - 1];
//             }

//             ans[index[i]] = nums[i];
//             size++;
//         }

//         return ans;
//     }
// }


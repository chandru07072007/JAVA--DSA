package Leadcode_solution;

public class problem1295 {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = 0;
        int even =0;

        for (int i = 0; i < arr.length; i++) {
            ans = arr[i];
            int count =0;
           while (ans > 0){
               ans = ans/10;
              count++;


            }

            if(count%2 == 0){
                even++;
            }

        }
        System.out.println(even);
    }
}

// Intuition
// To find out how many numbers have an even number of digits, we need to inspect each number in the array individually. A straightforward way to determine the digit count of any number is to repeatedly divide it by 10 until it becomes zero, counting how many divisions it takes. If that total count is divisible by 2, we know the number has an even number of digits.

// Approach
// Initialize a counter even to keep track of how many numbers satisfy the condition.
// Iterate through each element of the input array arr.
// For each element, store its value in a temporary variable ans and initialize a digit count to 0.
// Run a while loop that continuously divides ans by 10 (integer division) and increments count until ans drops to 0.
// After the loop finishes, check if count % 2 == 0. If it is, increment our even counter.
// Once all numbers are processed, return the even count.
// Complexity
// Time complexity: O(n×d), where n is the number of elements in the array and d is the maximum number of digits in a number. Since the problem constraints usually limit the maximum value (e.g., 10 
// 5
//  ), d is small and constant (at most 6 digits), making the time complexity practically linear, O(n).
// Space complexity: O(1) as we only use a few primitive variables (ans, even, count, i) which consume a constant amount of memory regardless of the input size.
// Code
// class Solution {
//     public int findNumbers(int[] arr) {
//         int ans = 0;
//         int even = 0;

//         for (int i = 0; i < arr.length; i++) {
//             ans = arr[i];
//             int count = 0;
//             while (ans > 0) {
//                 ans = ans / 10;
//                 count++;
//             }
           
//             if (count % 2 == 0) {
//                 even++;
//             }
//         }
//         return even;
//     }
// }

package Leadcode_solution;

import java.util.ArrayList;
import java.util.List;

public class problem1431 {
    public static void main() {

        int[] candies = {12, 3, 12};
        int extraCandies = 10;
        List<Boolean> ans = new ArrayList<>();

        int max = candies[0];
        for (int i = 0; i < candies.length;i++){
            int candy = candies[i] + extraCandies;
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            System.out.println(candy + extraCandies >= max);
            ans.add(candy + extraCandies >= max);
        }

    }
}


//
//Java | Find Maximum + Compare with Extra Candies | O(n) Time | O(n) Space

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> ans = new ArrayList<>();
//
//        int max = candies[0];
//        for (int candy : candies) {
//            if (candy > max) {
//                max = candy;
//            }
//        }
//
//        for (int candy : candies) {
//            ans.add(candy + extraCandies >= max);
//        }
//
//        return ans;
//    }
//}
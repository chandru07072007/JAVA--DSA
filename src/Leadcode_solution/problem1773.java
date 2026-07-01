package Leadcode_solution;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem1773 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer","silver","lenovo"));
        items.add(List.of("phone","gold","iphone"));
        System.out.println(items);

//        String rootkey = in.next();
//        System.out.println(rootkey);
//        String rulevalue = in.next();
//        System.out.println(rulevalue);

        String rootkey = "colour";
        String rulevalue = "silver";
        String ele = "";
//        int j = items.toArray().length;
//        System.out.println(j);
        int[] arr = new int[items.toArray().length];
        int indextomatc = 0;
        if(rootkey.equals("colour")){
            indextomatc = 1;
        }
           else if (rootkey.equals("type")) {
            indextomatc = 0;

        }
        else   {
            indextomatc = 2;

        }
//        System.out.println(indextomatc);
int count =0;
        for (int i = 0; i < items.size(); i++) {

                List<String> row = items.get(i);

                ele = row.get(indextomatc);
                if(ele.equals(rulevalue)){
                    count++;
                }
            System.out.println(count);
//


        ele = row.get(j);

        }


    }
}






// # Intuition
// The problem asks us to count how many items match a given rule. Each item has exactly three properties structured as `[type, color, name]`. Instead of searching through every single property of every item, my first thought was to find out exactly which column position (0, 1, or 2) the `ruleKey` corresponds to. Once that index is determined, we can directly jump to that specific column for every item, which avoids unnecessary nested loops and saves processing time.

// # Approach
// 1. **Identify the Column Index:** We map the input `ruleKey` to its designated index position in the inner list:
//    - If `ruleKey` is `"type"`, we check index `0`.
//    - If `ruleKey` is `"color"` (or `"colour"`), we check index `1`.
//    - If `ruleKey` is `"name"`, we check index `2`.
// 2. **Iterate Through Items:** Use a single loop to travel down the rows of the 2D `List`. 
// 3. **Direct Extraction & Comparison:** For each item (row), extract the element located strictly at our pre-calculated column index using `row.get(indextomatc)`. Compare this string to `ruleValue` using the `.equals()` method.
// 4. **Update Counter:** If the string values match perfectly, increment the `count` by 1. Return the final `count` after processing all items.

// # Complexity
// - **Time complexity:** $$O(n)$$
//   We only iterate through the list of items exactly once, where n is the total number of items in the `items` list. Inside the loop, extracting an element from the sublist and performing a string comparison takes $$O(1)$$ constant time.

// - **Space complexity:** $$O(1)$$
//   The algorithm performs the operations in place. It only allocates memory for a few primitive tracking variables (`indextomatc` and `count`), which requires constant extra space regardless of the input list size.

// # Code
// ```java []
// import java.util.List;

// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         // Step 1: Map the rule key to its precise list index
//         int indextomatc = 0;
//         if (ruleKey.equals("color") || ruleKey.equals("colour")) {
//             indextomatc = 1;
//         } else if (ruleKey.equals("type")) {
//             indextomatc = 0;
//         } else {
//             indextomatc = 2;
//         }

//         int count = 0;
        
//         // Step 2: Traverse through the 2D list row by row
//         for (int i = 0; i < items.size(); i++) {
//             List<String> row = items.get(i);

//             // Step 3: Extract the targeted property directly
//             String ele = row.get(indextomatc);
            
//             // Step 4: Increment count if the value matches the rule
//             if (ele.equals(ruleValue)) {
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }
// ```

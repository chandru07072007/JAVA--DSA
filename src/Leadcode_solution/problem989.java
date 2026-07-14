package Leadcode_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class problem989 {
    public void main(String[] args) {
        int[] arr = {1,2,5,6};
        int value = 0;
        int add = 43;
      int divi = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                value = value * 10 + arr[i];
            }

            System.out.println(value); 
value+=add;
        System.out.println(value);
        int count=0;
        divi = value;
       while (value >0){
           value=value/10;
           count++;
       }
       int a =0;
        for (int z = 0; z < count; z++) {

           a = divi%10;
divi=divi/10;
            arr1.add(a);
        }
        System.out.println(arr1);

        Collections.reverse(arr1);
        System.out.println(arr1);

    }

}





// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans = new ArrayList<>();
//         for (int i = num.length - 1; i >= 0; i--) {
//             int sum = num[i] + k;
//             ans.add(sum % 10);
//             k = sum / 10;
//         }
//         while (k > 0) {
//             ans.add(k % 10);
//             k /= 10;
//         }
//         Collections.reverse(ans);
//         return ans;
//     }
// }







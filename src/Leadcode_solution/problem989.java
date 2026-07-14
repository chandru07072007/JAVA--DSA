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

            System.out.println(value); // 1256
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







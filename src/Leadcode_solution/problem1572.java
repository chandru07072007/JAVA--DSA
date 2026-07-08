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
            ans += arr[length - 1-i][i];

        }
        if(length%2 != 0){
            ans-= arr[length/2][length/2];

        }
        System.out.println(ans);
        }

    }

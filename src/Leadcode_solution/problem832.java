package Leadcode_solution;

import java.util.Arrays;

public class problem832 {
    static void main(String[] args) {
        int[][] arr  = {{1,0,0},{0,0,0},{0,0,0}};
        int[][] ans  = new int[arr[1].length][arr[1].length];

        String st = "";
        int [] arr1 = new int[arr[1].length];
        int [][] rev = new int[arr[1].length][arr[1].length];

        for (int i = 0; i < arr.length; i++) {
            st = Arrays.toString(arr[i]);
            System.out.println(st.length());
            arr1=arr[i];
            System.out.println(Arrays.toString(arr[i]));
            int z =0 ;

            for (int j = arr.length-1; j>=0; j--) {

            if(arr[i][j]==1){
                rev[i][z]= 0;
            }
            else {
                rev[i][z] = 1;
            }
            z++;

            }




        }
        System.out.println(Arrays.deepToString(rev));
    }
}

// class Solution {
//     public int[][] flipAndInvertImage(int[][] arr) {
        
      

     
      
//         int [][] rev = new int[arr[0].length][arr[0].length];

//         for (int i = 0; i < arr.length; i++) {
          
//             int z =0 ;

//             for (int j = arr.length-1; j>=0; j--) {

//             if(arr[i][j]==1){
//                 rev[i][z]= 0;
//             }
//             else {
//                 rev[i][z] = 1;
//             }
//             z++;

//             }




//         }
//         return rev;

//     }
// }

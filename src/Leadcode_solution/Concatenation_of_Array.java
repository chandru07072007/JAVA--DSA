package Leadcode_solution;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int[] arr1 = {5,2,3,4};
        int[] arr2  = {1,2,3,4};
        int[] arr3 = new int[8];

        for (int i = 0; i <arr1.length; i++) {
            arr3[i]=arr1[i];
            arr3[4+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
}
}

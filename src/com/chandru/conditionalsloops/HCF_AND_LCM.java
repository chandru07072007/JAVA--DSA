package com.chandru.conditionalsloops;

import java.util.Arrays;
import java.util.Scanner;

public class HCF_AND_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int[] arr = new int[3];
        for (int i = 0; i <=2; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("values are: "+ Arrays.toString(arr));
int hcf = HCF(HCF(arr[0],arr[1]),arr[2]);
        System.out.println("HCF:"+hcf);
int lcm = ((arr[0]*arr[1])*arr[2]/hcf);
        System.out.println("LCM:"+lcm);
    }

    private static int HCF(int i, int i1) {
        while (i1!=0) {
            int temp = i1;
            i1 = i % i1;
            i = temp;
        }
        return i;

    }
}

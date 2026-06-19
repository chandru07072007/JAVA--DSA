package com.chandru.conditionalsloops;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] point1 = new int[2];
        int[] point2 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the value "+i+" two point");
            point1[i] = in.nextInt();
            point2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(point1));
        System.out.println(Arrays.toString(point2));
        int two = twopoints(point1[0],point1[1],point2[0],point2[1]);
        System.out.println("distance between two points"+two);
    }

    private static int twopoints(int x1, int x2, int y1, int y2) {
        int fromula ;
        fromula = (int) Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));// type casting
        return  fromula;

    }
}

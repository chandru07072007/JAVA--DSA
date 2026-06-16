package com.chandru;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        // input
        Scanner in = new Scanner(System.in);
        //fromula
        //Simple Interest (SI)= P+R+T/100

//
//        P is the principal amount (the initial sum of money)
//
//        R is the annual interest rate (in percentage)
//
//        T is the time period (in years)
        System.out.print("Enter the principal value=");
        int principal = in.nextInt();
        System.out.print("Enter the annual interest rate=");
        int R = in.nextInt();
        System.out.print("Enter the time period=");
        int T = in.nextInt();
        int Simple_Interest = (principal+R+T)/100;
        System.out.println("interest=" + Simple_Interest);



    }
}

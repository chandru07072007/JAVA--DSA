package com.chandru;

import java.util.Scanner;

import static java.lang.Integer.sum;
import static javax.management.Query.div;

public class calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = in.nextInt();
        System.out.print("Enter second number :");
        int b = in.nextInt();
        int c = 3;//manual input
        switch (c){
            case 1:{
                sum(a,b);
                break;
            }
            case 2:{
                sub(a,b);
                break;
            }

            case 3:{
                mut(a,b);
                break;
            }
            case 4:{
                div(a,b);
                break;
            }


        }



    }

    static void mut(int a, int b) {
        System.out.println("muit="+ a*b);
    }

    static void sub(int a, int b) {
        System.out.println("sub="+ (a-b));
    }

    static void div(int a, int b) {
        System.out.println("div="+ a/b);
    }

    static void sum(int a, int b) {
        System.out.println("sum ="+ (a+b));
    }
}
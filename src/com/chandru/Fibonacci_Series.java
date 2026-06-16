package com.chandru;

import java.util.Scanner;


public class Fibonacci_Series {
    // 0 1 1 2 3 5.....[output]
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int first = in.nextInt();
        System.out.print("Enter 2nd number :");
        int sec = in.nextInt();
        System.out.print("Enter how many time loop:");
        int cout = in.nextInt();
        fibo(first,sec,cout);


    }

    static void fibo(int first, int sec, int cout) {
        System.out.print(""+first+" "+sec);
        for (int i = 0; i < cout; i++) {
            int add = first+sec;
            System.out.print(" "+ add);
            first = sec;
            sec = add;

        }



    }
}

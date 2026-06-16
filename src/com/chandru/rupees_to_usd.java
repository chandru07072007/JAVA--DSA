package com.chandru;

import java.util.Scanner;

public class rupees_to_usd {
    public static void main(String[] args) {
        //fromula
        // usd = inr/ex_rate
        //inr = usd*ex_rate
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice (usd to rupee) or (rupee to usd) : ");
        int change = in.nextInt();
        switch (change){
            case 1:{
                System.out.print("Enter the  rupee value");
                int rupee = in.nextInt();
                System.out.print("Enter the exchange rate");
                int ex = in.nextInt();
                System.out.println("rupee = "+ rupee+"₹");
                Rs(rupee,ex);
            }
            case 2:{
                System.out.print("Enter the  usd value");
                int usd = in.nextInt();
                System.out.print("Enter the exchange rate");
                int ex = in.nextInt();
                System.out.println("usd = "+ usd+"$");

                usd(usd,ex);
            }

        }


    }

     static void Rs(int rupee,int ex) {
        int usd =  rupee/ex;
         System.out.println("Rate of usd :"+ usd +"$");

    }

    static void usd(int usd,int ex) {
        int Rs =  usd*ex;
        System.out.println("Rate of rupee :"+ Rs +"₹");
    }

}

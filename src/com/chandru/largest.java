package com.chandru;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a = in.nextInt();

        System.out.print("Enter the 2nd number:");
        int b = in.nextInt();
        System.out.print("Enter the 3rd number:");
        int c = in.nextInt();
        System.out.print("Enter the two or three:");
        int d = in.nextInt();
        switch (d){
            case 2:{
                two(a,b);
                break;
            }
            case 3:{
                three(a,b,c);
                break;
            }
        }

    }

    static void three(int a, int b, int c) {
        int max = a;
        if(a>b||a>c){
            max = a;
        }

        if(b>c||b>a){
            max=b;
        }
        if(c>b||c>a){
            max=c;
        }
        System.out.println("max ="+ max);


    }

    static  void two(int a,int b){
        if(a>b){
            System.out.println("max a"+ a);
        }
        else{
            System.out.println("max "+ b);
        }

    }

}

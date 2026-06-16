package com.chandru;

import java.util.Scanner;



public class Armstrong_Number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int c= in.nextInt();
        switch (c){
            case 1:{
                System.out.print("Value :");
                String a = in.next();

                manual(a);
                break;
            }
            case 2: {
                System.out.print("start :");
                int start = in.nextInt();
                System.out.print("end :");
                int end  =  in.nextInt();
                int cout=String.valueOf(start).length() ;
                System.out.println("count :"+cout);

                interval(start, end,cout);
                break;
            }
            }
    }

     static void interval(int start, int end,int count) {
        // using the reminder method

        for (int i = start; i <= end ; i++) {
            int temp = i;
            int final_value=0;
            while (temp >0){
                int digit = temp % 10;
                final_value += (int) Math.pow(digit,count);
                temp = temp / 10;
            }
            if(i==final_value){
                System.out.println(i);
            }
        }
            }

     static void manual(String a) {
        //using  the  string method
        int add = 0;
        for (int i = a.length()-1; i >= 0; i--) {
            int rev = a.charAt(i)-'0';
            // type casting so  (int) '1','2'....
            add += (int) Math.pow(rev,3);
        }
        System.out.println(add);
    }

        }





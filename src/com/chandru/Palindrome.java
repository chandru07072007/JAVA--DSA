package com.chandru;

import javax.swing.text.Segment;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = in.next();
//        System.out.println(name);
        palindrome(name);

    }

     static void palindrome(String name) {
       String rev = "";
       for (int i = name.length()-1; i >=0 ; i--) {
             rev= rev + name.charAt(i);

         }

       if(name.equals(rev)){
           System.out.println("palindrome");
       }else {
           System.out.println("Not");
       }
     }
}

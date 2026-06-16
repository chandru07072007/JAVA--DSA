package com.chandru;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hello");
        System.out.println("Enter you name");
        Object name = in.next();
        System.out.println("thanks you  "+ name);

    }
}

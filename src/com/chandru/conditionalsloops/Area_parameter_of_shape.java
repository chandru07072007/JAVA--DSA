package com.chandru.conditionalsloops;
//Area Of Circle Java Program",
//        "Area Of Triangle",
//        "Area Of Rectangle Program",
//        "Area Of Isosceles Triangle",
//        "Area Of Parallelogram",
//        "Area Of Rhombus",
//        "Area Of Equilateral Triangle",

import java.util.Scanner;

public class Area_parameter_of_shape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float pi = 3.14f;
        System.out.print("Enter the question number :");
        int c= in.nextInt();

        switch (c){
            case 1:{
                Area_Of_Circle_Java_Program(pi);
                break;
                }
            case 2:{
                Area_Of_Triangle_Java_Program(pi);
                break;
            }
            case 3:{
                Area_Of_Rectangle_Program(pi);
                break;
            }
            case 4:{
                Area_Of_Isosceles_Triangle(pi);
                break;
            }
            default:{
                next();
            }


        }
    }

    private static void next() {
        System.out.println("next all learning formula");

    }

    static void Area_Of_Isosceles_Triangle(float pi) {
    //formula for Isosceles_triangle
        Scanner in = new Scanner(System.in);
        System.out.print("a = length of equal side :");
        int a = in.nextInt();
        System.out.print(" b = breath :");
        int b = in.nextInt();
       // A=b/4*((4a^2-b^2));
        // a = length of equal side
        // b = breath
          float ans;
        ans = (float) (b *Math.sqrt(4*a*a-b*b))/4;
        System.out.println("Area_Of_Isosceles_Triangle :"+ans);

    }

    static void Area_Of_Rectangle_Program(float pi) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the heigh  :");
         int h = in.nextInt();
         System.out.print("Enter the breath  :");
         int b = in.nextInt();

         double ans = b*h;// bh
         System.out.print("Area_Of_Triangle :"+ ans);

    }

    static void Area_Of_Circle_Java_Program(float pi) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the radius :");
         int R = in.nextInt();
         double ans = pi*R*R;
         System.out.print("Area_Of_Circle :"+ ans);
    }
    static void Area_Of_Triangle_Java_Program(float pi) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the heigh  :");
        int h = in.nextInt();
        System.out.print("Enter the breath  :");
        int b = in.nextInt();

        double ans = 0.5*b*h;//1/2bh
        System.out.print("Area_Of_Triangle :"+ ans);
    }
}

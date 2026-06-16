package Leadcode_solution;

import java.util.Scanner;

public class problem1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = subtractProductAndSum(n);
        System.out.println(b);
    }
    // this only leadcode solution
     static int subtractProductAndSum(int n) {

         int sum = 0;
        int product=1;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            product*=temp;
            n=n/10;
        }
        int i = product - sum;
        
        return i;


    }

    }


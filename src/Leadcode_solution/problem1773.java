package Leadcode_solution;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem1773 {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer","silver","lenovo"));
        items.add(List.of("phone","gold","iphone"));
        System.out.println(items);

//        String rootkey = in.next();
//        System.out.println(rootkey);
//        String rulevalue = in.next();
//        System.out.println(rulevalue);

        String rootkey = "colour";
        String rulevalue = "silver";
        String ele = "";
//        int j = items.toArray().length;
//        System.out.println(j);
        int[] arr = new int[items.toArray().length];
        int indextomatc = 0;
        if(rootkey.equals("colour")){
            indextomatc = 1;
        }
           else if (rootkey.equals("type")) {
            indextomatc = 0;

        }
        else   {
            indextomatc = 2;

        }
//        System.out.println(indextomatc);
int count =0;
        for (int i = 0; i < items.size(); i++) {

                List<String> row = items.get(i);

                ele = row.get(indextomatc);
                if(ele.equals(rulevalue)){
                    count++;
                }
            System.out.println(count);
//

//if(rootkey.equals("type")) {
//
//    for (int j = 0; j < row.size(); j++) {
//        ele = row.get(0);
//        if (ele.equals("phone")) {
//            count++;
//        }
//    }
//}
//    if(rootkey.equals("colour")){
//        for (int j = 0; j < row.size(); j++) {
//            ele = row.get(j);
//            if (ele.equals("silver")) {
//                count++;
//            }
//        }
//
//            }
//            System.out.println(ele);
//            System.out.println(count);
//
        }


    }
}

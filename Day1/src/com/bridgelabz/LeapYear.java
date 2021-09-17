package com.bridgelabz;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = cs.nextInt();
        if (((year % 4 == 0) && (year % 100!=0)) || (year %400 ==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}


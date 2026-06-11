package com.shubham;

import  java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: find the largest of the 3 numbers

//        if(a > b && a > c) {
//            System.out.println("Largest number : " + a);
//        }else if(b > a && b > c) {
//            System.out.println("Largest number : " + b);
//
//        }else {
//            System.out.println("Largest number : " + c);
//
//        }

        // other method

//        int max = a;
//
//        if(b > max) {
//            max = b;
//        }
//        if(c > max) {
//            max = c;
//        }

        // another method
//        int max = 0;
//
//        if(a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        // another one

        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);

    }
}

package com.shubham;

import java.util.Scanner;

public class Switch{
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if(fruit.equals("mango")) {
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        }

        // for avoiding repeated code we use switch

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//
//        }

        // new formate

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
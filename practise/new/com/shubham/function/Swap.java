package com.shubham.function;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;
//        swap(a, b);

//        System.out.println(a + " " + b);

        String name = "Shubh";
        changeName(name);
        System.out.println(name);
    }

//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//
//    }

    static  void changeName(String naam) {
        naam = " Shubham "; // creating a new object

    }
}

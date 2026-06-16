package com.shubham.function;

public class Overloading {
    public static void main(String[] args) {

        fun(76);
        fun("Shubham Tiwari");

    }
    static void  fun(int a) {
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

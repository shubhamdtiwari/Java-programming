package com.shubham.function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(marks); we cannot access marks here
    }

    static void random (int marks) {
        int num = 67;
    }
}

package com.shubham.function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(marks); we cannot access marks here

        {
//               int a = 56; we cannot initialise the same int which is already initilised
                a = 44;  // but we can modify it
            int c = 99;

                // value initialized in this block will remain in same block
        }

//        System.out.println(c); cannot use outside the block

        System.out.println(a);
    }

    static void random (int marks) {
        int num = 67;
    }
}

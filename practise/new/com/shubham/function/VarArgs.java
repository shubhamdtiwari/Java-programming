package com.shubham.function;

import java.sql.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 54, 45,23);
        multiple(2, 3, "kunal", "Shubham");
    }


    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

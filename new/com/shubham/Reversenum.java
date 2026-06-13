package com.shubham;

public class Reversenum {
    public static void main(String[] args) {

        int n = 12345;

        int res = 0;

        while(n > 0) {
            int rem = n % 10;
            n /= 10;

            res = res * 10 + rem;

        }

        System.out.println(res);
    }
}

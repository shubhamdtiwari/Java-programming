package com.shubham;

import java.util.Scanner;

public class Loops {
   public static void main() {
       // print number from 1 to 5

//       System.out.println("Hello world");
//       System.out.println("Hello world");
//       System.out.println("Hello world");
//       System.out.println("Hello world");
//       System.out.println("Hello world");

       /*
            Syntax of for loops:

            for(initialisation; condition; increment/decrement) {
            // body
            }

               */

       // Q: Print numbers from 1 to 5
//       for(int num =1; num <= 5; num++) {
//           System.out.println(num);
//       }
//
       // print numbers from 1 to n

//       Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//
//       for (int i = 0; i <= n; i++) {
//          System.out.println(i + " ");
//           System.out.println("Hello world");
//       }

       // while loops
       /*
       Syntax:
       while(condition) {
        // body
        }
        */

       int num = 1;

//       while(num <= 5) {
//           System.out.println(num);
//           num ++;
//       }
       // if we dont know how amny times the loop has to go on then we use while

       // do while

       /*

       do {
       } while(condition)
        */

       int n = 1;
       do {
           System.out.println(n);
       } while (n < 5);

       // when we must run for the first time then use do while loop
   }

}

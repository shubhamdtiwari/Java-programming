package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
  public  static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];

    arr[0] = 23;
    arr[1] = 213;
    arr[2] = 223;
    arr[3] = 233;
    arr[4] = 243;
    // [23, 213, 223, 233, 243]
    System.out.println(arr[3]);

    // input using for loops
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }


    System.out.println(Arrays.toString(arr));

//    for (int i = 0; i < arr.length; i++) {
//      System.out.println(arr[i] + " ");
//    }

//    for (int num : arr) { // for every element in array, print the element
//      System.out.println(num + " "); // here num represents element of the array
//    }

//    System.out.println(arr[5]); // index out of bound error




    }
}

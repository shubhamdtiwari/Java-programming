package Assignments;

import java.util.Scanner;

public class AreaCricle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

    //    double AreaCricle = 3.14 * radius * radius;

    //    System.out.println(AreaCricle);
    System.out.println(AreaCricle(radius));


    }

// using function method
    static double AreaCricle(double radius) {
        return 3.14 * radius * radius;
    }
  
}

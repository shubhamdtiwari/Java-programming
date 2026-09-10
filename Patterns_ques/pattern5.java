package Patterns_ques;

// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

public class pattern5 {
    public static void main(String[] args) {
        p5(5);

    }

    static void p5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }

        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

}

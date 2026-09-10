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
        otherp5(5);

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

    static void otherp5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

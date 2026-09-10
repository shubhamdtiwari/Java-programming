package Patterns_ques;

// *
// **
// ***
// ****
// *****

public class pattern2 {
    public static void main(String[] args) {
        p2(4);

    }

    static void p2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

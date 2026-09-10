package Patterns_ques;

// *****
// ****
// ***
// **
// *   

public class pattern3 {
    public static void main(String[] args) {
        p3(5);
    }

    static void p3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

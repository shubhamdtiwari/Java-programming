package Patterns_ques;

public class pattern1 {
    public static void main(String[] args) {
        p1(5);

    }

    static void p1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

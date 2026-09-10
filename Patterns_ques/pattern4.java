package Patterns_ques;

public class pattern4 {
    public static void main(String[] args) {
        p4(5);
    }

    static void p4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

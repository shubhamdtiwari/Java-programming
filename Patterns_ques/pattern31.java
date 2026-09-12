package Patterns_ques;

public class pattern31 {

    public static void main(String[] args) {
        p31(4);
    }

    // 4 4 4 4 4 4 4
    // 4 3 3 3 3 3 4
    // 4 3 2 2 2 3 4
    // 4 3 2 1 2 3 4
    // 4 3 2 2 2 3 4
    // 4 3 3 3 3 3 4
    // 4 4 4 4 4 4 4

    static void p31(int n) {
        int orgn = n;
        n = 2 * n;

        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - 1; col++) {
                int atEveryIndex = orgn - Math.min(Math.min(row, col), Math.min(n - col - 2, n - row - 2));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    // 4 4 4 4 4 4 4 4 4
    // 4 3 3 3 3 3 3 3 4
    // 4 3 2 2 2 2 2 3 4
    // 4 3 2 1 1 1 2 3 4
    // 4 3 2 1 0 1 2 3 4
    // 4 3 2 1 1 1 2 3 4
    // 4 3 2 2 2 2 2 3 4
    // 4 3 3 3 3 3 3 3 4
    // 4 4 4 4 4 4 4 4 4

    static void otherp31(int n) {
        int orgn = n;
        n = 2 * n;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = orgn - Math.min(Math.min(row, col), Math.min(n - col, n - row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}

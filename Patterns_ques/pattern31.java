package Patterns_ques;

// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4 

public class pattern31 {
    public static void main(String[] args) {
        otherp31(4);
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

        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - 1; col++) {
                int atEveryIndex = orgn - Math.min(Math.min(row, col), Math.min(n - col - 1, n - row - 1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}

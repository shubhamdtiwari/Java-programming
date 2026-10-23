package Recursion;

public class fiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFor(i));
        }
    }

    static int fiboFor(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}

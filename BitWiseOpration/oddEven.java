package BitWiseOpration;

public class oddEven {
    public static void main(String[] args) {
        int a = 74;

        System.out.println(isOdd(a));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}

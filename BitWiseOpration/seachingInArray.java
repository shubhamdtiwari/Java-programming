package BitWiseOpration;

public class seachingInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 3, 2, 4 };
        System.out.println(ans(arr));

    }

    static int ans(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}

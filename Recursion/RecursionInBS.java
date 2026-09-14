package Recursion;

public class RecursionInBS {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 77, 88, 98 };
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    // we choose s and e as an argument b/c it will be need in the upcoming
    // recursion and m as a body function as we only need it in particular function
    // call
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);

    }
}

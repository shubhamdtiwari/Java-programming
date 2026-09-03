package DSA_topics.SortingAlgo;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1, 7, 10, 9, 6, 8, 11 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

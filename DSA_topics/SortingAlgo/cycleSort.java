package DSA_topics.SortingAlgo;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr) {

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp
    }
}

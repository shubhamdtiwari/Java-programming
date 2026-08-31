package DSA_topics.SortingAlgo;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 7, 8, 1, 1, 33, 31 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // static void bubble(int[] arr){
    // boolean swapped;
    // // run the steps n-1 times

    // for(int i = 0; i < arr.length; i++){
    // swapped = false;
    // // for each step, max item will come at the last respective index

    // for (int j = 1; j < arr.length - i; j++) {
    // // swap if the item is smaller than previous item

    // if(arr[j] < arr[j -1]){
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }

    // // if you did not swap for a particular value of i, it means the array is
    // sorted hence stop the program

    // if(!swapped){
    // break;
    // }
    // }
    // }
}
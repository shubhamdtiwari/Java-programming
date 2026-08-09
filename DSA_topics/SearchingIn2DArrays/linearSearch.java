package DSA_topics.SearchingIn2DArrays;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };

    int target = 34;

        int[] ans = search(arr, target); // formate of return value {row, col}
        System.out.println(Arrays.toString(ans));
       
    }



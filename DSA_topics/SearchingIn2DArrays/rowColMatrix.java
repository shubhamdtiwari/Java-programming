package DSA_topics.SearchingIn2DArrays;

import java.lang.reflect.Array;

public class rowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int [] ans = (search(arr, 39));
        for(int el : ans){
            System.out.println(el);
        }
        
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}

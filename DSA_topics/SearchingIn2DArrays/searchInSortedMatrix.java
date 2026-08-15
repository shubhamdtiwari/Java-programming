package DSA_topics.SearchingIn2DArrays;

public class searchInSortedMatrix {
    public static void main(String[] args) {
        
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rstart = 0;
        int rEnd = rows - 1;

        int cMid = cols / 2;

        // run the loop till 2 rows are remaining 
        while(rstart < (rEnd - 1)){
            // while this is true it will have more than 2 rows

            int mid = rstart + (rEnd - rstart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rstart = mid;
            }else {
                rEnd = mid;
            }
        }

        // now we have two rows

        // cheak wheather the target is in the col of 2 rows
        if(matrix[rstart][cMid] == target) {
            return new int[]{rstart, cMid};
        }
        

    }
}

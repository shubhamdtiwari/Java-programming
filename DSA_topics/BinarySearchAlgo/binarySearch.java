package DSA_topics.BinarySearchAlgo;

public class binarySearch {
    
    public static void main(String[] args) {
        int[] arr = {-18,-14,-7,-4,2,3,5,7,8,9,34,67,78,90};
        int target = 8;
        int ans = binarySearching(arr, target);
        System.out.println(ans);
        
    }

    //return the index
    // return -1 if it does not exit
    static int binarySearching(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // maybe (start + end) exceed the range of int in java
            int mid = start + (end - start) / 2; // better way to calc mid

            if( target < arr[mid]) {
                end = mid - 1;
            }else if( target > arr[mid]) {
                end = mid + 1;
            }else {
                return mid;
            }
            
        }
        return -1;
    }
}

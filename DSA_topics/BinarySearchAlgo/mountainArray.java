package DSA_topics.BinarySearchAlgo;

public class mountainArray {
    public static void main(String[] args) {

        
        
    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }
        
    

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + ( end - start) / 2;

            if(arr[mid + 1] < arr[mid]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
       return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int s, int e) {
       


        // find whether the array is sorted in ascending and decending order
        boolean isAsc = arr[s] < arr[e];

         while (s <= e) {
            // find the middle element
            // int mid = (start + end) / 2;
            // maybe (start + end) exceed the range of int in java
            int mid = s + (e - s) / 2; // better way to calc mid
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                  if( target < arr[mid]) {
                    e = mid - 1;
                 }else {
                    s = mid + 1;
                 }
                }else {
                if( target > arr[mid]) {
                    e = mid - 1;
                 }else {
                    s = mid + 1;
                }
            }
         }
         return -1;

    }
}

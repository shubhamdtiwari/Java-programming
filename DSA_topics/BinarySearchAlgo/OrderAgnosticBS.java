package DSA_topics.BinarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    int[] arr = {3,4, 5, 8,13,24,56,78,87};
    int target = 78;
    System.out.println(orderAgnosticBS(arr, target));
        
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;


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

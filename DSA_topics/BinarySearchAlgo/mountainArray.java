package DSA_topics.BinarySearchAlgo;

public class mountainArray {
    public static void main(String[] args) {

        
        
    }

    int search(int[] arr){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, )

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
       
    }

    static int bimarysearch(int[] arr, int target)
}

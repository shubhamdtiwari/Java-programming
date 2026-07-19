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

    

    }
}

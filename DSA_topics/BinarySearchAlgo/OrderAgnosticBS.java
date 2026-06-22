package DSA_topics.BinarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    int[] arr = {3,4, 5, 8,13,24,56,78,87};
    int target = 78;
    System.out.println(OrderAgnosticsBS(arr, target));
        
    }
    static int OrderAgnosticsBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if(e > s) { // incresing

            while( e > s) {
                int mid = s + (s - e) / 2;

                if(arr[mid] > target) {
                    e = mid - 1;
                }else if( arr[mid] < target) {
                    s = mid + 1;
                }else{
                    return mid;
                }

            }
        }else if(e < s) {
            while( e >= s) {
                int mid = s + (s - e) / 2;

                if(arr[mid] > target) {
                    e = mid + 1;
                }else if( arr[mid] < target) {
                    s = mid - 1;
                }else {
                    return mid;
                }
        }
    }
    return -1;
    
}
}

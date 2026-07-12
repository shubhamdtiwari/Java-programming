package DSA_topics.BinarySearchAlgo;

public class floorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 17, 18};
        int target = 1;

        int ans = floorNum(arr, target);
        System.out.println(ans);
    }

    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

         // if the target element is less than the less number in the array

        if(target < arr[0]){
            return -1;
        }

        // floor number means number less than or equal to the given number

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else if(target == arr[mid]){
                return target;
            }

        }

        return arr[end];
    }
}

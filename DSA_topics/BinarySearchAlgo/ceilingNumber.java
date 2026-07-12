package DSA_topics.BinarySearchAlgo;

public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 17, 18};
        int target = 15;

        int ans = ceilingNum(arr, target);
        System.out.println(ans);
    }

    static int ceilingNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        

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

        return arr[start];
    }

}

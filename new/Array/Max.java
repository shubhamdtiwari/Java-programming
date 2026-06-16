package Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr, 1, 2));
    }


    // work on edge cases here, like array being null
    static int max(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

//            static int max(int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
    }
}

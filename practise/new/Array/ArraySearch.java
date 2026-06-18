package Array;

public class ArraySearch {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1 , 3, 3, 27, 34, 67};
        int target = 7;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for(int index = 0; index < arr.length; index++) {
            // cheak for element at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        
        }
        return -1;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}
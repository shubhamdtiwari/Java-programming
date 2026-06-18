package DSA_topics;

public class ArraySearch {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1 , 3, 3, 27, 34, 67};
        int target = 7;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // saerch the target and return true or flase
 static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for(int element : arr) {
            if(element == target) {
                return true;
            }
        }
        return false;
    }  

    // saerch the target and return the element
 static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for(int element : arr) {
            if(element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
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
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}
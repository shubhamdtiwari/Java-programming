package Assignments;

public class practise {

public static void main(String[] args) {
    int[] arr = {1, 23, 43, 45, 67, 54};
    int target = 43;
    System.out.println(searchAlgo(arr, target));
}

static int searchAlgo(int[] arr, int target) {
    if(arr.length == 0) {
        return -1;
    }

    for (int index = 0; index < arr.length; index++) {
        // int element = arr[index];
        if(arr[index] == target) {
            return index;
        }
        
    }
    return -1;
}
    
}

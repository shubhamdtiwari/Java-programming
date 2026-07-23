package DSA_topics.BinarySearchAlgo;

public class rotatedArraywithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2, 2};

        System.out.println(pivot(arr));

    }

     static int pivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int m = s + (e - s) / 2;

            if(m < e && arr[m] > arr[m + 1]){
                return m;
            }
            if(m > s && arr[m] < arr[m - 1]){
                return m - 1;
            }
            if(arr[m] <= arr[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
    }
}

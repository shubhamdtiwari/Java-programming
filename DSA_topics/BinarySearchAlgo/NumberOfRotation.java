public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotation(arr));
        
    }

    private static int countRotation(int[] arr){
        int pivot = pivot(arr);
        return pivot + 1;
    }

    static int pivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int m = s + ( e - s) / 2;

          if(m < e && arr[m] > arr[m + 1]){
                return m + 1;
            }
            if(m > s && arr[m] < arr[m - 1]){
                return m;
            }
            if(arr[m] <= arr[s]){
                e = m - 1;
            }else{
                s = m + 1;
            }

        }
        return -1;
    }

    static int pivotwhenDuplicate(int[] arr){
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

            // if element at middle , start and end are equal then just skip the duplicates
            if(arr[m] == arr[s] && arr[m] == arr[e]){
                //skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // cheak if start is pivot
                if(arr[s] > arr[s + 1]){
                    return s;
                }
                s++;
                // cheak wheather end is pivot
                if(arr[e] < arr[e - 1]){
                    return e - 1;
                }
                e--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])){
                s = m + 1;
            }else {
                e = m - 1;
            }
        
        
        }
            return -1;
    }
}

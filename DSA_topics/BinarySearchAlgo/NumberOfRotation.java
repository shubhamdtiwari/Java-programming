public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};

        int ans = rotationCount(arr);
        System.out.println(ans);
    }

    static int rotationCount(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int m = s + ( e - s) / 2;

            if(arr[m] > arr[m + 1] && arr[m] < arr[m - 1]){
                return m;
            }

            
        }
        return -1;
    }
}

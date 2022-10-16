import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int [] arr= {-3,6,2,1,5};
        selecting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selecting(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i-1;
            int max = getMax(arr,0,last);
            swap(arr,max, last);
        }

    }

    static int getMax(int [] arr, int start, int end){
        int max = 0;
        for (int i = 0; i <= end; i++) {   // -----> Most Common Mistake is not putting = sign on i<= end
            if (arr[max] < arr[i]){       // -----> Here I was taking arr[start] instead of arr[i]
                max = i;
            }
        }
        return max;
    }


    static void swap (int []arr, int first , int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

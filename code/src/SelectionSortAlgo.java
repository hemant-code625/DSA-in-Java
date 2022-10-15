import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String [] args){
        int[] arr = {4,5,6,3,1,2};
        searching(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void searching (int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMax(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap (int[]arr, int first , int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first]= temp;

    }


    static int getMax(int[]arr, int start, int end){
        int max = start;

        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;

    }
}

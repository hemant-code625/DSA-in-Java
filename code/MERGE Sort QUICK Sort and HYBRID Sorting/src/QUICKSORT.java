import java.util.Arrays;

public class QUICKSORT {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;                                    //pivot
        while (s <= e) {

            while (arr[s] < arr[mid]) {
                s++;
            }
            while (arr[e] > arr[mid]) {
                e--;
            }
            //this condition ensure that if array is already sorted then no need to swap
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct position please sort two halves now
        quickSort(arr, low, e);
        quickSort(arr, s, high);

    }
}

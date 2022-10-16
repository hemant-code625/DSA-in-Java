import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[]arr = {0,3,-4,2,-5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        // run steps n-1 times

        for (int i = 0; i < arr.length ; i++) {
            // for each step max item will be at last respective index

            for (int j = 1; j <= arr.length - i - 1; j++) {

                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){

                    swap(arr,j,j-1);

                }

            }

        }
    }


    static void swap(int []arr, int first, int second){
        int temp = arr[second];
        arr[second]= arr[first];
        arr[first] = temp;
    }
}
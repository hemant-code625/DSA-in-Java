import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr= {5,4,8,2,-3,10};
        selectionSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int []arr, int r, int c){
        if(r==0){                                                 //BASE CONDITION for recursion
            return;
        }
        if(c<r){
            //Find the largest number in that array


            //swap arr[i] with arr[c] (i.e las index value of array)

            selectionSort(arr, r, c+1);

        }
        else{
            selectionSort(arr, r-1, 0);
        }

        }

}

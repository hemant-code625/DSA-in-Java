
public class SelectionSort {
    public static void main(String[] args) {
        int []arr= {5,4,8,2,-3,10};
//        int[]arr={5,4,3,2,1};
        selection(arr, arr.length,0,0);              //arr.length instead of arr.length-1
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int []arr, int r, int c, int max){
        if(r==0){                                                 //BASE CONDITION for recursion
            return;
        }
        if(c < r){
            //Find the largest number in that array
            if(arr[c]> arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);    //max value is passed forward so to find the max value from the enitre row
            }
        }
        else{
            //swap arr[i] with arr[c] (i.e las index value of array)
            int temp = arr[r-1];        // swap with (row-1)th element not cth element
            arr[r-1] = arr[max];
            arr[max] = temp;

            //new row is called
            selection(arr, r-1, 0,0);
        }

    }

}

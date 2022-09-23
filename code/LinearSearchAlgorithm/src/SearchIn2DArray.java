import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr= new int[][] {                        // not mandatory to put new int[][]arr in 2d arrays
                {24, 14, 7},
                {18, 12, 3,9},
                {78,99,34,56 },
                {18,12}
        };
        Scanner in = new Scanner(System.in);
        int target =in.nextInt();
        int[]ans = search(arr,target);               //format of ans
            System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));


    }
    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;

    }




}

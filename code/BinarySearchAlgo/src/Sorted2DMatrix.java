import java.util.Arrays;

public class Sorted2DMatrix {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,6)));

    }
    //search in the row provided
    static int[] binarySearch(int[][]matrix,int row, int cStart, int cEnd, int target){
        int mid = cStart+(cEnd-cStart)/2;
        while(cStart<=cEnd){
            if(matrix[row][mid]== target){
                // target column is found
                return new int[]{row,mid};
            }
            if(matrix[row][mid] > target){
                cStart = mid+1;
            }else{
                cEnd= mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][]matrix, int target){
        int rows= matrix.length;
        int cols = matrix[0].length; //be cautious, matrix may be empty

        if(rows==1){
            return binarySearch(matrix, 0,0, cols-1,target);
        }
// run the loop till two rows are remaining
        // condition for two rows remaining is when (Starting row = Ending Row - 1)
        // therefore, we put the while loop for Starting row < Ending row -1 so that loop runs till 2 rows are left

        int rStart= 0;
        int rEnd = rows-1;
        int cMid = cols-1;

        while(rStart <(rEnd -1) ){    //Will be true when have more than 2 rows
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix [mid][cMid]== target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
//WhileLoop ended

        }
        //Now we have left with 2 rows
        //check whether the target is in the col of 2 rows
        if(matrix [rStart][cMid]== target){
            return new int []{rStart, cMid};
        } if (matrix[rStart+1][cMid]== target){
            return new int[]{rStart+1, cMid};
        }

        // we will check in 1st half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1, target);
        }
        //2nd haf
        if (target >= matrix[rStart][cMid-1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);

        }
        //3rd half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart+1,0,cMid-1,target);

        }
        //4th half
        else{
            return binarySearch(matrix, rStart+1,cMid+1,cols-1, target);

        }

    }

}

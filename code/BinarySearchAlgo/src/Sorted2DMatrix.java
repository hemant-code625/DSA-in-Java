import java.util.Arrays;

public class Sorted2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1, 2, 3,4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}

        };

        System.out.println(Arrays.toString(search(matrix,60)));

    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows ==1){
            return BinarySearch(matrix, 0,0,cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
         //The below loop will run till two rows will be remained

        while(rStart< (rEnd-1)){
            int mid = rStart+(rEnd -rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd= mid;
            }
            if(matrix[mid][cMid] < target){
                rStart= mid;
            }
            //Now we have 2 rows
            //check whether the target is in the column of 2 rows

            if(matrix[rStart][cMid] == target){
                return new int[]{rStart,cMid};

            } if (matrix [rStart+1][cMid] == target ){
                return new int[]{rStart+1, cMid};
            }
            //Search in 1st Half
            if(target <= matrix[rStart][cMid-1]){
                return BinarySearch(matrix, 0,0,cMid-1, target);
            }
            //Search in 2nd Half
            if(target <= matrix[rStart+1][cMid-1] ){
                return BinarySearch(matrix, 1, 0, cMid-1, target);
            }
            //Search in 3rd Half
            if(target>= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
                return BinarySearch(matrix, rStart, cMid+1, cols -1, target);
            }
            //Search in 4th Half
            else{
                return BinarySearch(matrix, rStart+1, cMid+1, cols-1, target);
            }

        }
        return new int[]{-1,-1};
    }
    static int[] BinarySearch(int[][]matrix,int row, int cStart, int cEnd ,int target){



        while(cStart <= cEnd){
            int mid= cStart +(cEnd +cStart)/2;          // mid for rows not cMid

            if(matrix [row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]< target){
                cStart = mid+1;
            }
            if(matrix[row][mid]> target){
                cEnd = mid-1;

            }
        } return new int[]{-1,-1};
    }

}

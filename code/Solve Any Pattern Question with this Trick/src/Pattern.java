public class Pattern {
    public static void main(String[] args) {
        /*
        No. Of Steps
        1. Run the outer 'for loop' for the no of times you have to print lines/rows
        2. Identify for every row no,
           *How many cols are there?
           *Type of elements in cols
        3. What do you need to print in that pattern?

         */
        pattern5(5);




    }
    static void pattern1(int n ){

        for (int row = 1; row <= n; row++) {          //Step 1
            // for every row run col
            for (int col = 1; col <= n; col++) {    //Step2
                System.out.print("*");             //Step 3
            }
            //When one row is printed we need a new line
            System.out.println();

        }
    }
    static void pattern2(int n ) {
        for (int row = 1; row <= n; row++) {          //Step 1
            // for every row run col
            for (int col = 1; col <= row; col++) {    //Step2
                System.out.print("*");             //Step 3
            }
            //When one row is printed we need a new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                int a = col;
                System.out.print(a);

            }
            System.out.println();

        }
    }
    static void pattern5(int n ){
        for (int row = 1; row <= 2*n-1; row++) {
            int TotalCols = row > n ? 2*n - row : row;
            for (int col = 1; col <= TotalCols ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }







}

public class DigiSum {
    public static void main(String[] args) {
        System.out.println(sum(352));
    }

    //This is recursive function

    static int sum(int n){
        if (n ==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }


    /*
    This is not recursive function rather a while loop problem...

    static int sum(int n ){
        int s =0;
        while(n>0){
            int rem = n%10;
            s = s + rem;
            n = n/10;
        }
        return s;
    }

     */



}

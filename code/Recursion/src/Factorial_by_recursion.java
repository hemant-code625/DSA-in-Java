public class Factorial_by_recursion {
    public static void main(String[] args) {
        // write a recursive function for finding factorials

        System.out.print(fact(7));
        System.out.print(sum( 5));
    }
    static int fact(int a){
        if(a <=1){
            return 1;
        }
        return a* fact(a-1);

    }
    static int sum(int n){
        if (n <=1){
            return 1;
        }
        return n + sum(n-1);
    }
}

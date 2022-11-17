import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(IsPrime(63));
    }
    static boolean IsPrime(int n){
        int c =2;
        while(c*c <= n) {

            if(c % n ==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}

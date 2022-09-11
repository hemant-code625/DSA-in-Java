public class Questions {
    public static void main(String[] args) {

        // Finding the Armstrong number
        for (int i = 100; i < 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i +" ");
            }

        }
    }
    static boolean isArmstrong(int i){
        int original = i;
        int sum=0;
        while (i>0) {
            int rem = i%10;
            i=i/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

    }

}
//Finding prime numbers using function/methods

// int n = in.nextInt();
//  System.out.println(isPrime(n));


      /*  static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c =2;
        while (c*c <= n){
            if (n%c==0) {
                return false;
            }
            c++;

        }
        return c*c > n;


    }
     */




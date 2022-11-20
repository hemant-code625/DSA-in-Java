public class Reverse {
    public static void main(String[] args) {
        int ans = revMethod1(12304);
        System.out.println(ans);


    }
    static int sum =0;
    static int revMethod1(int n ){
        if (n ==0){
            return n;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        revMethod1(n/10);
        return sum;
    }

}

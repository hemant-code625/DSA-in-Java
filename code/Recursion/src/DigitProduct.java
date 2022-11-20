public class DigitProduct {
    public static void main(String[] args) {

        System.out.println(pro(1345));
    }
    static int pro(int n){
        if(n <=1){
            return 1;
        }
        return (n%10) * pro(n/10);
    }

}

public class EvenDigitQuestion {
    public static void main(String[] args) {
        int[] num= {17,28,3,8,789};
        System.out.println(findNumber(num));

        System.out.println(digits(234234));

    }

    static int findNumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
    return count;

    }
    //counting no of digits in a number
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    // whether counting digits are even or not
    static boolean even (int NoOfDigits ){
        /*
        if(NoOfDigits % 2 ==0){
            return true;
        }
        return false;
         */
        return NoOfDigits % 2 == 0;

    }
}

public class MathClass {
    public static void main(String[] args) {

        //Math Class
        /*
        1. Math.max(x,y)      only two numbers can be passed
        2. Math.min(x,y)
        3. Math.random()     return a random value from range (0.1, 1.0)
        4. Math.sqrt(num)
        5. Math.pow(x,y)     x^(y)
        6. Math.log(x)       return the logarithm of x
        7. Math.log10(x)     return the log when base is 10
        8. Math.log1p(x)     return the log (x+1)
        9. Math.exp(x)       return e^x
        10.Math.expm1(x)     return e^x -1
        

         */
        System.out.println(Math.max(123,444));
        System.out.println(Math.min(123,444));
        System.out.println(Math.random());                // this value is in the form of long
        System.out.println((int)(Math.random()*100));     // since int value from (0.1 ,1.0) is always 0 thus we multipiled 100

    }
}

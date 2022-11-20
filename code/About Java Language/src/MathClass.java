public class MathClass {
    public static void main(String[] args) {

        //Math Class
        /*
        1. Math.max()
        2. Math.min()
        3. Math.random() :- it returns a random value from range (0.1, 1.0)

         */
        System.out.println(Math.max(123,444));
        System.out.println(Math.min(123,444));
        System.out.println(Math.random());                // this value is in the form of long
        System.out.println((int)(Math.random()*100));     // since int value from (0.1 ,1.0) is always 0 thus we multipiled 100

    }
}

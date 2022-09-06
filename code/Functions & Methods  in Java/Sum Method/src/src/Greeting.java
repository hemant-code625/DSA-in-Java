import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greetings();

        int ans= sum2();
        System.out.println(ans);

        }
    static void greetings(){
        System.out.println("Namaste Coders");    // Here we have printed when greetings (function) is called



    }

    //We will now see how to get the value when a function is called

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;                            // This value of the sum is returned out of the Function or Method
    }


}

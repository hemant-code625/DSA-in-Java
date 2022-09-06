import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        // Q: Take two input integer and print their sum.
 /*
        Scanner in = new Scanner(System.in);


        int num1, num2, sum;
        System.out.println("Enter number1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The Sum is " +sum);

         */

        // Writing the same code for 100 times we need to create a Method or Function.


        /*
        Syntax
        access modifier (we'll look it in OOP) return_typename(){
                 //body
                 return statement;
                 }
         */

        sum(); //calling the function or Method
        sum(); // we can call this as many time as possible

    }

    static void sum(){                          // Here we are creating a Method (i.e return_type(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The Sum is " +sum);

    }


}

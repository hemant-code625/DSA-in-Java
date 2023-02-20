package com.hemant.exceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        int a = 5;
        int b =0;

        String name = "Hemant";
        if (name.equals("Hemant")){
            throw new MyException("use name other than Hemant");
        }

        try{
//            int c = a/b;
            divide(a ,b);

        }catch(Exception e) {

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute even if exception is catched or not");
        }
    }
    static int divide (int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");   //we can explicitly throw a new message
        }
        return a/b;
    }
}

//throws keyword is used just to say that it may throw an exception
//throw keyword is used to actually say that if exception comes then what to show
//finally is used to run a code even if any exception comes which may restrict other codes to run
//try and catch is used as shown above.
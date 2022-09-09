public class Shadowing {
    static int x = 99;
    public static void main(String[] args) {
        fun1();

        int x = 30;         // the class variable at 4 is shadowed at line 6
        /*
        THIS MEANS WE CAN INITIALISE SAME VARIABLE (here, "x") IF IT'S SCOPE IS OVERLAPPING = Shadowing
         */
        System.out.println(x); // 30

        fun2();
    }
    static void fun1(){
       int x = 60;
        System.out.println(x);
    }
    static void fun2(){

        /*
          int x;                        //declaration of variable
          System.out.println(x);         // variable x might not have been initialised
          x= 60;                        // actual initialisation
         */
        System.out.println(x);
    }



}


public class Scope {
    public static void main(String[] args) {
        int a = 34;
        int b = 55;
      //  System.out.println(num);  //num Cannot be assigned outside the function - random
        // we cannot initialise the same variable again in the function, for eg

      //  int a = 10; // error because a is already assigned in the same function
        // we can change the value of the reference variable as


        { //Function 1
            a = 20; // NOT Initialised the variable rather just reassigned the value of "a" reference, which will be seen outside the function also
            int c= 100;
            // values initialised in this block will remain in this block
            System.out.println(c);
            System.out.println(a);

        }

        System.out.println(a); // can be seen outside the function.
        System.out.println(a+","+b) ;

        {
            //Function 2

            //Scoping in loops
            for (int i = 0; i < 100; i+=10) {
                int num = 100;
                System.out.println(i);
            }
            // System.out.println(num); //num is not assigned outside loop's scope

        }

        { //Function 3


        }


    }

    static void random (int marks){
        int num = 67;
        System.out.println(num);

    }


}

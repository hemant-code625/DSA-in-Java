public class swap {
    public static void main(String[] args) {
      
        int a = 10;
        int b = 40;
        // Swapping numbers
        /* int temp = a;
        a = b;
        b = temp;
        System.out.println( a +" "+ b );

        */

        //Swapping of numbers using Function
        swap(a ,b);
        System.out.println(a +" "+b);

        //How function works in string
        String name="Hemant Singh Parmar";

        ChangeName(name);

        System.out.println(name);
//        System.out.println(naam);  // Will not work and show error because naam will be printed only in that function where it is defined.

    }

    static void ChangeName(String naam){
        naam = "Rahul Rana";    //Here new object is created for same copy of reference variable called naam. Therefore, when we print name; object referred to naam will not be printed.

        System.out.println(naam); //First code will go into function and print Rahul Rana and then will return to the ChangeName function.

    }


    static void swap (int a, int b){
        int temp = a ;
        a =b ;
        b= temp ;
    }


}

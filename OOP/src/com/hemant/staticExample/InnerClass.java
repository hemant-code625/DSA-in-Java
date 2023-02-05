package com.hemant.staticExample;

class Test2 {            // This is outer class which need not be static
    String name;

    public Test2(String name) {
        this.name = name;
    }
}

public class InnerClass {            //outer class
    static class Test{               // innerclass must be static type

        String naam;                // non-static string naam will depend on the instances, we will get both naam
        static String name;         //Static name is replace to Faroque

        //when string name is static it changes the name from Hemant to Faroque
        // ie it depend on the object (instances)

        public Test(String name, String naam) {
            Test.name = name;
            this.naam = naam;
        }

        public static void main(String[] args) {

            // NOTE: The static class will not depend on the outer-class object, but it can depend on its object

            Test a = new Test("Hemant","One");
            Test b = new Test("Faroque", "Two");

            System.out.println(a.name +" " + b.name);            //Due to Static string name

            System.out.println(a.naam +" " + b.naam);           // Due to non static string naam



            Test2 a2 = new Test2("Its outer class instance");
            Test2 b2 = new Test2 ("Its second outer class instance");
            //Since the outer class is non-static it depends on the instance variables
            // we will get both string name

            System.out.println(a2.name);
            System.out.println(b2.name);

        }
    }
}

// NOTE:- The Inner-Class has to be static to be used in psvm since it is static function and if the class used in psvm is outer then
// it need not be static.
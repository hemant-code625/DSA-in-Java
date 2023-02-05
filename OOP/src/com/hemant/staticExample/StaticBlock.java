package com.hemant.staticExample;

public class StaticBlock {
    static int a =10;
    static int b;

    // Creating a static block for initialising static variables of a class
    //Will only run first when the object is first created i.e. when the class is loaded for the first time
    static{
         System.out.println("I am in Static Block");
        b = a*34;

    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();            // this obj is of no use that's why it is commented
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
        StaticBlock.b +=3;

//        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

    }
}

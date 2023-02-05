package com.hemant.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human hemant= new Human(18,"Hemant",20000,false);
//        Human rahul = new Human (20, "Rahul", 23000, false);
//        Human arpit = new Human(22,"Arpit",30000,true);
//        Human ankit = new Human(30, "Ankit", 40000,true);
//
//        System.out.println(hemant.age);

        // is there any property which is common to human class
        // population of human is constant for other people

        System.out.println(Human.population);     //Since arpit and ankit are married then the population will be these people + their wife
//        System.out.println(hemant.population);      //Conventionally we use ClassName instead of object name
//        System.out.println(rahul.age);

    }
    static void fun(){
//        greeting();      // you cannot use this because it requires an instance
        // in a static context

        //hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();

    }
    void fun2(){
        System.out.println("");
        greeting();
    }

    void greeting(){
        System.out.println("Hello I am a programmer!");
    }

}

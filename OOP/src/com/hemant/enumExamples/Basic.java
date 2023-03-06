package com.hemant.enumExamples;

import com.hemant.interfaces.extendedDemo.A;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // they are public, static and final
        // since its final you can create a child enums
        //constants are of Week type

        Week() {
            System.out.println("Constructor called for "+ this);
        }
        //this is not public or protected, its only private or default
        //why? because we don't want to create new objects (enums have constant objects only)

        @Override
        public void fun() {
            System.out.println("It's Sunday!!");
        }

        //internally: public static final Week Monday = new Week();
        // enum cannot be extended, and it cannot be a super class!
        @Override
        public void hello(){
            System.out.println("Hey, How are you?");
        }

    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal()); // ordianl is like index value of the enum constants

        week.fun();
        week.hello();
        System.out.println(Week.valueOf("Monday"));

    }

}

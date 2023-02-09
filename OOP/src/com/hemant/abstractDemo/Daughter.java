package com.hemant.properties.inheritance.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age, int value) {
        super(age,value);
    }


    @Override
    void carrier( ){
        System.out.println("I am going to be a coder");
    }


}

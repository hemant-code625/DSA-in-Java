package com.hemant.abstractDemo;

public class Son extends Parent {
    public Son(int age, int value){
        super(age, value);
    }
    @Override
    void carrier(){
        System.out.println("I am going to be a pilot");
    }

}

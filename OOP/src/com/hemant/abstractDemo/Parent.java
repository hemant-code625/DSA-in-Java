package com.hemant.properties.inheritance.abstractDemo;

public abstract class Parent {
    static int age;
    final int value;
    public Parent(int age, int value){
        this.age = age;
        this.value = value;
    }

    static void hello(){
        System.out.println("Hey, I am from static method of abstract class!");
    }

    abstract void carrier();


}

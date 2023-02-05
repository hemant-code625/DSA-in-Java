package com.hemant.access;

public class A {
//    public int num;    public means can be accessed anywhere
// private int num;         private num will be allowed only in this code file
    //But we can access this num via getter and setter method

    protected int num;    // we can access in different package of subclass if it's not a subclass we cannot access it!
    int number;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    String name;


    public A(int num, String name,int number) {
        this.num = num;
        this.name = name;
        this.number = number;

    }
}

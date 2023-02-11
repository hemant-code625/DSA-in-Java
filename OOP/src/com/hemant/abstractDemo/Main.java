package com.hemant.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(12,121);
        son.carrier();
        Daughter da = new Daughter(11,121);
        da.carrier();
        Parent.hello(); // No need to create an object
        
    }
}

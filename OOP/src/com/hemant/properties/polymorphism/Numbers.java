package com.hemant.properties.polymorphism;

public class Numbers {
    double sum (double a, int b){
        return a + b;

    }
    int sum (int a, int b) {
        return a + b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2.7,3);
        obj.sum(1,2);

    }
}

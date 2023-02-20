package com.hemant.generics.comparing;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    int a=0;
    int b=0;
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        //arr.forEach((item) -> System.out.println(item*2));
        Consumer<Integer> fun = (item) -> System.out.println(item*3);
        arr.forEach(fun);
//         Operation sum = (a,b) -> a + b;
//         Operation product = (a,b) -> a * b;
//         Operation sub = (a,b) -> a-b;


    }
    interface Operation{
        int operation =(int a , int b)
    }

}

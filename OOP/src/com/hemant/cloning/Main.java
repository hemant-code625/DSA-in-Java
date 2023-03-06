package com.hemant.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(18,"Harsh" );
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone();
        System.out.println(twin.name +" "+ twin.age);

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(kunal.arr));     //Due to shallow copying!

        // Non-primitive data types are Arrays, Strings, Interfaces, Classes and Objects,etc.
        // These are also called reference data types.
        // In Shallow Copying primitives (like byte, short, int,long, float, double, boolean and char)
        // are copied as it is but non primitives are referred to the main data. Thus, a change through main data results
        // change in the cloned data.

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));

    }
}

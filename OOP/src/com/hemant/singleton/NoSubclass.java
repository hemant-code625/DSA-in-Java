package com.hemant.singleton;
import com.hemant.access.A;

public class NoSubclass {
    public static void main(String[] args) {

        A a = new A(12,"NoSubclass Example", 33);

//        int ans2 = a.num;   num is protected and cannot be accessed without subclass
    }
}

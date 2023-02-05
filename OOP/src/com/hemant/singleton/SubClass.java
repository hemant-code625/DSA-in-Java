package com.hemant.singleton;

import com.hemant.access.A;

import javax.naming.ServiceUnavailableException;

public class SubClass extends A {
    public SubClass(int num, String name, int number) {
        super(num, name, number);
    }

    public static void main(String[] args) {
        SubClass a = new SubClass(10,"subClass", 33);
        int ans = a.num;
        System.out.println(ans);
    }

}

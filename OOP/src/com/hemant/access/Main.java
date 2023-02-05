package com.hemant.access;

public class Main {
    public static void main(String[] args) {
        A a = new A(23,"ABC",33);

        System.out.println(a.number);     //here Main file is in the same package and thus
        // it is able to access the default one but this cannot be access
        // ed in different package
        int ans = a.getNum();
        System.out.println(ans);
    }
}

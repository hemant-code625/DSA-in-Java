package com.hemant.access.egOfpkg;

import com.hemant.access.A;

public class Main extends A {
    public Main(int num, String name, int number) {
        super(num, name, number);
    }

    public static void main(String[] args) {
        A a = new A(10,"PKG",33);
   //    int ans = a.number;   number having no modifier (default one) cannot be accessed outside that package. Although this
        // package is inside the access package!!


    }
}

package com.hemant.singleton;

import com.hemant.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();      // pointing to the same instance as of obj
        Singleton obj3 = Singleton.getInstance();      // pointing to the same instance as of obj

        A a = new A(10, "Hemant",33);
    //    System.out.println(a.num);  cannot access num since it's private
        // But we can access num using get function
        int ans = a.getNum();
        System.out.println(ans);


    }
}

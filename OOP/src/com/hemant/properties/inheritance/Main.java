package com.hemant.properties.inheritance;

public class Main {
    public static void main(String[] args) {
    Box b1 = new Box();
    System.out.println("Constructor having no argument");
    System.out.println(b1.h + "  " + b1.w + "  " + b1.l);

    Box b2 = new Box(3.2);

    System.out.println("Constructor having single argument");
    System.out.println(b2.h + "  " + b2.w + "  " + b2.l);

    Box b3 = new Box(3.2, 7, 2);

    System.out.println("Constructor having three argument");
    System.out.println(b3.h + "  " + b3.w + "  " + b3.l);

    Box b4 = new Box(b1);
    System.out.println("Constructor having other class");
    System.out.println(b4.h + "  " + b4.w + "  " + b4.l);

    Box b5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(b5.w+ " "+ b5.weight);   ..... (error on b5.weight because Box is parent class that cannot access weight
//        from child class)


        BoxWeight bw =new BoxWeight(12,3,5,7);
        System.out.println("Inheritance Example");
        System.out.println(bw.h + "  "+ bw.w + "  "+bw.l + " " + bw.weight);


        }
}

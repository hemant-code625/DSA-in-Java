package com.hemant.properties.inheritance;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BOX b1 = new BOX();
        System.out.println("Constructor having no argument");
        System.out.println(b1.h + "  "+ b1.w + "  "+b1.l);

        BOX b2 = new BOX(3.2);

        System.out.println("Constructor having single argument");
        System.out.println(b2.h + "  "+ b2.w + "  "+b2.l);

        BOX b3 = new BOX(3.2,7,2);

        System.out.println("Constructor having three argument");
        System.out.println(b3.h + "  "+ b3.w + "  "+b3.l);

        BOX b4 = new BOX(b1);
        System.out.println("Constructor having other class");
        System.out.println(b4.h + "  "+ b4.w + "  "+b4.l);

        BOX b5 = new BOXWEIGHT(2,3,4,8);
//        System.out.println(b5.w+ " "+ b5.weight);

//        BOXWEIGHT bw =new BOXWEIGHT(12,3,5,7);
//        System.out.println("Inheritance Example");
//        System.out.println(bw.h + "  "+ bw.w + "  "+bw.l + " " + bw.weight);




    }

}

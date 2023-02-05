package com.hemant.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Shapes square = new Square();
        square.area(); // the ref is of parent class - Shapes
        circle.area();
    }
}

package com.hemant.properties.inheritance;

public class BOXWEIGHT extends BOX{
    double weight;
    public BOXWEIGHT(double l, double w, double h, double weight) {
//        super(l,w,h);  this calls the constructor of parent class having three arguments to get the variables l,w and h

        super(l,h,w);
        this.weight = -1; //child class initializing weight


        //since the parent class Box doesn't care what the child class contain,and thus it initialise first (before child class)
        // after that child class initialise itself

    }
}

package com.hemant.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
    public BoxWeight(){
        this.weight =-1;
    }
    public BoxWeight(BoxWeight other){
        this.weight = other.weight;
    }
}

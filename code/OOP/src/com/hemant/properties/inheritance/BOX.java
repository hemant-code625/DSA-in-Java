package com.hemant.properties.inheritance;

public class BOX {
    double l;
    double w;
    double h;

    BOX(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    BOX() {
        this.l = 1.8;
        this.w = 2.7;
        this.h = 3.6;
    }

    BOX(BOX old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }
    BOX(double side) {
        this.l = side;
        this.w = side*2;
        this.h =side*3;

    }
}


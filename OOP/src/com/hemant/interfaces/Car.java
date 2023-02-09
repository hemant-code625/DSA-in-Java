package com.hemant.properties.inheritance.interfaces;

public class Car implements Brakes,Engine,Media{


    @Override
    public void brakes() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}

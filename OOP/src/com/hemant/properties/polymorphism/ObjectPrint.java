package com.hemant.properties.polymorphism;

public class ObjectPrint  {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override                // @Override does not give an error because Object class (Super class) has a toString method
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(34);
        System.out.println(obj);
    }
}

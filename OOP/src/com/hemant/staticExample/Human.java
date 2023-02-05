package com.hemant.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        if (married == true){
            Human.population += 1;   //for married people population count is increased by 1 for their partner
        }
        Human.population += 1;

    }

}

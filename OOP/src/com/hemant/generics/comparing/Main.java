package com.hemant.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student varun  = new Student(12,87.56f);
        Student rahul = new Student(5,99.45f);



        if(varun.compareTo(rahul) < 0){
            System.out.println("Marks of Rahul is greater than Varun");
        }
        if(varun.compareTo(rahul) == 0){
            System.out.println("Both have same marks");
        }else{
            System.out.println("Marks of Varun is greater than rahul");
        }

    }

}

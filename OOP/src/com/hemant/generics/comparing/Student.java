package com.hemant.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        // if diff ==0 both have same marks

        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}

package com.hemant.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Arraylist is the child class of List
        // all the functions like .add, .equal, .clear,etc are available for both Linked-list and Arraylist

        List<Integer> list2 = new LinkedList<>(); //Similarly LinkedList is the child class of List
        list.add(34);
        list2.add(22);
        list2.add(23);
        list2.add(24);
        System.out.println(list2);

        // Q.  Why Linked Lists are not fast? Why is ArrayList faster than Linked List?
        //Ans: Because, Vectors are synchronized.
        //Vector Synchronization which means only one thread can access it one time. But in Arraylist multiple threads can access it one time and its non synchronized.

        List<Integer> vector = new LinkedList<>();
        vector.add(13);
        vector.add(12);
        vector.add(15);
        vector.add(16);
        System.out.println(vector);


    }
}

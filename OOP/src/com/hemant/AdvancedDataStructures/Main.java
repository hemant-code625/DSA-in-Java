package com.hemant.AdvancedDataStructures;

public class Main {
    public static void main(String []args){
        CustomizedLinkedList list = new CustomizedLinkedList();
        list.insertFirst(12);
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertLast(100);
        list.insert(101, 3);
//        list.delete(3);
//        list.delete(2);
        list.display();
        System.out.println(" ");
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteFirst());
        list.display();


    }
}

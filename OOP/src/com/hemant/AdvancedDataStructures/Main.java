package com.hemant.AdvancedDataStructures;

public class Main {
    public static void main(String []args){
        CustomizedLinkedList list = new CustomizedLinkedList();
        list.insertFirst(12);
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(5);
       list.insertLast(110);
        
        list.insert(101, 4);
//        list.delete(3);
//        list.delete(2);
        list.display();
        System.out.println(" ");
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        list.display();
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertFirst(13);
        dlist.insertFirst(12);
        dlist.insertFirst(100);
        dlist.insertFirst(78);
        dlist.display();


    }
}

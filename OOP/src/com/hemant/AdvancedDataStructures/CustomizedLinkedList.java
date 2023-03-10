package com.hemant.AdvancedDataStructures;

public class CustomizedLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }
    public CustomizedLinkedList(){
        this.size= 0;
    }

    public void insert(int value , int index){

        if(index==0){
            insertFirst(value);
        }
        else if(index == size-1){
            insertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);  //here, the temp is at index-1 and new node will point towards the next node of temp
        temp.next = node; //here, the node at index-1 will point towards the new node

        size++;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteFirst(){
        int value = head.value;    // this is the value of deleted node that we will return
        head = head.next;
        if(head == null){
            tail= null;
        }
        size--;
        return value;
    }
    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node temp = get(index-1);   // temp node at index -1 position
        Node node = get(index);     // node at the index which is to be removed.
        int value = node.value;     //The nodal value that is to be returned

        temp.next = node.next;      // pointing such a way that the index node get ignored and removed by garbage collector
        /*
        we can also do this (It's the same thing):- temp.next = temp.next.next;  
        */
        size--;
        return value;
    }

    public int deleteFirst(){
        int value = head.value;    // this is the value of deleted node that we will return
        head = head.next;
        if(head == null){
            tail= null;
        }
        size--;
        return value;
    }


    public int deleteLast(){
        int value = tail.value;
        Node secondLast = get(size-2);
        secondLast.next = tail;
        tail.next = null;
        size--;

        return value;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }



//    public void delete(int index){
//        Node temp = head;
//        Node node = head;
//        for (int i = 1; i < index ; i++) {
//            temp = temp.next;
//        }
//        for (int i = 1; i < index+1; i++) {
//            node = node.next;
//        }
//        temp.next = node.next;
//
//        size--;
//    }


    public void display(){
        Node temp = head;
        for (int i = 1; i <= size; i++) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");

    }


}

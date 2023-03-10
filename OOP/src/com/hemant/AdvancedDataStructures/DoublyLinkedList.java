package com.hemant.AdvancedDataStructures;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }



    }
    public DoublyLinkedList() {
        this.size =0;
    }
    public void insertFirst(int value){

        Node node = new Node(value,head,null);
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;

    }
    public void display (){
        Node temp = head;
        System.out.println(" ");
        System.out.print("END" + " <-> ");
        for (int i = 1; i <= size; i++) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }




}

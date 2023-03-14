package com.hemant.AdvancedDataStructures;

public class LinkedListUsingRec {
    private Node head;
    private int size;

    public LinkedListUsingRec() { this.size = 0; }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            node = head;
        }
        node.next = head;
    }
    public void insert(int value, int index){
        Node node = new Node(value);
        recursion(head,node,index,0);

    }
    private void recursion(Node temp,Node node, int index , int count){
        if(count == index-1){
            node.next = temp.next;
            temp.next = node;
        }
        recursion(temp,node,index,count+1);
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
        }
        System.out.print("End");
    }

    public static void main(String[] args) {
        LinkedListUsingRec ll = new LinkedListUsingRec();
        ll.insertFirst(40);
        ll.insertFirst(20);
        ll.insertFirst(10);
        ll.insertFirst(0);
        ll.display();
        ll.insert(30,3);
        ll.display();

    }
}

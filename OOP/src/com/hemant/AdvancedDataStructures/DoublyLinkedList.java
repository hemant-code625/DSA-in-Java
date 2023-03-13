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
    public void deleteLast(){
        if(size>1){
            Node node = get(size-2);
            node.next = null;
        }else{
            size--;
        }
        size--;
    }
    public void delete(int index){
        if(index ==0 && size != 1){
            head = head.next;
            size--;
        }
        else if(size <= 1){
            size--;
        }
        else if(index == size-1){
            deleteLast();
        }else{
            Node temp1 = get(index-1);
            Node temp2 = get(index+1);
            temp1.next = temp2;
            temp2.prev = temp1;
            size--;
        }

    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index + 1; i++) {
            node = node.next;
        }
        return node;
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
        System.out.println(" "+" 'SIZE' = " +size);
    }




}

package com.hemant.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T>{
    private Object []data;
    private int size=0;
    private static int DEFAULT_SIZE= 10;
    public CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public T add(T num){
        if(isFull()){
            resize();
        }
        return (T)(data[size++] = num);
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object [data.length*2];

        //copy the current data in the arrays
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data = temp;
    }
    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }
    public T get(int index) {
        return (T)data[index];
    }


    public int size() {
        return size;
    }

    public T set(int index, int value) {
        return (T) (data[index] = value);
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomGenericArrayList<String>list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

//        for (int i = 0; i < 14; i++) {
//            list.add(i*2);
//        }
        for (int i = 0; i < 2; i++) {
            list.add("A");
        }
        for (int i = 3; i < 5; i++) {
            list.add("B");
        }
        for (int i = 6; i < 9; i++) {
            list.add("C");
        }
        list.add("abc");

        System.out.println(list);

    }

}

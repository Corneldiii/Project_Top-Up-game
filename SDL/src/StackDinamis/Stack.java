package StackDinamis;

import SBGKB.LinkedList;

public class Stack {
    LinkedList tumpukan;
    
    public Stack(){
        tumpukan= new LinkedList();
    }

    public int size(){
        return tumpukan.getSize();
    }


    public void push(Object nilai){
        tumpukan.addFirst(nilai);
    }

    public boolean isEmptyStck(){
        return tumpukan.isEmpty();
    }

    public Object pop(){
        return tumpukan.removeFirst();
    }
    public void print(){
        tumpukan.print();
    }
}

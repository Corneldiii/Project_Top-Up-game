package QueueDinamis;

import SBGKB.LinkedList;

public class Queue {
    private LinkedList antrian;

    public Queue() {
        antrian=new LinkedList();
    }


    public boolean enqueue(Object angka) {
        antrian.addLast(angka);
        return true;
    }

    public boolean isEmptyQue() {
        return antrian.isEmpty();
    }

    public int size() {
        return antrian.getSize();
    }

    public Object dequeue(){
        return antrian.removeFirst();
    }
    public void print(){
        antrian.print();
    }
    

}

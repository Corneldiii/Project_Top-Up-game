package mytest;

import QueueStatis.queue;

public class MainQueue {
    public static void main(String[] args) {
        queue antrian=new queue(5);
        antrian.enqueue(14);
        antrian.enqueue(25);
        antrian.enqueue(58);

        while(!antrian.isEmptyQue()){
            System.out.print("Data sekarang : ");
            System.out.println(antrian.toString());
            System.out.println("");
            System.out.println("Keluar : " + antrian.dequeue());
            System.out.println("");
        }

        // System.out.println(antrian.dequeue());
        // System.out.println(antrian.dequeue());
        // System.out.println(antrian.dequeue());
    }
}

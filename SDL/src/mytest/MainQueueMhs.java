package mytest;

import QueueStatis.queue;
import per_3.Mahasiswa;

public class MainQueueMhs {
    public static void main(String[] args) {
        queue antrian=new queue(5);
        antrian.enqueue(new Mahasiswa(225314023, "Aldi"));
        antrian.enqueue(new Mahasiswa(225314000, "Chika"));
        antrian.enqueue(new Mahasiswa(225314009, "Amel"));
        antrian.enqueue(new Mahasiswa(225314014, "Abdul"));

        while(!antrian.isEmptyQue()){
            System.out.print("Data sekarang : ");
            System.out.println(antrian.toString());
            System.out.println("");
            System.out.println("Keluar : " + antrian.dequeue());
            System.out.println("");
        }
    }
}

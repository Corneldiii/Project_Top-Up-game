package mytest;

import per_3.Mahasiswa;
import StackDinamis.*;

public class MainStackMhs {
    public static void main(String[] args) {
        Stack tump=new Stack();

        tump.push(new Mahasiswa(225314023, "Aldi"));
        tump.push(new Mahasiswa(225314001, "Vero"));
        tump.push(new Mahasiswa(225314020, "Abdul"));
        tump.push(new Mahasiswa(225314005, "Amel"));

        
        
        while (!tump.isEmptyStck()) {
            System.out.print("Data sekarang : ");
            tump.print();
            System.out.println("");
            System.out.println("Keluar : " + tump.pop());
            System.out.println("");

        }
    }
}

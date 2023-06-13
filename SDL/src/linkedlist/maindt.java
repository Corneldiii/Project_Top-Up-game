package linkedlist;

import per_3.Mahasiswa;

public class maindt {
    public static void main(String[] args) {
        Mahasiswa[] data = new Mahasiswa[5];
        data[0] = new Mahasiswa(1,"Aldi");
        data[1] = new Mahasiswa(2,"Aldo");
        data[2] = new Mahasiswa(3,"Ucup");
        data[3] = new Mahasiswa(5,"Rex");
        data[4] = new Mahasiswa(7,"Abdul");
        
        LinkedList adc = new LinkedList();
        
        System.out.println("Masukan data di akhir "+data[0]);
        adc.addLast(data[0]);
        adc.print();
        System.out.println("");

        
        System.out.println("Masukan data di awal "+data[1]);
        adc.addFirst(data[1]);
        adc.print();
        System.out.println("");

        
        System.out.println("Masukan data di akhir "+data[2]);
        adc.addLast(data[2]);
        adc.print();
        System.out.println("");

        
        System.out.println("Masukan data di akhir "+data[4]);
        adc.addLast(data[4]);
        adc.print();

        System.out.println("");
        try {
            System.out.println("Menghapus " + adc.removeLast());
            adc.print();
            System.out.println("");
            System.out.println("Menghapus " +adc.removeLast());
            adc.print();
            System.out.println("");
            System.out.println("Menghapus " + adc.removeFirst());
            adc.print();
            System.out.println("");
            System.out.println("Menghapus " + adc.removeFirst());
            adc.print();
            System.out.println("");
            System.out.println("Menghapus" +   adc.removeFirst());
        }
        catch (Exception e){
            System.out.println("");
            System.out.println("List Kosong masbro");
        }
        System.out.println("");
    }
}

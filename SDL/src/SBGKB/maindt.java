package SBGKB;

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
        
        Object satu=data[0];
        System.out.println("Masukan data di akhir "+satu);
        adc.addLast(satu);
        adc.print();
        System.out.println("");

        Object dua=data[1];
        System.out.println("Masukan data di awal "+dua);
        adc.addFirst(dua);
        adc.print();
        System.out.println("");

        Object tiga=data[2];
        System.out.println("Masukan data di akhir "+tiga);
        adc.addLast(tiga);
        adc.print();
        System.out.println("");

        Object empat=data[3];
        Object lima=data[4];
        System.out.println("Masukan data di akhir "+lima);
        adc.addLast(lima);
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

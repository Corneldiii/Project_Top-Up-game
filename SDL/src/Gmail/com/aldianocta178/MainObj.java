package Gmail.com.aldianocta178;

import per_3.Mahasiswa;

import java.util.*;
import per_3.staticLarik2;

public class MainObj {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        Mahasiswa[] data=new Mahasiswa[3];
        data[0]=new Mahasiswa(225314023, "Aldi");
        data[1]=new Mahasiswa(225314001, "Ucup");
        data[2]=new Mahasiswa(225314020, "Abdul");

        System.out.println("");
        System.out.println("Data sebelum Urut");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }

        System.out.println("");
        System.out.println("Data setela diurutkan");
        staticLarik2.bubleSortASC(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }

        System.out.println("");
        System.out.print("Cari Mahasiswa : ");
        int nim=tampung.nextInt();

        Object key=new Mahasiswa(nim, null);

        int cari=staticLarik2.sequentialSearch(data, key);
        System.out.println("");
        if(cari>-1){
            System.out.println("Data ditemukan");
            System.out.println("di indeks : "+cari);
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
}


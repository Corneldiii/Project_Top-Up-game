/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class mainBuku {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        penerbit data1=new penerbit("Jaya abadi","JL.Gajah Mada","1977");
        penerbit data2=new penerbit("Puting Beliung Production","JL.Menuju Cahaya","1999");
        
        System.out.print("Judul buku      : ");
        String a=tampung.nextLine();
        System.out.print("Pengarang       : ");
        String b=tampung.nextLine();
        System.out.print("Tahun terbit    : ");
        int c=tampung.nextInt();
        
        dataBuku buku1=new dataBuku(a,b,data1,c);
        
        System.out.println("DATA BUKU : ");
        System.out.println("Judul           : "+buku1.getJudul());
        System.out.println("Pengarang       : "+buku1.getPengarang());
        System.out.println("Tahun Terbit    : "+buku1.getTahunTerbit());
        System.out.println("DATA PENERBIT : ");
        System.out.println("Penerbit        : "+buku1.getDataPenerbit().getNama());
        System.out.println("Alamat          : "+buku1.getDataPenerbit().getAlamat());
        System.out.println("Tahun Berdiri   : "+buku1.getDataPenerbit().getTahun());
        System.out.println("INFO            : "+buku1.baruLama());
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3;

/**
 *
 * @author LENOVO
 */
public class No2_mosul3 {
    public static void main(String[] args){
        int hargabarang,jumlahbarang;
        int Bdisc,disc,Sdisc;
        
        hargabarang=12000;
        jumlahbarang=6;
        
        Bdisc=hargabarang*jumlahbarang;
        disc=Bdisc*20/100;
        Sdisc=Bdisc-disc;
        
        
        
        System.out.println("TOKO RAMAJU MAJU");
        
        System.out.println("Harga barang    : "+hargabarang);
        System.out.println("Jumlah barang   : "+jumlahbarang);
        System.out.println("_______________________________");
        System.out.println("Harga sebelum discount  : "+Bdisc);
        System.out.println("Discount                : "+disc);
        System.out.println("Harga setelah Discount  : "+Sdisc);
        
    }
}

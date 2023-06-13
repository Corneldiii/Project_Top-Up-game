/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;
/**
 *
 * @author LENOVO
 */
public class BankMain {
    public static void main(String[] args) {
        RekeningBank rekeningBudi;
        rekeningBudi=new RekeningBank("12345");
        System.out.println("Rekening Budi =  "+rekeningBudi.cekSaldo());
        System.out.println("Menabung 50.000 ");
        rekeningBudi.tabung(50000);
        System.out.println("Rekening Budi Sekarang = "+rekeningBudi.cekSaldo());
        System.out.println("Mengambil 20.000");
        rekeningBudi.ambil(20000);
        System.out.println("Rekening Budi sekarang = "+rekeningBudi.cekSaldo());
        
    }
   
}

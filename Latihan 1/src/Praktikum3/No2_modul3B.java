/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No2_modul3B {
    public static void main(String[] args){
        Scanner toko= new Scanner(System.in);
        int HB,JB,HTB;
        double DISC,HTS;
        
        System.out.print("Masukan Harga Barang    : Rp.");
        HB=toko.nextInt();
        System.out.print("Masukan Jumlah barang   : ");
        JB=toko.nextInt();
        
        HTB=HB*JB;
        DISC=0.2*HTB;
        HTS=HTB-DISC;
        System.out.println("");
        System.out.println("--TOKO JAYA ABADI--");
        System.out.print("Jl.pitecantropuserectus no.11");
        System.out.println("Rt 2,Rw 9 New york wetan");
        System.out.println("______________________________");
        System.out.println("");
        System.out.println("Harga Barang            : "+HB);
        System.out.println("Jumlah Barang           : "+JB);
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("Harga sebelum discount  : Rp."+HTB);
        System.out.println("Discount                : Rp."+DISC);
        System.out.println("Harga setelah discount  : Rp."+HTS);
        System.out.println("_________TERIMA KASIH_________");
        
    }
}

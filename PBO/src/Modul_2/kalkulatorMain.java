/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class kalkulatorMain {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        
        kalkulator nomor=new kalkulator();
        
        System.out.print("Masukan angka ke 1 : ");
        double angka=tampung.nextDouble();
        nomor.setAngka1(angka);
        System.out.print("Masukan angka ke 2 : ");
        angka=tampung.nextDouble();
        nomor.setAngka2(angka);
        
        System.out.println("JUMLAH DARI KEDUA ANGKA : "+nomor.penjumlahan());
        System.out.println("PENGURANGAN DARI KEDUA ANGKA : "+nomor.pengurangan());
        System.out.println("PERKALIAN DARI KEDUA ANGKA : "+nomor.perkalian());
        System.out.println("PEMBAGIAN DARI KEDUA ANGKA : "+nomor.pembagian());
    }
}

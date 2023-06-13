/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

import java.util.Scanner;

public class BujurSangkarMain {
    public static void main(String[] args) {
        BujurSangkar bujur1=new BujurSangkar();
        BujurSangkar bujur2=new BujurSangkar();
        
        Scanner tombol = new Scanner(System.in);
        System.out.println("Masukan sisi bujur sangkar 1 : ");
        bujur1.sisi=tombol.nextInt();
        
        System.out.println("Masukan sisi bujur sangkar 2 : ");
        bujur2.sisi=tombol.nextInt();
        
        System.out.println("Luas bujur sangkar dengan sisi ="+bujur1.sisi+" adalah "+bujur1.luas());
        
        System.out.println("Luas bujur sangkar dengan sisi ="+bujur2.sisi+" adalah "+bujur2.luas());
    }
}

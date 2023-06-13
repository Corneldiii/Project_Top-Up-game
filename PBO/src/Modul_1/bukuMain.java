/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

/**
 *
 * @author LENOVO
 */
public class bukuMain {
    public static void main(String[] args) {
        Buku buku1=new Buku("Struktur data",1304595);
        Buku buku2=new Buku("Java Fundametal",1304300);
        
        buku1.pinjam();
        System.out.println();
        buku2.kembali();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;


/**
 *
 * @author LENOVO
 */
public class Buku {
    String judul,pengarang,penerbit,kategori;
    int ISBN;
    
    Buku(String JUDUL,int isbn){
        judul=JUDUL;
        ISBN=isbn;
    }
    public void pinjam(){
        System.out.println(" Buku dengan judul : "+judul+"\nISBN : "+ISBN);
        System.out.println("Sedang dipinjam");
    }
    public void kembali(){
        System.out.println("Buku dengan judul : "+judul+"\nISBN : "+ISBN);
        System.out.println("Sudah dikembalikan");
    }
    
}

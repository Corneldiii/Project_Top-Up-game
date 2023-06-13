/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    String warna;
    
    Mobil(String wrn){
        warna=wrn;
    }
    
    void jalan_maju(){
        System.out.print("Mobil warna "+warna);
        System.out.println(" Maju!");
    }
    
    public static void main(String[] args) {
        Mobil sedan=new Mobil("merah");
        sedan.jalan_maju();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otakatik;

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
    
}

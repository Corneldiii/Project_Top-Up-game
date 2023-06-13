/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aldian_Octavius_Soesanto_225314023_laporanke1;

/**
 *
 * @author LENOVO
 */
public class Nomor6 {
    public static void main(String[] args){
       
        int R1,R2,R3,s;
        double pt,pf;
        
        R1=6;
        R2=5;
        R3=10;
        
        s= R1+R2+R3;
        pt= ((1.0/R1) + (1.0/R2) + (1.0/R3));
        pf = (1.0/pt);
        
        
        System.out.println("-----Hasil Dari Perhitungan-----");
        
        System.out.println("Jumlah hambatan pada resistor dengan hambatan "+R1+","+R2+", dan "+R3+" secara seri adalah = "+s);
        System.out.println("Jumlah hambatan secara pararel adalah = "+pf);
        
        System.out.println("-----Terima Kasih-----");
        
        
    }
}

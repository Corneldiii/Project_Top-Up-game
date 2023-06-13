/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
    double r;
    double luas;
    final double PHI=3.14;
    
    Lingkaran(){};
    
    public void luas(){
        r=7;
        luas=PHI*r*r;
        
        System.out.println("Luas Lingkaran dengan jari = "+r+" adalah : "+luas);
    }
}

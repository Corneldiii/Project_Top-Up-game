/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4B;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class no4_modul4B {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        int AB,BC,CA;
        double PAB,PCA,PBC;
        
        System.out.print("Masukan panjang sisi AB : ");
        AB=Tampung.nextInt();
        System.out.print("Masukan panjang sisi BC : ");
        BC=Tampung.nextInt();
        System.out.print("Masukan panjang sisi CA : ");
        CA=Tampung.nextInt();
        
        
        PAB=Math.pow(AB,2);
        PCA=Math.pow(CA, 2);
        PBC=Math.pow(BC,2);
        
        if(PAB+PBC==PCA){
            System.out.println("Maka segtiga yang terbentuk dari sisi "+AB+","+BC+", dan "+CA+"adalah segitiga SIKU SIKU");
            }else if (AB==CA && BC!=CA){
                System.out.println("Maka segtiga yang terbentuk dari sisi "+AB+","+BC+", dan "+CA+"adalah segitiga SAMA KAKI");
                }else if (AB==CA && BC==AB && CA==BC){
                    System.out.println("Maka segtiga yang terbentuk dari sisi "+AB+","+BC+", dan "+CA+"adalah segitiga SAMA SISI");
                    }else if  (AB!=CA && BC!=AB && CA!=BC){
                        System.out.println("Maka segtiga yang terbentuk dari sisi "+AB+","+BC+", dan "+CA+"adalah segitiga sembarang");
                    }
    }
}

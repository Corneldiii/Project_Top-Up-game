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
public class No8_modul3B {
    public static void main(String[] args){
        Scanner kerucut=new Scanner(System.in);
        int r,t;
        double V,L;
        
        System.out.print("Masukkan nilai jari jarinya   : ");
        r=kerucut.nextInt();
        System.out.print("Masukan tinggi kerucut        : ");
        t=kerucut.nextInt();
        
        V= (1.0/3.0)*3.14*Math.pow(r, r)*t;
        L= 3.14*Math.pow(r, 2)+ 3.14*Math.pow(r, r)*t;
        
        
        System.out.println("");
        System.out.println("Volume dari kerucut dengan jari jari "+r+" dan tinggi "+t+" adalah "+V);
        System.out.println("Dan Luas dari kerucutnya adalah "+L);
    }
}

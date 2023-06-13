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
public class No9_modul3B {
    public static void main(String[] args){
        Scanner mobil=new Scanner(System.in);
        int V0,a,t;
        double Vt,St;
        
        
        
        System.out.print("Masukan kecepatan awalnya    : ");
        V0=mobil.nextInt();

        System.out.print("Masukan waktu yang ditempuh   : ");
        t=mobil.nextInt();

        
        a=V0/t;
        Vt = V0+a*t;
        St = V0*t+ 0.5*a*Math.pow(t, 2);
        
        System.out.println("");
        System.out.println("Maka kecepatan yang di tempuh adalah "+Vt);
        System.out.println("Dan jarak yang sudah di tempuh adlah "+St);
        
    }
}

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
public class No5_modul3B {
    public static void main(String[] args){
        Scanner Berat=new Scanner(System.in);
        int TB,BB;
        String nama;
        
        System.out.print("Masukan Nama Anda           : ");
        nama=Berat.nextLine();
        System.out.print("Masukan Tinggi Badan anda   : ");
        TB=Berat.nextInt();
        
        BB=TB-100;
        
        System.out.println("");
        System.out.println("----Program Berat Ideal----");
        System.out.println("Nama Anda           : "+nama);
        System.out.println("Tinggi Anda(Cm)     : "+TB);
        System.out.println("_____________________");
        System.out.println("Berat Ideal Anda    : "+BB);
        
    }
}

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
public class No3_modul3B {
    public static void main(String[] args){
        Scanner sekolah=new Scanner(System.in);
        int T1,T2,T3;
        double rata;
        
        System.out.print("Masukan Nilai Tugas 1   : ");
        T1=sekolah.nextInt();
        System.out.print("Masukan nilai Tugas 2   : ");
        T2=sekolah.nextInt();
        System.out.print("Masukan Nilai Tugas 3   : ");
        T3=sekolah.nextInt();
        
        rata=(T1+T2+T3)/3.0;
        
        System.out.println("");
        System.out.println("SD TADIKAN MESRA");
        System.out.println("----------------");
        System.out.println("Tugas 1         : "+T1);
        System.out.println("Tugas 2         : "+T2);
        System.out.println("Tugas 3         : "+T3);
        System.out.println("_______________");
        System.out.println("Nilai Rata-rata : "+rata);
    }
    
}

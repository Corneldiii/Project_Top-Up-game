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
public class No4_modul3B {
    public static void main(String[] args){
        Scanner studi=new Scanner(System.in);
        
        int US1,US2,UAS;
        double Nf;//NF adalah nilai final
        
        System.out.print("Masukan Nilai US 1  : ");
        US1=studi.nextInt();
        System.out.print("Masukan Nilai US 2  : ");
        US2=studi.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        UAS=studi.nextInt();
        
        Nf=0.3*US1+0.3*US2+0.4*UAS;
        
        System.out.println("");
        System.out.println("NILAI FINAL");
        System.out.println("______________________");
        System.out.println("Nilai US 1  : "+US1);
        System.out.println("Nilai US 2  : "+US2);
        System.out.println("Nilai UAS   : "+UAS);
        System.out.println("______________________");
        System.out.println("Nilai Final : "+Nf);
        
        
    }
}

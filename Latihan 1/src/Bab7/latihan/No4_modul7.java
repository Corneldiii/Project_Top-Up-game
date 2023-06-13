/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.latihan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No4_modul7 {
    public static void main(String[] args){
        int putar=1;
        double jumlah=0;
        double bilangan;
        Scanner tombol=new Scanner(System.in);
        
        do{
            System.out.print("Masukan data ke "+putar+" : ");
            bilangan=tombol.nextDouble();
            jumlah+=bilangan;
            putar++;
        }while(putar<=5);
        System.out.println("Jumlah 5 bilangan tersebut adalah "+jumlah);
    }
}

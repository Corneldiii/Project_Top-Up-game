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
public class No1_modul3B {
    public static void main(String[] args){
        Scanner Warung=new Scanner(System.in);
        int JM,JL,JMIN;// JM adalah jumlah makan,JL adalah jumlah lauk,JMIN adalah jumlah minum
        int HT;//HT adalah harga total
        
        System.out.print("Masukan jumlah makanan    : ");
        JM=Warung.nextInt();
        System.out.print("Masukan jumlah lauk       : ");
        JL=Warung.nextInt();
        System.out.print("Masukan jumlah minuman    : ");
        JMIN=Warung.nextInt();
        
        HT= JM*8000+JL*3000+JMIN*2000;
        
        
        System.out.println("");
        System.out.println("WARUNG MAKAN PAK KOUR");
        System.out.println("");
        System.out.println("Jumlah makan    : "+JM);
        System.out.println("Jumlah lauk     : "+JL);
        System.out.println("Jumlah minum    : "+JMIN);
        System.out.println("__________________________");
        System.out.println("HARGA TOTAL     : Rp "+HT);
        
        
    }
}

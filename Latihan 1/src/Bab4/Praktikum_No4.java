/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Praktikum_No4 {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        int HB,JB;
        double DISC,THB;
        HB=100000;
        
        System.out.print("Masukan jumlah barang anda : ");
        JB=Tampung.nextInt();
        
        if((JB*HB)>= 1000000){
            DISC=0.1*(JB*HB);
            THB=(JB*HB)-DISC;
            System.out.println("Discount yang anda terima sebesar       : Rp."+DISC);
            System.out.println("Jumlah yang harus anda bayarkan adalah  : Rp."+THB);
        }else{
            THB=(JB*HB);
            System.out.println("Discount yang anda terima sebesar       : Rp.0.0");
            System.out.println("jumlah yang harus anda bayarkan adalah  : Rp."+THB);
        }
        
        
    }
}

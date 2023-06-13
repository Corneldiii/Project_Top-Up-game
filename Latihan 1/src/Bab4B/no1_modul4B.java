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
public class no1_modul4B {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int S=1,M=2,L=3,XL=4,XXL=5;
        int ukuran,banyak,hitung;
        
        System.out.println("PETUNJUK!!!");
        System.out.println("S = 1");
        System.out.println("M = 2");
        System.out.println("L = 3");
        System.out.println("XL = 4");
        System.out.println("XXL = 5");
        System.out.println("___________________________");
        System.out.print("Masukan baju ukuran apa yang dibeli   : ");
        ukuran=tampung.nextInt();
        
        if(ukuran==1){
            System.out.print("Berapa banyak yang anda beli : ");
            banyak=tampung.nextInt();
            hitung=banyak*30000;
            System.out.println("Maka jumlah  yang harus anda bayarkan sebesar : Rp."+hitung);
            }else if (ukuran==2){
                System.out.print("Berapa banyak yang anda beli : ");
                banyak=tampung.nextInt();
                hitung=banyak*38000;
                System.out.println("Maka jumlah yang harus anda bayarkan sebesar : Rp."+hitung);
                }else if (ukuran==3){
                    System.out.print("Berapa banyak yang anda beli : ");
                    banyak=tampung.nextInt();
                    hitung=banyak*45000;
                    System.out.println("Maka jumlah yang harus anda bayarkan sebesar : Rp."+hitung);
                    }else if (ukuran==4){
                        System.out.print("Berapa banyak yang anda beli : ");
                        banyak=tampung.nextInt();
                        hitung=banyak*50000;
                        System.out.println("Maka jumlah yang harus anda bayarkan sebesar : Rp."+hitung);
                        }else if(ukuran==5){
                            System.out.print("Berapa banyak yang anda beli : ");
                            banyak=tampung.nextInt();
                            hitung=banyak*60000;
                            System.out.println("Maka jumlah yang harus anda bayarkan sebesar  : Rp."+hitung);
                        }
        
    }
}

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
public class no2_modul4B {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int golongan,masa,masa2,masa3,masa4,gaji;
        double hitung;
        
        System.out.print("Golongan berapa anda saat ini : ");
        golongan=tampung.nextInt();
        
        
        if(golongan==1){
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=tampung.nextInt();
                hitung=0.5*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=tampung.nextInt();
                    hitung=0.6*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=tampung.nextInt();
                        hitung=0.7*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }
        }
        
        if (golongan==2){
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=tampung.nextInt();
                hitung=0.6*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=tampung.nextInt();
                    hitung=0.7*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=tampung.nextInt();
                        hitung=0.8*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
        }
        
            
        if (golongan==3){
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=tampung.nextInt();
                hitung=0.7*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=tampung.nextInt();
                    hitung=0.8*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=tampung.nextInt();
                        hitung=0.9*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
        }
            
            
        if (golongan==4){
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=tampung.nextInt();
                hitung=0.8*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){

                    gaji=tampung.nextInt();                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    hitung=0.9*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=tampung.nextInt();
                        hitung=0.1*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
            
        
        
            
        }
        
    }
}

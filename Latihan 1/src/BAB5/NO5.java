/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class NO5 {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        int golongan,masa,masa2,masa3,masa4,gaji;
        double hitung;
        
        System.out.print("Golongan berapa anda saat ini : ");
        golongan=Tampung.nextInt();
        
        
        
          switch(golongan){
              case 1:
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=Tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=Tampung.nextInt();
                hitung=0.5*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=Tampung.nextInt();
                    hitung=0.6*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=Tampung.nextInt();
                        hitung=0.7*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }
            break;
        
        
              case 2:
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=Tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=Tampung.nextInt();
                hitung=0.6*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=Tampung.nextInt();
                    hitung=0.7*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=Tampung.nextInt();
                        hitung=0.8*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
            break;
        
        
            
          case 3:
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=Tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=Tampung.nextInt();
                hitung=0.7*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){
                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    gaji=Tampung.nextInt();
                    hitung=0.8*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=Tampung.nextInt();
                        hitung=0.9*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
            break;
        
            
            
          case 4:
            System.out.print("Suddah berapa lama anda bekerja bagi perusahaan : ");
            masa=Tampung.nextInt();
            if(masa<=10){
                System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                gaji=Tampung.nextInt();
                hitung=0.8*gaji;
                System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                }else if (11<=masa&&masa<=20){

                    gaji=Tampung.nextInt();                    System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                    hitung=0.9*gaji;
                    System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                    }else if (21<=masa&&masa<=30){
                        System.out.print("Masukan gaji yang anda dapatkan : Rp.");
                        gaji=Tampung.nextInt();
                        hitung=1*gaji;
                        System.out.println("Bonus yang anda dapatkan sebesar : Rp."+hitung);
                        }
            break;
        
          }
    }
}

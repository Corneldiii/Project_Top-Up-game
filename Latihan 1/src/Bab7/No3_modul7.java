/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No3_modul7 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner untuk memori dengan nama tampung
        int berat,data,N=1,B=0,BG=0,U=0;//meminta tempat pada int dengan nama berat,data,N=1,B=0,BG=0,U=0
        
        System.out.print("Banyak mangga yang diproses : ");//mencetak tulisan Banyak mangga yang diproses : 
        data=tampung.nextInt();//membaca hasil inputan yang berupa variable dengan nama data dan disimpan ke memori tampung pada class scanner
        
        do{//kerjakan
           
            System.out.print("Masukan berat mangga "+N+" : ");//mencetak Masukan berat mangga "+N+" : 
            berat=tampung.nextInt();//membaca hasil inputan yang berupa variable dengan nama berat dan disimpan ke memori tampung pada class scanner
            
            
            N++;//menjumlah isi variable N dengan +1
            if(berat<500){//jika isi variable berat lebih kecil dari 500 maka
                B++;//menjumlahakn isi variable B dengan +1
            }else if(500<=berat && berat<750){//atau jika isi variable berat lebih besar sama dengan 500 atau isi variable berat lebih kecil sama dengan 750
                BG++;//menjumlahkan isi variaable BG dengan +1 
            }else if(berat>750){//atau jika isi variable berat lebih besar dari 750 maka
                U++;//menjumlahkan isi variable U dengan +1
            }
        }while(N<=data);//selama isi variable N kurang dari sama dengan data
        
        System.out.println("Jumlah mangga BIASA  : "+B);//mencetak Jumlah mangga BIASA  : "+B
        System.out.println("Jumlah mangga BAGUS  : "+BG);//mencetak Jumlah mangga BAGUS  : "+BG
        System.out.println("Jumlah mangga UNGGUL : "+U);//mencetak Jumlah mangga UNGGUL : "+U
        
    }
}

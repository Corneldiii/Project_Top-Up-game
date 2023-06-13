/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab10;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No1_modul10 {
    public static void main(String[] args) {
        long n,r,kombinasiNr;//meminta tempat pada long unutk variable dengan nama n,r,kombinasiNr
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner unutk memori dengan nama tampung
        do{//kerjakan minimal sekali
        System.out.print("Masukan nilai n : ");//mencetak "Masukan nilai n : "
        n=tampung.nextInt();//membaca dan menyimpan hasil inputan
        System.out.print("Masukan nilai r : ");//mencetak "Masukan nilai r : "
        r=tampung.nextInt();//membaca dan menyimpan hasil inputan
        }while(r>=n);//perulangan terus berjalan selama r lebih kecil sama dengan n
        kombinasiNr=faktor(n)/faktor(n-r)*faktor(r);////memangil deklarasi faktor
        System.out.println("jumlah kombinasi "+r+" elemen yang diambil dari "+r+" elemen adalah "+kombinasiNr);
        //mencetak "jumlah kombinasi "+r+" elemen yang diambil dari "+r+" elemen adalah "+kombinasiNr
    }
    
    static long faktor(long n){//deklarasi metode faktor
        long hasFak=1;//meminta tempat pada long unutk variable dengan nama hasFak yang berisi 1
        if(n==0)return 1;//jika n sama dengan 0,kembali ke 1
        else{//jika tidak 
            for(int i=1;i<=n;i++)hasFak=hasFak*i;//melakukan perulangan i yang berisi 1 dengan kondisi
            return hasFak;//kembali ke hasFak
        }
    }
    
}

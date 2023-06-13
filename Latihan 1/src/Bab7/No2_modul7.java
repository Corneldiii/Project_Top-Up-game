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
public class No2_modul7 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori pada class csanner dengan nama tampung
        int uts1,uts2,uas,N=0;//memita tempat pada interger dengan nama uts1,uts2,uas dan N dengan isi 0
        double total;//meminta tempat pada double dengan nama total
        
        do{//kerjakan
            System.out.print("Masukan nilai UTS 1 : ");//mencetak Masukan nilai UTS 1 : 
            uts1=tampung.nextInt();//membaca hasil inputan yang berupa variable uts1 dan disimpan ke memori tampung  pada class scanner
            System.out.print("Masukan nilai UTS 2 : ");//mencetak Masukan nilai UTS 2 : 
            uts2=tampung.nextInt();//membaca hasil inputan yang berupa variable uts2 dan disimpan ke memori tampung  pada class scanner
            System.out.print("Masukan nilai UAS   : ");//mencetak Masukan nilai UAS   : 
            uas=tampung.nextInt();//membaca hasil inputan yang berupa variable uas dan disimpan ke memori tampung  pada class scanner
            N++;//menjumlah kan isi variable N dengan +1
        }while((uts1<0||uts1>100 || uts2<0||uts2>100) || uas<0||uas>100);//selama ekspresi boolean bernilai benar atau true program akan terus dilooping
        
        total=0.3*uts1 + 0.3*uts2 + 0.4*uas;//menghitung hasil dari 0.3*uts1 + 0.3*uts2 + 0.4*uas dan disimpan ke variable total
        if(total>=80){//jika nilai total lebih besar sama dengan 80 maka program terus dijalankan
            System.out.println("Nilai anda : A");//mencetak Nilai anda : A
        }else if (65<=total || total<80){//atau jika variable total lebih besar sama dengan 65 atau variable total lebih kedcil dari 80 maka program dijalankan
            System.out.println("Nilai anda : B");//mencetak Nilai anda : B
        }else if (55<= total || total <65){//atau jika variable total lebih besar sama dengan 55 atau variable total lebih kecil dari 65 maka program dijalankan
            System.out.println("Nilai anda : C");//mencetak Nilai anda : C
        }else if(50<= total || total<55){//atau jika variable total lebih besar sama dengan 50 atau variable total lebih kedcil dari 55 maka program dijalankan
            System.out.println("Nilai anda : D");//mencetak Nilai anda : D
        }else if (total<50){//jika nilai total lebih kecil dari 50 maka program terus dijalankan
            System.out.println("Nilai anda : E");//mencetak Nilai anda : E
        }
        System.out.println("Anda sudah mengulang sebanyak "+N+" kali");//mencetak tulisan Anda sudah mengulang sebanyak "+N+" kali
    }
}



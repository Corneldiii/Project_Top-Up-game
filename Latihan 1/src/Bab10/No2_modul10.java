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
public class No2_modul10 {
   static long faktor(int m){//membuat method dengan nama faktor
       long hasil =1;//meminta input berupa long dengan nama hasil
       if(m==0)return 1;//jika m==0 kembalikan nilai 1
       else{//jika tidak
           for(int i=1;i<=m;i++)hasil=hasil*i;//untuk perulangan i yang berisi 1 dengan kondisi i kurang dari m,dan untuk setiap perulangan isi variable i dtiambah 1
       }
       return hasil;//mengembalikan nilai balikan hasil
   }
   static long hitung(int n, int r){//membuat method dengan nama hitung
       long kom;//meminta tempat pada long unutk variable dengan nama kom
       kom=faktor(n)/(faktor(r)*faktor(n-r));//menyimpan rumus kombinasi
       return kom;//mengembalikan nilai balikan hasil
   }
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori pada scanner dengan nama tampung
        int angka;//meminta pada int dengan nama angka
        
        System.out.print("Masukan angka : ");//mencetak Masukan angka : 
        angka=tampung.nextInt();//membaca dan menyimpan inputan
        for(int i=0;i<angka;i++){//untuk perulangan i yang berisi 0 dengan kondisi isi variable i kurang dari angka dan untuk setiiap perulangan isi variable i dtiambah 1
            for(int c=angka-1;c>=i;c--)System.out.print(" ");//untuk perulangan c yang berisi angka dikurangi 1 dengan kondisi c lebih besar sama dengan i dan untuk setiap perulangan isi vvariable c ditambah 1 lalu mencetak spasi
        
        for(int j=0;j<=i;j++)System.out.print(hitung(i, j)+" ");//untuk perulangan j yang berisi 0 dengan kondisi j lebih kecil sama dengan i dan untuk setiap perulangan isi variable j ditambah 1 lalu mencetak isi hitung(i, j) dan jarak
            System.out.println();//mencetak baris
        }
    }
}

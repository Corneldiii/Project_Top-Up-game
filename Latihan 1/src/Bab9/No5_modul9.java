/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No5_modul9 {
    public static void main(String[] args) {
        //meminta input
        Scanner tampung=new Scanner(System.in);
        int a;//meminta tempat pada int untuk variable dengan nama a
        long x,b,c,p,hasil;//meminta tempat pada long unutk variable dengan nama  x,b,c,p,hasil
        //meminta nilai
        System.out.print("Massukan nilai : ");//mencetak Massukan nilai : 
        a=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable dengan nama a dan disimpan ke memori tampung pada class Scanner
        //melakukan perulangan
        for(int i=0;i<a;i++){//unutk perulangan variable int i yang berisi 0 dengan kondisi i lebih kecil daari a dan untuk setiap perulangan isi variable i ditambah 1
            for(int j=0;j<a-i-1;j++){
                System.out.print(" ");//mencetak jarak
            }
            for(int j=0;j<=i;j++){//unutk perulangan variable int j yang berisi 0 dengan kondisi j lebih kecil sama dengan i dan setiap perulangab isi variable j ditambah 1
                if(j==0){//jika j sama dengan 0 maka
                    System.out.print(1+" ");//mencetak 1 dan jarak
                }else if(j==i){//atau jika j sama dengan i maka
                    System.out.print(1+" ");//mencetak 1 dan jarak
                }else if(j>=1){//atau jika j lebih besar sama dengan 1 maka
                    x=1;//simpan 1 ke variable x
                    b=1;//simpan 1 ke variable b
                    p=i-j;//hitung hasil dari i dikurangi j dan disimpan ke p
                    c=1;//simpan 1 ke variable c
                    for(int k=1;k<=i;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann i dan untuk setiap perulangan isi variable k ditambah 1
                        x=x*k;//menghitung hasil dari x dikali k dan disimpan kembali ke x
                    }
                    for(int k=1;k<=j;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann j dan untuk setiap perulangan isi variable k ditambah 1
                        b=b*k;//menghitung hasil dari b dikali k dan disimpan kembali ke b
                    }
                    for(int k=1;k<=p;k++){//untuk perulangan int k yang berisi 1 dengan kondisi k lebih kecil sama dengann p dan untuk setiap perulangan isi variable k ditambah 1
                        c=c*k;//menghitung hasil dari c dikali k dan disimpan kembali ke c
                    }
                    hasil=x/(b*c);//menghitung hassil dari x/(b*c) dan disimpan ke vvariable hasil
                    System.out.print(hasil+" ");//mencetak variable hasil dan jarak
                }
            }
            System.out.println(" ");//mencetak jarak
        }
    }
}

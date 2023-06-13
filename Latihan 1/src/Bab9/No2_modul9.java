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
public class No2_modul9 {
    public static void main(String[] args){
        //meminta input
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner unutk memori dengan nama tampung
        int N,berat,a=0,b=0,c=0,d=0,e=0;//meminta tempat unutkk variable dengan nama N,berat,a=0,b=0,c=0,d=0,e=0
        //meminta batas data
        System.out.print("Masukan banyak data : ");//mencetak "Masukan banyak data : "
        N=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable dengan nama N
        //memulai perulangan
        for(int i=1;i<=N;i++){//unutk perulangan i yang berisi 1,dengan kondisi i lebih kecil sama dengan N,dan pada setiap perulangan isi variable i ditambah 1
            System.out.print("masukan berat "+i+" = ");//mencetak "masukan berat "+i+" = "
            berat=tampung.nextInt();//membaca ddan menyimpan hasil inputan yang berupa variable berat dan disimpan ke memori tampung pada class scanner
            //menentukan banyaknya data per kondisi
            if(0 <= berat&&berat<=20){//jika isi variable berat lebih besar sama dengan 0 dan berat lebih kecil sama dengan 20 maka
                a++;//isi variable a ditambah 1
            }else if(21<=berat&&berat<=40){//jika isi variable berat lebih besar sama dengan 21 dan berat lebih kecil sama dengan 40 maka
                b++;//isi variable b ditambah 1
            }else if(41<=berat&&berat<=60){//jika isi variable beat lebih besar sama dengan 41 dan berat lebih kecil sama dengan 60 maka
                c++;//isi variable c ditambah 1
            }else if(61<=berat&&berat<=80){//jika isi variable berat lebih besar sama dengan 61 dan berat lebih kecil sama dengan 80 maka
                d++;//isi variable d ditambah 1
            }else if(81<=berat&&berat<=100){//jika isi variable berrat lebih besar sama dengan 81 dan berat lebih kecil sama dengan 100 maka
                e++;//isi variable e ditambah 1
            }
            
        }
        //memulai penceakan dengan melakukan perulangan dengan batas yang diambil dari banyak data setiap kondisi diatas
        System.out.print("0-20 : ");//mencetak "0-20 : "
            for(int j=0;j<a;j++){//untuk perulangan j yang berisi 0,dengan kondisi j lebih kecil dari a,dan setiap perulangan isi variable j ditambah 1
            System.out.print("*");//mencetak "*"
            }
            System.out.println("");
            System.out.print("21-40 : ");//mencetak "21-40 : "
            for(int k=0;k<b;k++){//untuk perulangan k yang berisi 0,dengan kondisi k lebih kecil dari b,dan setiap perulangan isi variable k ditambah 1
                System.out.print("*");//mencetak "*"
            }
            System.out.println("");
            System.out.print("41-60 : ");//mencetak "41-60 : "
            for(int l=0;l<c;l++){//untuk perulangan l yang berisi 0,dengan kondisi l lebih kecil dari c,dan setiap perulangan isi variable l ditambah 1
                System.out.print("*");//mencetak "*"
            }
            System.out.println("");
            System.out.print("61-80 : ");//mencetak "61-80 : "
            for(int m=0;m<d;m++){//untuk perulangan m yang berisi 0,dengan kondisi m lebih kecil dari d,dan setiap perulangan isi variable m ditambah 1
                System.out.print("*");//mencetak "*"
            }
            System.out.println("");
            System.out.print("81-100 : ");//mencettak "81-100 : "
            for(int p=0;p<e;p++){//untuk perulangan p yang berisi 0,dengan kondisi p lebih kecil dari e,dan setiap perulangan isi variable p ditambah 1
                System.out.print("*");//mencetak "*"
            }
            System.out.println("");
    }
}

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
public class No4_modul10 {
    //deklarasi variable
    static int b;
    static double z;
    
    static int normal(int n,double z){//deklarasi metode normal
        double f,pangkat,p=0;//deklarasi variable berupa double
        p=(1/Math.sqrt(2*3.14))*2.71828;//menghitung f(z)
        pangkat=(-0.5)*Math.pow(z, 2);//menghitung pangakat
        f=Math.pow(p, pangkat);//menghitung nilai dari f
        return(int)Math.round(n*f);//mengembalikan pembulatan nilai
    }
    public static void bintang(int b){//deklarasi metode bintang
        for(int i=1;i<=b;i++){//untuk perulangan i yang berisi 1 dengan kondisi
            System.out.print("*");//mencetak "*"
        }
        System.out.println();//mencetak jeda 
    }
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner dengan nama tampung
        int n=0;//meminta tempat pada int unutk variable n yang berisi 0;
        normal(n, z);//memangil metode normal
        bintang(b);//memanggil metode bintang
        System.out.print("Masukan nilai N (sebaiknya 30 - 60) :");//mencetak "Masukan nilai N (sebaiknya 30 - 60) :"
        n=tampung.nextInt();//membaca dan menyimpan inputan
        
        for(double k = -4;k<=4;k+=0.25){//untuk perulangan k yang berisi -4 dengan kondisi
            int jumBintang=normal(n, k);//meminta tempat pada interger unutk variable jumBintang  dan rumus jumBintang
            bintang(jumBintang);//memangil metode bintang
        }
    }
}

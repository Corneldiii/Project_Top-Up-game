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
public class No3_modul10 {
    public static void main(String[] args) {
        //memanggil metode bacaTitik,hitungLuas
        bacaTitik();
        hitungLuas();
    }
    //deklarasi variable method
    static double keliling,a,b,c;
    //deklarasi hitungJarak
    static double hitungJarak(int x1,int y1,int x2, int y2){//fungsi hitungJarak yang berisi variable int dengan nama x1,y1,x2,y2
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));//menghitung hasil dari rumus jarak
    }
    //deklarasi hitungKeliling
    static double hitungKeliling(double a,double b,double c){//fungsi hitungKeliling yang berisi variable bertipe double dengan nama a,b,c
        keliling=a+b+c;//menghitung hasil dan disimpan ke keliling
        return keliling;//mengembalikan nilai keliling
    }
    //deklarasi hitungLuas
    static void hitungLuas(){
        double s=keliling/2;//menghitung hasil dan disimpan ke variable s
        double luas=Math.sqrt(s*(s-b)*(s-c));//rumus unutk mencari luas
        System.out.println("Luas : "+luas);//mencetak luas dan isi variable luas
    }
    static void bacaTitik(){//deklarasi method bacaTitik
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner untuk memori dengan nama tampung
        int ax,bx,cx;//meminta tempat pada int
        int ay,by,cy;//meminta tempat pada int
        
        System.out.println("Masukan titik A ");//mencetak "Masukan titik A "
        System.out.print("Masukan absis A : ");//mencetak "Masukan absis A : "
        ax=tampung.nextInt();//membaca dan menyimpan inputan
        System.out.print("Masukan Ordinan A : ");//mencetak "Masukan Ordinan A : "
        ay=tampung.nextInt();//membaca dan menyimpan inputan
        
        System.out.println("\n masukan titik B ");//mencetak "\n masukan titik B " dengan menjeda pada bagian atas
        System.out.print("Masukan Absis B : ");//mencetak "Masukan Absis B : "
        bx=tampung.nextInt();//membaca dan menyimpan inputan
        System.out.print("Masukan Ordinari B : ");//mencetak "Masukan Ordinari B : "
        by=tampung.nextInt();//membaca dan menyimpan inputan
        
        System.out.println("\n masukan Titik C ");//mencetak "\n masukan Titik C " dengan menjeda pada bagian atas
        System.out.print(" Masukan Absis C : ");//mencetak " Masukan Absis C : "
        cx=tampung.nextInt();//membaca dan menyimpan inputan
        System.out.print("Masukan Ordinan C : ");//mencetak "Masukan Ordinan C : "
        cy=tampung.nextInt();//membaca dan menyimpan inputan
        
        a=hitungJarak(ax,ay,bx,by);//menghitung jarak
        b=hitungJarak(bx,by,cx,cy);//menghitung jarak
        c=hitungJarak(ax,ay,cx,cy);//menghitung jarak
        System.out.println("Jarak : "+a+","+b+","+c);//mencetak jarak dan isi variable a b c
        
        double hasilKeliling=hitungKeliling(a,b,c);//rumus menghitung keliling
        System.out.println("Keliling : "+hasilKeliling);//mencetak "Keliling : " dan isi variable hasilKeliling
    }
}

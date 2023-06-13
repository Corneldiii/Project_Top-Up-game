/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab11;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No1_modul11 {
    public static void main(String[] args) {
        int[] skor,cadangan;//meminta array bertipe int dengan nama skor dan cadangan
        skor=new int[5];//meminta array skor sebanyak 5
        cadangan=skor;//masukan isi skor ke cadangan
        Scanner tampung=new Scanner(System.in);//meminta memori pada scanner dengan nama tampung
        System.out.println("Masukan 5 data bulat  : ");//mencetak Masukan 5 data bulat  : 
        for(int i=0;i<=4;i++){//untuk perulangan i yang berisi 0 dengan kondisi i lebih kecil sama dengan 4 dan setiap perulangan isi variable i ditambah 1
            System.out.println("Data ke "+(i+1)+":");//mencetak Data ke "+(i+1)+":
            skor[i]=tampung.nextInt();//membaca dan memasukan nilai input ke dalam array skor
        }
        System.out.println("Data skor : ");//mencetak Data skor : 
        for(int i=0;i<5;i++)System.out.println(skor[0+i]);//melakukan perulangan untuk mencetak isi array skor
        System.out.println("Data cadangan : ");//mencetak Data cadangan : 
        for(int i=0;i<5;i++)System.out.println(cadangan[0+i]);//melakukan perulangan untuk mencetak isi array cadangan
    }
}

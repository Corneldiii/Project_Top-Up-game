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
public class No1_modul9 {
    public static void main(String[] args){
        //meminta inputan
        Scanner tampung=new Scanner(System.in);//meminta tempat pada class scanner dengan nama tampung
        int N;//meminta tmpat pada int dengan nama N
        //meminta batas data
        System.out.print("Masukan batas data : ");//mencetak "Masukan batas data : "
        N=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable N dan disimpan ke memori tampung pada class scanner
        //melakukan perulangan
        for(int i=1;i<=N;i++){//untuk perulangan i yang berisi 1,saat kondisi i lebih kecil sama dengan N dan setiap perulangan variable i ditambah 1
            for(int j=1;j<=N;j++)//untuk perulangan j yang berisi 1,saat kondisi j lebih kecil sama dengan N dan setiap perulangan variable j ditambah 1
                if(i!=j){//jika isi variable i tidak sama dengan j maka
                    System.out.print(" 0");//mencetak " 0"
                }else if(i==j){//atau jika isi variable i sama dengan j maka
                    System.out.print(" 1");//mencetak " 1"
                    System.out.print("");
                }
            System.out.println("");
        }
    }
}

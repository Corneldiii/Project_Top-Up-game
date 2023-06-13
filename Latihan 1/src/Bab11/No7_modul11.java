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
public class No7_modul11 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        System.out.print("Banyak elemen : ");//mencetak "Banyak elemen : "
        int N=tampung.nextInt();//membaca dan menyimpan input ke N
        int [] angka=new int[N];//meminta array dengan nama angka sebanyak N
        for (int i = 0; i < angka.length; i++) {//perulangan i yang berisi 0 dengan kondisi i kurang dari panjang array angka,i ditambah 1
            System.out.print("Elemen ke "+(i+1)+" : ");//mencetak "Elemen ke "+(i+1)+" : "
            angka[i]=tampung.nextInt();//membaca dan menyimpan input ke array angka ke i
        }
        for (int i = 0; i < angka.length; i++) {//perulangan i yang berisi 0 dengan kondisi i kurang dari panjang array angka, i ditambah 1
            for (int j = 0; j < angka.length-1; j++) {//perulangan j yang berisi 0 dengan kondisi j kurang dari panjang array angka dikurangi 1,j ditambah 1
                if(angka[j]>angka[j+1]){//jika array angka ke j lebih besar dari array angka ke j ditambah 1
                    int simpan=angka[j];//simpan array angka ke j ke simpan
                    angka[j]=angka[j+1];//simpan array angka j ditamabh 1 ke array ke j
                    angka[j+1]=simpan;//simpan simpan ke array angka j ditambah 1
                }
            }
        }
        System.out.print("Urutannya adalah : ");//mencetak "Urutannya adalah : "
        for (int i = 0; i < angka.length; i++)System.out.print(angka[i]+" ");//mencetak isi array angka dengan perulangan
    }
}

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
public class No4_modul11 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori pada scanner dengan nama tampung
        int simpan=0,N=0;//meminta tempat pada int dengan nama simpan,N yang masing masing berisi 0
        double[] A={2,7,3,9,4,1,34,25,76,80,90,54,21,78};//meminta array bernama A dengan isi {2,7,3,9,4,1,34,25,76,80,90,54,21,78}
        System.out.println("Nilai yang dicari : ");//mencetak "Nilai yang dicari : "
        int nilai=tampung.nextInt();//membaca dan menyimpan input
        for(int i=0;i<14;i++){//perulangan i yang berisi 0 dengan kondisi i kurang dari 14, i ditambah 1
            if(nilai==A[i]){//jika nilai sama dengan array A ke i maka
                simpan+=A[i];//hitung hasil dari isi variable simpan ditambah array A ke i dan disimpan lagi ke simpan
                N+=i;//tambahkan N dengan i dan disimpan lagi ke N
            }
        }
        if(nilai!=simpan){//jika nilai tidak sama dengan simpan
            System.out.println("Nilai yang anda cari tidak ada!");//mencetak "Nilai yang anda cari tidak ada!"
        }else{//jika tidak 
        System.out.println("angka yang anda cari ada di indeks : "+N);//mencetak "angka yang anda cari ada di indeks : "+N
        }
    }
}

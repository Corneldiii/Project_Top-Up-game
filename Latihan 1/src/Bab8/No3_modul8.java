package Bab8;
import java.util.Scanner;
public class No3_modul8 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta tempat pada class scanner dengan nama tampung
        int simpan,tambah=1,tambahLagi=0;//meminta tempat pada int dengan nama simpan,tambah=1,tambahLagi=0
        
        System.out.print("Masukan berapa banyak data : ");//mencetak Masukan berapa banyak data : 
        int N=tampung.nextInt();//membaca hasil inputan yang berupa variable int dengan nama N dan disimpan ke memori pada class scanner
        
        for(int i=1;i<=N;i++){//untuk i yang berupa int dan berisi 1,lalu i kurang dari sama degan N,dan unutk setiap perulangan isi variable i ditambah dengan 1
            simpan=tambah;//menyimpan isi variable tambah ke simpan
            tambah=tambahLagi;//menyimpan isi variable tambahLagi ke tambah
            tambahLagi=simpan+tambah;//menghitung hasil dari isi variable simpan ditambah dengan tambah dan disimpan ke tambahLagi
            System.out.print(tambahLagi+",");//mencetak tambahLagi+","
        }
        
    }
}
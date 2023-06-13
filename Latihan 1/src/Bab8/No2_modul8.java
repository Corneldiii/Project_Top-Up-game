package Bab8;
import java.util.Scanner;
public class No2_modul8 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta tempat pada scanner dengan nama tampung
        double x,N,jumlahKuadrat=0.0,jumlahAkar=0.0;//meminta tempat pada double untuk variable x,N,jumlahKuadrat=0.0,jumlahAkar=0.0
        double kuadrat,akar,per,jumlahData=0.0;//meminta tempat pada double unut variable kuadrat,akar,per,jumlahData=0.0
        System.out.print("Masukan jumlah batas : ");//mencetak Masukan jumlah batas : 
        N=tampung.nextInt();//membaca inputan berua variable N dan disimpan ke memori tampung pada class scanner
        for(int i=1;i<=N;i++){//untuk int i yang berisi 1,lalu isi variable i lebih kecil sama dengan N ,dan unutk setiap perulangan isi variable i ditambah 1
            System.out.print("Masukan nilai X"+i+" : ");//mencetak Masukan nilai X"+i+" : 
            x=tampung.nextInt();//membaca hasil inputan yang berupa variable x dan disimpan ke memori tampung pada class scanner
            kuadrat= Math.pow(x, 2);//menghitung hasil dari Math.pow(x, 2) dan disimpan ke variable kuadrat
            jumlahKuadrat+=kuadrat;//menghitung hasil dari isi variable jumKuadrat ditambah dengan isi variable kuadrat dan disimpan kembali ke variable jumKuadrat
            akar=Math.sqrt(x);//menghitung hasil dari Math.sqrt(x) dan disimpan kevariable akar
            jumlahAkar+=akar;//menghitung hasil dari isi variable jumlahAkar ditambah dengan akar dan disimpan kembali ke variable jumlahKuadrat
            per=1.0/x;//menghitung hasil daari 1.0/x dan disimpan ke variable per
            jumlahData+=per;//menghitung hasil dari isi variable jumlahData ditambah dengan per dan disimpan kembali ke variable jumlahData
            
        }
        System.out.println("Jumlah kuadrat data diatas : "+jumlahKuadrat);//mencetak Jumlah kuadrat data diatas : "+jumlahKuadrat
        System.out.println("Jumlah akar data diatas : "+jumlahAkar);//mencetak Jumlah akar data diatas : "+jumlahAkar
        System.out.println("Jummlah 1/x data diatas : "+jumlahData);//mencetak Jummlah 1/x data diatas : "+jumlahData
    }
}

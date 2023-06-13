package Bab6;
import java.util.Scanner;
public class No2_modul6 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        double data,nilai,rata,jumlah=0;//meminta tempat pada double dengan nama data,nilai,rata,jumlah yang berisi 0
        int N=1;//meminta tempat pada interger dengan nama N yang berisi 1
        System.out.print("Masukan berapa banyak data yang diproses  : ");//mencetak tulisan Masukan berapa banyak data yang diproses  : 
        data=tampung.nextInt();//membaca hasil inputan dan disimpan ke memori tampung pada class scanner
       while(N<=data){//selama isi dari variable N kurang dari sama dengan isi variable data maka program akan terus berjalan
            System.out.print("Data ke "+N+ ": ");//mencetak Data ke"+N+ ": "
            nilai=tampung.nextInt();//membaca hasil inputan dan disimpan ke memori tampung pada class scanner
            N++;//menambahkan isi variable N dengan +1
            jumlah+=+nilai; //menghitung hasil dari penjumlahan isi variable jumlah dengan isi variable nilai dan disipan ke variable jumlah
           
        }
        rata=jumlah/data;//menghitung hasil dari isi variable jumlah di bagi dengan isi variable data dan disimpan ke variable rata
        System.out.println("Rata rata yang anda dapatkan    : "+rata);//mencetak Rata rata yang anda dapatkan    : "+rata
    }
}

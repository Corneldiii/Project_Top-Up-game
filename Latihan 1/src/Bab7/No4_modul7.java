/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No4_modul7 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);//meminta memori dengan nama tampung pada class scanner
        int data,nilai,N=1,max=0,min=0;//meminta tempat pada interger dengan nama data,nilai,N yang berisi 1 ,max dan min yang masing masing berisi 0
        double rata,jumlah=0,variasi,deviasi,rentang;//meminta tempat pada double dengan nama rata,jumlah yang bersis 0,variasi,deviasi, dan rentang
        double kuadratN,jumKuadrat=0;//meminta tempat pada double unutk variable dengan nama kuadratN dan jumKuadrat yang berisi 0
        System.out.print("Masukan berapa banyak data yang diproses  : ");//mencetak tulisan Masukan berapa banyak data yang diproses  : 
        data=tampung.nextInt();//membaca hasil inputan yang berupa variable data dan disimpan ke memori tampung pada class scanner
        do{//kerjakan minimal sekali
            System.out.print("Data ke "+N+ ": ");//mncetak Data ke"+N+ "
            nilai=tampung.nextInt();//membaca hasil inputan yang berupa variable dengan nama nilai dan disimpan ke memori pada class scanner
            
            jumlah=jumlah+nilai; //mengisi varoable jumlah dengan hasil dari isi variable jumlah ditambah dengan isi variable nilai
            kuadratN=Math.pow(nilai,2);//mengisi variable kuadratN dengan hasil dari isi variable nilai kuadrat
            jumKuadrat=jumKuadrat+kuadratN;//mengisi variable jumKuadrat dengan hasil dari variable jumKuadrat ditambah kuadratN
            if(N==1){//jika isi variable N sama dengan 1 maka 
               max=nilai;//memasukan isi variable nilai ke variable max
               min=nilai;//memasukan isi variable nilai ke variable min
           }else{//jika tidak 
               if(nilai<min)min=nilai;//jika variable nilai lebih kecil dari isi variable min,maka variable min diisi dengan isi variable nilai
               if(nilai>max)max=nilai;//jika variable nilai lebih besar dari isi variable max,maka variable max diisi dengan isi variable nilai
               
           }
              N++;//menambahkan isi variable N dengan +1 
        }while(N<=data);//selama isi variable N lebih kecil sama dengan data program akan tersu diulang
        
        rata=jumlah/data;//menghitung hasil dari isi variable jumlah di bagi dengan isi variable data dan disimpan ke variable data
        variasi=(jumKuadrat-(data*Math.pow(rata, 2)))/N;//menghitung hasil dari isi variable jumlah di kurangi dengan hasil dari perkalian isi variable N dengan isi variable rata kuadrat lalu di bagi dengan isi variable N dan disimpan ke variable variasi
        deviasi=Math.sqrt(variasi);//menghitung hasil dari akar kuadrat dari variable variasi dan disimpan ke variable deviasi
        rentang=max-min;//menghitung hasil dari isi variable max dikurang dengan isi variable min dan disimpan ke variable rentang
        System.out.println("Rata rata yang anda dapatkan    : "+rata);//mencetak Rata rata yang anda dapatkan    : "+rata
        System.out.println("Maka rentang datanya adalah : "+rentang);//mencetak Maka rentang datanya adlaah : "+rentang
        System.out.println("Maka angka terbesar adalah : "+max);//mencetak Maka angka terbesar adalah : "+max
        System.out.println("Maka angka terkecil adalah  : "+min);//mencetak Maka angka terkecil adalah  : "+min
        System.out.println("Maka nilai variasinya adalah    : "+variasi);//mencetak Maka nilai variasinya adalah    : "+variasi
        System.out.println("Maka nilai dari deviasi adalah  : "+deviasi);//mencetak Maka nilai dari deviasi adalah  : "+deviasi

    }
}

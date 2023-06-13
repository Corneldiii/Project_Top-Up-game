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
public class No3_modul11 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori dengan nama tampung ke scanner
        int jumlah=0,max=0,min=0,N;//meminta tempat pada int dengan nama jumlah,max,min yang masing masing berisi 0 dan N
        System.out.println("Berapa banyak array : ");//mencetak "Berapa banyak array : "
        N=tampung.nextInt();//membaca dan menyimmpan inputan ke N
        int[] skor=new int[N];//meminta array bertipe int dengan nama skor sebanyak N
        System.out.println("Masukan "+N+" data : ");//mencetak "Masukan "+N+" data : "
        for(int i=0;i<N;i++){//untuk perulangan i yang berisi 0 dengan kondisi i kurang dari N, i ditambah 1
            System.out.print("Data ke "+(i+1)+":");//mencetak "Data ke "+(i+1)+":"
            skor[i]=tampung.nextInt();//membaca dan menyimpan inputan ke array skor i
            jumlah +=skor[i] ;//memasukan isi array skor ke jumlah lalu disimpan kembali ke jumlah
            if(i==0){//jika i sama dengan 0
               max=skor[i];//masukan nilai array i ke max
               min=skor[i];//masukan nilai  array i ke min
           }else{//jika tidak 
               if(skor[i]<min)min=skor[i];//jika nilai array i kurang dari min,maka masukan nilai array i ke min
               if(skor[i]>max)max=skor[i];//jika nilai array i lebih dari min,maka masukan nilai array i ke max
               
           }
        }
        
        
                
        System.out.println(" jumlah "+jumlah);//mencetak "jumlah "+jumlah
        System.out.println("Rata rata : "+jumlah/N);//mencetak "Rata rata : "+jumlah/5
        System.out.println("Nilai Max : "+max);//mencetak "Nilai Max : "+max
        System.out.println("Nilai Min : "+min);//mencetak "Nilai Min : "+min
    }
    
}

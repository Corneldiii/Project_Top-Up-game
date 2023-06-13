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
public class No2_modul11 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori pada scanner dengan nama tampung
        int jumlah=0,max=0,min=0;//meminta tempat pada int dengan nama jumlah,max,min yang masing masing berisi 0
        int[] skor=new int[5];//meminta array bertipe int dengan nama skor sebanyak 5
        System.out.println("Masukan 5 data : ");//mencetak "Masukan 5 data : "
        for(int i=0;i<5;i++){//untuk perulangan i yang berisi 0 dengan kondisi i kurang dari 5 i dtambah 1
            System.out.println("Data ke "+(i+1)+":");//mencetak Data ke "+(i+1)+":
            skor[i]=tampung.nextInt();//membaca dan menyimpan inputan ke arrat skor
            jumlah +=skor[i] ;//memasukan isi array skor ke jumlah lalu disimpan kembali ke jumlah
            if(i==0){//jika i sama dengan 0
               max=skor[i];//masukan nilai array i ke max
               min=skor[i];//masukan nilai  array i ke min
           }else{//jika tidak 
               if(skor[i]<min)min=skor[i];//jika nilai array i kurang dari min,maka masukan nilai array i ke min
               if(skor[i]>max)max=skor[i];//jika nilai array i lebih dari min,maka masukan nilai array i ke max
               
           }
        }
        
        
                
        System.out.println("jumlah "+jumlah);//mencetak "jumlah "+jumlah
        System.out.println("Rata rata : "+jumlah/5);//mencetak "Rata rata : "+jumlah/5
        System.out.println("Nilai Max : "+max);//mencetak "Nilai Max : "+max
        System.out.println("Nilai Min : "+min);//mencetak "Nilai Min : "+min
        
    }
    
}

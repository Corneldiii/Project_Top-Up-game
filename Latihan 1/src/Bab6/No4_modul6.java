package Bab6;
import java.util.Scanner;
public class No4_modul6 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);//meminta memori pada scanner dengan nama tampung
        
        int  berat,proses,N=1,B1=0,B2=0,B3=0;//meminta temmpat pada integer dengan nama berat,proses,N yang berisi angka 1,B1 yang berisi angka 0,B2 yang berisi angka 0,B3 yang berisi angka 0
        
        System.out.print("Banyak mangga yang diproses :");//mencetak tulisan Banyak manga yang diproses :
        proses=tampung.nextInt();//membaca hasil inputan brupa variable dengan nama proses dan disimpan ke memori tampung pada class scanner
        
        while(N<=proses){//selama isi variable N kurang dari sama dengan proses maka program akan berjala terus
            System.out.print("Masukan berat mangga "+N+"    : ");//mencetak tulisan "Masukan berat mangga "+N+"    : 
            berat=tampung.nextInt();//membaca hasil inputan brupa variable dengan nama berat dan disimpan ke memori tampung pada class scanner
            N++;  //menambahkan isi variable N dengan +1
            if(berat  < 200 ){//jika isi variable berat kurang dari 200 maka 
                B1++;//menambahkan isi bvariable B1 dengan +1
            }
            if(200 <= berat && berat < 600 ){//jika isi variable berat lebih besar sama dengan 200 atau berat lebih kecil dari 600 maka
                B2++;//menambahkan isi variable B2 dengan +1
            }
            if(berat>=600){//jika isi variable berat lebih besar dari 600 maka
                B3++;//menambahkan isi variable B3 dengan +1
            }
        }
            
        
        System.out.println("Maka buah mangga yang kecil ada : "+B1+" buah");//mencetak tulisan "Maka buah mangga yang kecil ada : "+B1+" buah"
        System.out.println("Maka buah mangga yang Sedang ada : "+B2+" buah");//mencetak tulisan Maka buah mangga yang Sedang ada : "+B2+" buah
        System.out.println("Maka buah mangga yang Besar ada : "+B3+" buah");//mencetak tulisan Maka buah mangga yang Besar ada : "+B3+" buah
        
    }
}

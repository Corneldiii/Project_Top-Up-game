package Bab8;
import java.util.Scanner;
public class No1_modul8 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta tempat pada class scanner dengan nama tampung
        String susunan;//meminta tempat pada String unutk variable dengan nama susunan
        int r,N,tahanan;//meminta pada int untuk tempat dengan nama r,n,dan tahanan
        double per,rtSeri=0.0,rtPararel=0.0;//meminta tempat pada double unutk tempat dengan nama per,rtSeri=0.0,rtPararel=0.0

        
        System.out.print("Jenis susunan tahanan resistor : ");//mencetak Jenis susunan tahanan resistor : 
        susunan=tampung.next();//membaca hasil inputan dan disimpan ke variable susunan pada class scanner
        if("seri".equalsIgnoreCase(susunan)){//jika isi variable susunan adalah seri maka
            System.out.print("Masukan banyak tahanan : ");//mencetak Masukan banyak tahanan : 
            N=tampung.nextInt();//membaca hasil inputan dan disimpan ke variable N pada class scanner
            for(r=1;r<=N;r++){//untuk r berisi variable 1,lalu isi variable r lebih kecil sama dengan isi variable N, dan unutk setiap perulangan r diatambahkan dengan 1
                System.out.print("Masukan tahanan ke "+r+" : ");//mencetak Masukan tahanan ke "+r+" : 
                tahanan=tampung.nextInt();//membaca hasil inputan dan disimpan ke variable tampung pada class scanner
                rtSeri+=tahanan; //menambah isi variable rtSeri dengan tahanan dan disimpan lagi ke variable rtSeri
            }
            System.out.println("Maka jumlah dari tahanan melalui susunan seri : "+rtSeri);//mencetak Maka jumlah dari tahanan melalui susunan seri : "+rtSeri
        }else if("pararel".equalsIgnoreCase(susunan)){//atau jika isi variable susunan sama dengan pararel maka 
            System.out.print("Masukan banyak tahanan : ");//mencetak Masukan banyak tahanan : 
            N=tampung.nextInt();//membaca hasil inputan berupa variable N dan disimpan ke memori tampung pada class scanner
            for(r=1;r<=N;r++){//unutk r sama dengan 1, lalu isi variable r lebih keccil sama dengan N,dan unutk setiap perulanngan isi variable r ditambah 1
                System.out.print("Masukan tahanan ke "+r+" : ");//mencetak Masukan tahanan ke "+r+" : 
                tahanan=tampung.nextInt();//membaca hasil inputan berupa variable tahanan dan disimpan ke memori pada class scanner
                per=1.0/tahanan;//menghitung hasil dari 1.0/tahanan dan disimpan ke variable per
                rtPararel+=per;//menambahakan isi variable rtPararel dengan per lalu disimpan kembli ke rtPararel
                
            }
            System.out.println("Maka jumlah dari tahanan melalui susunan pararel : "+rtPararel);//mencetak Maka jumlah dari tahanan melalui susunan pararel : "+rtPararel
            
        }
    }
}

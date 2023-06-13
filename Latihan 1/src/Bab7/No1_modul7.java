package Bab7;
import java.util.Scanner;
public class No1_modul7 {
    public static void main(String[] args){//deklarasi metode main
        Scanner tampung=new Scanner(System.in);//meminta mememori dengan nama tampung
        int a,b,c;//meminta tempat pada interger dengan nama a,b,c
        double X1,X2,D;//meminta tempat pada double dengan nama X1,X2,D
        
        do{//kerjakan program
            System.out.print("Masukan nilai a : ");//menceetak tulisan Masukan nilai a : 
            a=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable a interger ke memori tampung pada class scanner
            System.out.print("Masukan nilai b : ");//mencetak tulisan Masukan nilai b : 
            b=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable b interger ke memori tampung pada class scanner
            System.out.print("Masukan nilai c : ");//menceetak tulisan Masukan nilai c : 
            c=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable c interger ke memori tampung pada class scanner
        }while(a==0);//selama ekspresi boolean bernilai benar program akan terus di ulang
        
        
        D=Math.pow(b, 2)-4*a*c;//mengisi variable D dengan hasil dari perhitungan b kuadrat di kurangi dengan 4 dikali a dikali c
        if(D==0){//jika D sama denggann 0 maka
            System.out.println("Jenis akar ini : mempunyai akar kembar");//mencetak tulisan Jenis akar ini : mempunyai akar kembar
        }else if (D>0){//atau jika D lebih besar dari 0 maka program dijalankan
            System.out.println("Jenis akar ini : mempunyai akar real");//mencetak tulisan Jenis akar ini : mempunyai akar real
        }else if(D<0){//atau jika Dlebih kecil dari 0 maka program di jalankan
            System.out.println("Jenis akar ini : tidak mempunyai akar real");//mencetak tulisan Jenis akar ini : tidak mempunyai akar real
        }
        X1=(-b+Math.sqrt(D))/(2*a);//mengisi variable X1 dengan hasil dari perhitungan (-b+Math.sqrt(D))/(2*a)
        X2=(-b-Math.sqrt(D))/(2*a);//mengisi variable X2 dengan hasil dari perhitungan (-b-Math.sqrt(D))/(2*a)
        
        System.out.print("Hasil dari akar persamaan kuadrat di atas adalah : X1="+X1+", X2="+X2+")");//mencetak Hasil dari akar persamaan kuadrat di atas adalah : X1="+X1+", X2="+X2+")
    }
}

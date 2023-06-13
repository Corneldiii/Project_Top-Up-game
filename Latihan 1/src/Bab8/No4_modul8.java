package Bab8;
import java.util.Scanner;
public class No4_modul8 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta tempat pada class scanner dengan nama tampung
        int a,b,c;//meminta tempat pada int dengan nama a,b,c
        double X1,X2,Y,D,awal,akhir;//meminta tempat ada double dengan nama X1,X2,Y,D,awal,akhir
        
        System.out.print("Masukan nilai A : ");//mencetak Masukan nilai A : 
        a=tampung.nextInt();//membaca hasil inputan yang berupa variable a dan disimpan ke memori tampung pada class scanner
        System.out.print("Masukan nilai B : ");//mencetak Masukan nilai B : 
        b=tampung.nextInt();//membaca hasil inputan yang berupa variable b dan disimpan ke memori tampung pada class scanner
        System.out.print("Masukan nilai C : ");//mencetak Masukan nilai C : 
        c=tampung.nextInt();//membaca hasil inputan yang berupa variable c dan disimpan ke memori tampung pada class scanner
        
        D=Math.pow(b, 2)-4*a*c;//menghitung hasil dari Math.pow(b, 2)-4*a*c dan disimpan ke variable D
        System.out.println("----------------------------------------------------------");//mencetak ----------------------------------------------------------
        System.out.println("    X                   Y="+a+"X2 + "+b+"X + "+c+"");//mencetak     X                   Y="+a+"X2 + "+b+"X + "+c+"
        System.out.println("----------------------------------------------------------");//mencetak ----------------------------------------------------------
        if(D>0){//jika isi variable D lebih dari 0
            X1=(-b+Math.sqrt(D))/(2*a);//menghitung hasil dari (-b+Math.sqrt(D))/(2*a) dan disimpan ke variable X1
            X2=(-b-Math.sqrt(D))/(2*a);//menghitung hasil dari (-b-Math.sqrt(D))/(2*a) dan disimpan ke variable X2
            System.out.println("Dari persamaan Y= "+a+"X2 + "+b+"X + "+c+"");//mencetak Dari persamaan Y= "+a+"X2 + "+b+"X + "+c+"
            System.out.println("Akar akarnya adalah "+X1+" dan "+X2+"");//mencetak Akar akarnya adalah "+X1+" dan "+X2+"
            if(X1<X2){//jika isi vaariable X1 lebih kcil dari X2 maka
                awal=X1;//masukan isi variable X1 ke variable awal
                akhir=X2;//memasukan isi variable X2 ke variable akhir
                for(double i=awal;i<=akhir;i+=0.25){//untuk i yang berjenis double di isi dengan variable awal,lalu i lebih kecil sama dengan isi variable akhir,dan untuk setiap perulangan isi variable i ditambah dengan 0.25
                    Y=a*Math.pow(i,2)+b*i+c;//menghitung hasil dari a*Math.pow(i,2)+b*i+c dan disimpan ke Y
                    System.out.println(""+i+"                 Y= "+a+"."+i+" + "+b+""+i+" + "+c+"= "+Y); //mencetak "+i+"                 Y= "+a+"."+i+" + "+b+""+i+" + "+c+"= "+Y
            }
              }else{//jika tidak 
                awal=X2;//masukan isi variable X2 ke variable awal
                akhir=X1;//memasukan isi variable X1 ke variable akhir
                for(double i=awal;i<=akhir;i+=0.25){//untuk i yang berjenis double di isi dengan variable awal,lalu i lebih kecil sama dengan isi variable akhir,dan untuk setiap perulangan isi variable i ditambah dengan 0.25
                    Y=a*Math.pow(i, 2)+b*i+c;//menghitung hasil dari a*Math.pow(i,2)+b*i+c dan disimpan ke Y
                    System.out.println(""+i+"                 Y= "+a+"."+i+" + "+b+""+i+" + "+c+"= "+Y);//mencetak "+i+"                 Y= "+a+"."+i+" + "+b+""+i+" + "+c+"= "+Y
            }
            }
            
            System.out.println("==========================================================");//mencetak ==========================================================
        
                    
    }
    }
}

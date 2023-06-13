/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No4_modul9 {
    public static void main(String[] args) {
        //meminta input 
        Scanner tampung=new Scanner(System.in);//meminta tempat pada canner unutk memor dengan nama tampung
        int pilih,a=0,b=0,c=0,d=0,e=0,berat,N;//meminta input pada int dengan nama variable pilih,a=0,b=0,c=0,d=0,e=0,berat,N
        int jumlah=0,rata,rataN=0;//meminta input pada int dengan nama variable jumlah=0,rata,rataN=0,n=0
        double kuadratN,jumlahKuadrat=0,variasi,variasiN=0,deviasi;//meminta tempat pada double unutk variable dengan nama kuadratN,jumlahKuadrat=0,variasi,variasiN=0,deviasi
        boolean menu=true;//meminta variable boolean dengan nama menu dan bernilai true
        //memulai perulangan dengan do dan meminta input
        do{//kerjakan minimal sekali
            System.out.println("-----------------------------");//mencetak ---
            System.out.println("1.Masukan data usia");//mencetak 1. masukan data usia
            System.out.println("2. Rata-rata");//mencetak 2. rata-rata
            System.out.println("3. Deviasi standar");//mencetak 3. Deviasi standar
            System.out.println("4. Diagram batang");//mencetak 4. Diagram batang
            System.out.println("5. keluar");//mencetak 5. keluar
            System.out.print("Pilih : ");//mencetak pilih : 
            pilih=tampung.nextInt();//membaca dan menyimpan hasil inputan dan disimpan ke memori tampung pada clss scanner dengan nama variable pilih
            //memulai pengambilan keputusan
            switch (pilih) {//jikalau
                case 1://isi variable pilih sama dengan 1
                    System.out.println("Masukan banyak data : ");//mencetak Masukan banyak data : 
                    N=tampung.nextInt();//membaca dan menyimpan hasil inputan yang berupa variable n dan disimpan ke memori tampung pada class scanner
                    
                    for(int i=1;i<=N;i++){//untuk perulangan variable i yang berisi 1 dengan kondisi i lebih kecil sama dengan N dan unutk setiap perulangan isi variable i ditambah dengan 1
                        System.out.print("masukan usia "+i+" = ");//mencetak masukan usia "+i+" = 
                        berat=tampung.nextInt();//membaca dan menyimpan inputan berupa variable dengan nama berat dan disimpan ke memori tampung pada class scanner
                        jumlah+=berat;//menambahkan isi variable jumlah dengan isi variable berat
                        kuadratN=Math.pow(berat, 2);//menghitung hasil dari isi variable berat pangkat dua dan disimpan ke keuadratN
                        jumlahKuadrat+=kuadratN;//menambahkan isi variable jumlahKuadrat dengan kuadratN
                        if(0 <= berat&&berat<20){//jika isi variable berat llebih besar sama dengan 0 dan berat lebih kecil sama dengan 20 maka
                            a++;//menambahkan isi variable a dengan 1
                        }else if(21<=berat&&berat<=40){//jika isi variable berat llebih besar sama dengan 21 dan berat lebih kecil sama dengan 40 maka
                            b++;//menambahkan isi variable b dengan 1
                        }else if(41<=berat&&berat<=60){//jika isi variable berat llebih besar sama dengan 41 dan berat lebih kecil sama dengan 60 maka
                            c++;//menambahkan isi variable c dengan 1
                        }else if(61<=berat&&berat<=80){//jika isi variable berat llebih besar sama dengan 61 dan berat lebih kecil sama dengan 80 maka
                            d++;//menambahkan isi variable d dengan 1
                        }else if(81<=berat&&berat<=100){//jika isi variable berat llebih besar sama dengan 81 dan berat lebih kecil sama dengan 40 maka
                            e++;//menambahkan isi variable e dengan 1
                        }
                    }
                    rata=jumlah/N;//menghitung hasil dari isi variable jumlah dibagi variable n
                    rataN+=rata;//menjumlahkan isi variable rataN dengan rata dan disimpan lagi ke rataN
                    variasi=(jumlahKuadrat-(N*Math.pow(rataN, 2)))/N;//menghitung hasil dari (jumlahKuadrat-(n*Math.pow(rata, 2)))/n dan disimpan ke variasi
                    variasiN+=variasi;//menjumlahkan isi variable variasiN dengan variasi dan disimpan lagi ke variasiN
                    
                    break;
                case 2://isi variable pilih sama dengan 2
                    System.out.println("Rata rata nya adalah : "+rataN);//mencetak Rata rata nya adalah : "+rata
                    
                    break;
                case 3://isi variable pilih sama dengan 3
                    deviasi=Math.sqrt(variasiN);//menghitung hasil dari akar isi variable variasi
                    System.out.println("deviasi standartnya : "+deviasi);//mencetak deviasi standartnya : "+deviasi
                    break;
                case 4://isi variable pilih sama dengan 4
                    System.out.print("0-20 : ");//mencetak 0-20
                    for(int j=0;j<a;j++){//untuk perulangan j yang berisi 0 dengan kondisi j kurang dari variable a dan unutk setiap perulangan isi variable j ditambah 1
                    System.out.print("*");//mencetak *
                }
                    System.out.println("");
                    System.out.print("21-40 : ");//mencetak 21-40
                    for(int k=0;k<b;k++){//untuk perulangan k yang berisi 0 dengan kondisi k kurang dari variable b dan unutk setiap perulangan isi variable k ditambah 1
                    System.out.print("*");//mencetak *
                }
                    System.out.println("");
                    System.out.print("41-60 : ");//mencetak 41-60
                    for(int l=0;l<c;l++){//untuk perulangan l yang berisi 0 dengan kondisi l kurang dari variable c dan unutk setiap perulangan isi variable l ditambah 1
                    System.out.print("*");//mencetak *
                }
                    System.out.println("");
                    System.out.print("61-80 : ");//mencetak 61-80
                    for(int m=0;m<d;m++){//untuk perulangan m yang berisi 0 dengan kondisi m kurang dari variable d dan unutk setiap perulangan isi variable m ditambah 1
                    System.out.print("*");//mencetak *
                }
                    System.out.println("");
                    System.out.print("81-100 : ");//mencetak 81-100
                    for(int p=0;p<e;p++){//untuk perulangan p yang berisi 0 dengan kondisi p kurang dari variable e dan unutk setiap perulangan isi variable p ditambah 1
                    System.out.print("*");//mencetak *
                }
                    System.out.println("");
                    break;
                case 5://isi variable pilih sama dengan 5
                    menu=false;//ubah nilai boolean variable menu menjadi false
                    break;
            }
        
        }while(menu);//perulangan akan berhenti tergantung nilai dari variable menu yang bernilai true atau false
    }
}

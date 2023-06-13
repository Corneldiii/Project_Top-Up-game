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
public class No8_modul11 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);//meminta memori dengan nama tampung pada scanner
        System.out.print("Masukan jumlah mahasiswa : ");//mencetak "Masukan jumlah mahasiswa : "
        int N=tampung.nextInt();//membaca dan menyimpan input ke N
        String[] nim=new String[N];//meminta array bertipe string dengan nama nim sebanyak N
        String[] nama=new String[N];//meminta array bertipe string dengan nama nama sebanyak N
        double[] us1=new double[N];//meminta array bertipe double dengan nama us1 sebanyak N
        double[] us2=new double[N];//meminta array bertipe double dengan nama us2 sebanyak N
        double[] uas=new double[N];//meminta array bertipe double dengan nama uas sebanyak N
        double[] totalNil=new double[N];//meminta array bertipe double dengan nama totalNil sebanyak N
        char[] finalNil=new char[N];//meminta array bertipe char dengan nama finalNil sebanyak N
        
        for (int i = 0; i < N; i++) {//untuk perulangan i yang beris 0 dengan kondisi i kurang dari N,i ditambah 1
            System.out.print("Masukan nama ke "+(i+1)+" : ");//mencetak "Masukan nama ke "+(i+1)+" : "
            nama[i]=tampung.next();//membaca dan menyimpan input ke array nama ke i
            System.out.print("Masukan NIM : ");//mencetak "Masukan NIM : "
            nim[i]=tampung.next();//membaca dan menyimpan input ke array nim ke i
            System.out.print("Masukan nilai US1 : ");//mencetak "Masukan nilai US1 : "
            us1[i]=tampung.nextDouble();//membaca dan menyimpan input ke array us1 ke i
            System.out.print("Masukan nilai US2 : ");//mencetak "Masukan nilai US2 : "
            us2[i]=tampung.nextDouble();//membaca dan menyimpan input ke array us2 ke i
            System.out.print("Masukan nilai UAS : ");//mencetak "Masukan nilai UAS : "
            uas[i]=tampung.nextDouble();//membaca dan menyimpan input ke array uas ke i
            
            totalNil[i]=0.3*us1[i]+0.3*us2[i]+0.4*uas[i];//menghitung hasil 0.3*us1[i]+0.3*us2[i]+0.4*uas[i] dan disimpan ke totalNil ke i
            if (80<=totalNil[i]&&totalNil[i]<=100) {//jika totalNil ke i lebih besar sama dengan 80 dan lebih kecil sama dengan 100
                finalNil[i]='A';//isi array finalNil dengan char A
            }else if (65<=totalNil[i]&&totalNil[i]<80) {//jika totalNil ke i lebih besar sama dengan 65 dan totalNil ke i kurang dari 80
                finalNil[i]='B';//isi array finalNil dengan char B  
            }else if (55<=totalNil[i]&&totalNil[i]<65) {//jika totalNil ke i lebih besar sama dengan 55 dan totalNil ke i lebih kecil dari 65
                finalNil[i]='C';//isi array finalNil dengan char C
            }else if (45<=totalNil[i]&&totalNil[i]<55) {//jika totalNil ke i lebih besar sama dengan 45 dan totalNil ke i lebih kecil dari 55
                finalNil[i]='D';//isi array finalNil dengan char D
            }else if (totalNil[i]<45) {//jika totalNil ke i lebih kecil daari 45
                finalNil[i]='E';//isi array finalNil dengan char E
            }
        }
        for (int i = 0; i < totalNil.length; i++) {//perulangan i yang berisi 0 dengan kodisi i kurang dari panjang totalNil i ditambah 1
            for (int j = 0; j < totalNil.length-1; j++) {//perulangan j yang berisi 0 dengan kodisi j kurang dari panjang totalNil dikurangi 1, i ditambah 1
                if(totalNil[j]<totalNil[j+1]){//jika totalNil ke j kurang dari totalNil ke j ditamabh 1
                    
                    double simpan=totalNil[j+1];//simpan isi array totalNil[j+1} ke simpan yang bertipe double
                    totalNil[j+1]=totalNil[j];//simpan isi array totalNil[j] ke totalNil[j+1]
                    totalNil[j]=simpan;//simpan isi variable simpan ke totalNil[j]
                    double simpan2=us1[j+1];//simpan isi array us1[j+1} ke simpan2 yang bertipe double
                    us1[j+1]=us1[j];//simpan isi array us1[j] ke us1[j+1]
                    us1[j]=simpan2;//simpan isi variable simpan2 ke us1[j]
                    double simpan3=us2[j+1];//simpan isi array us2[j+1} ke simpan3 yang bertipe double
                    us2[j+1]=us2[j];//simpan isi array us2[j] ke us2[j+1]
                    us2[j]=simpan3;//simpan isi variable simpan3 ke us2[j]
                    double simpan4=uas[j+1];//simpan isi array uas[j+1} ke simpan4 yang bertipe double
                    uas[j+1]=uas[j];//simpan isi array uas[j] ke uas[j+1]
                    uas[j]=simpan4;//simpan isi variable simpan4 ke uas[j]
                    char simpan5=finalNil[j+1];//simpan isi array finalNil[j+1} ke simpan5 yang bertipe double
                    finalNil[j+1]=finalNil[j];//simpan isi array finalNil[j] ke finalNil[j+1]
                    finalNil[j]=simpan5;//simpan isi variable simpan5 ke finalNil[j]
                    String simpan6=nama[j+1];//simpan isi array nama[j+1} ke simpan6 yang bertipe double
                    nama[j+1]=nama[j];//simpan isi array nama[j] ke nama[j+1]
                    nama[j]=simpan6;//simpan isi variable simpan6 ke nama[j]
                    String simpan7=nim[j+1];//simpan isi array nim[j+1} ke simpan7 yang bertipe double
                    nim[j+1]=nim[j];//simpan isi array nim[j] ke nim[j+1]
                    nim[j]=simpan7;//simpan isi variable simpan7 ke nim[j]
                    
                }
            }
        }
        //mencetak list mahasiswa
            System.out.println("No.         NIM         Nama            US1         US2         UAS         TOTAL       FINAL");//mencetak "No.         NIM         Nama            US1         US2         UAS         TOTAL       FINAL"
            System.out.println("=================================================================================================");
        for (int i = 0; i < N; i++){
            System.out.println((i+1)+".         "+nim[i]+"          "+nama[i]+"         "+us1[i]+"          "+us2[i]+"          "+uas[i]+"          "+totalNil[i]+"     "+finalNil[i]);//mencetak masing masing array  dengan perulangan
            
        }
            System.out.println("==================================================================================================");
    }
    
    
}

package belajarUAS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class UAS_225314023 {
    static String kategori;
    static int a=0,b=0,c=0;
    public static void main(String[]args){
        double jumlah=0;
        int[] jmlPasienDaerah={4,48,35,86,9,23,59,8,40,100};
        int max=jmlPasienDaerah[0],min=jmlPasienDaerah[0];
        for (int i = 0; i < jmlPasienDaerah.length; i++) {
            zona(jmlPasienDaerah[i]);
            System.out.println("Daerah Jmlh Pasien  Kategori");
            System.out.println((i+1)+"      "+jmlPasienDaerah[i]+"          "+kategori);
            jumlah+=jmlPasienDaerah[i];
            if(jmlPasienDaerah[i]>max){
                max=jmlPasienDaerah[i];
            }else if (jmlPasienDaerah[i]<min) {
                min=jmlPasienDaerah[i];
            }
            
        }
        System.out.println("=======================================");
        System.out.println("Jumlah total Pasien             : "+jumlah);
        System.out.println("Rata rata jumlah Pasien         : "+jumlah/jmlPasienDaerah.length);
        System.out.println("Jumlah pasien terbanyak         : "+max);
        System.out.println("Jumlah pasien Paling sedikit    : "+min);
        System.out.println("Jumlah daerah Zona Hijau        : "+a);
        System.out.println("Jumlah daerah Zona Oranye       : "+b);
        System.out.println("Jumlah Daerah Zona Merah        : "+c);
    }
    public static void zona(int x){
        if (x==0||x<=10) {
            kategori="hijau";
            a++;
        }else if(11<=x&&x<=50){
            kategori="Oranye";
            b++;
        }else if(x>50){
            kategori="Merah";
            c++;
        }
        
    }
}


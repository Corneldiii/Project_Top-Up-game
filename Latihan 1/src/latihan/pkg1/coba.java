/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class coba {
   static int normal(int n, double z){
       double f,pangkat,p=0;
       p=(1/Math.sqrt(2*3.14))*2.71828;
       pangkat=(-0.5)*Math.pow(z, 2);
       f=Math.pow(p, pangkat);
       return(int) Math.round(n*f);
   }
   static void bintang(int m){
       for(int i=1;i<=m;i++){
           System.out.print("*");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        Scanner tampung=new Scanner (System.in);
        System.out.println("Membaca besarnya n(antara 60-100)");
        int n=tampung.nextInt();
        for(double z=-4;z<=4;z=z+0.25){
            int jumBintang=normal(n, z);
            bintang(jumBintang);
        }
        
    }
}

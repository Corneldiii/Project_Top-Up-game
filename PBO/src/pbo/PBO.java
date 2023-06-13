/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        double rata=0,max=0.0,min = 0.0;
        System.out.print("Masukan jumlah mahasiswa : ");
        int N=tampung.nextInt();
        double[] ips=new double[N];
        String[] jumSks=new String[N];
        
        
        for (int i = 0; i < N; i++) {
            System.out.print("Masukan IPS ke "+(i+1)+" : ");
            ips[i]=tampung.nextDouble();
            rata+=ips[i];
            if(ips[i] > 2.75){
                jumSks[i]="24";
            }else if(2.5< ips[i] || ips[i]<=2.75){
                jumSks[i]="22";
            }else if(ips[i]<2.5){
                jumSks[i]="20";
            }
            if(N==1){
               max=ips[i];
               min=ips[i];
           }else{
               if(ips[i]<min)min=ips[i];
               if(ips[i]>max)max=ips[i];
               
           }
           
        }
         
        
        
            System.out.println("No.         IPS         Jumlah SKS maks");
            System.out.println("=================================================================================================");
        for (int i = 0; i < N; i++){
            System.out.println((i+1)+".         "+ips[i]+"              "+jumSks[i]);
            
        }
        System.out.println("rata ratanya adalah : "+rata/N);
        System.out.println("Nilai IPS tertinggi : "+max);
        System.out.println("Nilai IPS terendah  : "+min);
        
        
            System.out.println("==================================================================================================");

    }
    
}

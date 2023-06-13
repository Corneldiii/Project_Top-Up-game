/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Praktikum_No5 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int US1,US2,UAS;
        double Ntotal;
        
        System.out.print("Masukan nilai  US 1 : ");
        US1=tampung.nextInt();
        System.out.print("Masukan nilai US 2  : ");
        US2=tampung.nextInt();
        System.out.println("Masukan nilai UAS   : ");
        UAS=tampung.nextInt();
        
        
        Ntotal=0.3*US1+0.3*US2+0.4*UAS;
        
        if(Ntotal>=80){
            System.out.println("Nilai yang kamu peroleh adalah  : A");
        }else if (65<=Ntotal && Ntotal<80){
            System.out.println("Nilai yang kamu peroleh adalah  : B");
        }else if (55<= Ntotal && Ntotal<65){
            System.out.println("Nilai yang kamu peroleh adalah  : C");
            
        }else if (50<= Ntotal && Ntotal<55){
            System.out.println("Nilai yang kamu peroleh adalah  : D");
        }else if(Ntotal<50) {
            System.out.println("Nilai yang kamu peroleh adalah  : E");
        }
            
           
    }
    
}

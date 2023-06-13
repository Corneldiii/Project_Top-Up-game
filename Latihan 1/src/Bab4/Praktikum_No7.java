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
public class Praktikum_No7 {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        int B1,B2,B3;
        
        System.out.print("Masukan bilangan 1  : ");
        B1=Tampung.nextInt();
        System.out.print("Masukan bilangan 2  : ");
        B2=Tampung.nextInt();
        System.out.print("Masukan bilangan 3  : ");
        B3=Tampung.nextInt();
        
        
        
        if (B1<B2&&B2<B3){
            System.out.println("Urutan dari bilangan tersebut adalah "+B1+","+B2+","+B3+" ");
        }else if (B2<B3&&B3<B1){
            System.out.println("Urutan dari bilangan tersebut adalah "+B2+","+B3+","+B1+" ");
        }else if (B3<B1&&B1<B2) {
            System.out.println("Urutan dari bilangan tersebut adalah "+B3+","+B1+","+B2+"");
        }else if (B1<B3&&B3<B2){
            System.out.println("Urutan dari bilangan tersebut adalah "+B1+","+B3+","+B2+"");
        }else if (B2<B1&&B1<B3){
            System.out.println("Urutan dari bilangan tersebut adalah "+B2+","+B1+","+B3+"");
        }else if (B3<B2&&B2<B1){
            System.out.println("Urutan dari bilangan tersebut adalah "+B3+","+B2+","+B1+"");
        }
    }
    
}

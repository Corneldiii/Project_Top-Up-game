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
public class Praktikum_No2 {
    public static void main(String[] args){
        Scanner Bilangan=new Scanner(System.in);
        int A1,A2;
        
        
        System.out.print("Masukan suatu bilangan        : ");
        A1=Bilangan.nextInt();
        System.out.print("Masukan suatu bilangan kedua  : ");
        A2=Bilangan.nextInt();
        
        
        if(A1<A2){
            System.out.println("Maka angka yang lebih besar adalah :"+A2);
        }else{
            System.out.println("Maka angka yang lebih besar adalah : "+A1);
        }
    }
}

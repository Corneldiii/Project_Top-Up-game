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
public class Praktikum_No1 {
    public static void main(String[] args){
        Scanner angka=new Scanner(System.in);
        
        int A1,GanjilGenap;
        
        
        System.out.print("Masukan angka : ");
        A1=angka.nextInt();
        
        GanjilGenap= A1%2;
        if(GanjilGenap==0){
            System.out.println("Maka hasilnya adalah Genap");
            
        }else{
            System.out.println("Maka hasilnya adalah Ganjil");
        }
       
    }
}

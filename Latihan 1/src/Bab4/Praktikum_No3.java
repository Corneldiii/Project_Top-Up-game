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
public class Praktikum_No3 {
    public static void main(String[] args){
        Scanner beratideal=new Scanner(System.in);
        int berat,tinggi,BI;
        
        System.out.print("Masukan berat anda : ");
        berat=beratideal.nextInt();
        System.out.print("Masukan Tinggi anda : ");
        tinggi=beratideal.nextInt();
        
        BI=tinggi-berat;
        
        if(90<=BI&&BI<=110){
            System.out.println("Maka anda sudah ideal");
        }else if(BI<90){
            System.out.println("Maka anda terlalu gemuk");
        }else if(BI>110){
            System.out.println("Maka anda terlalu kurus");
        }
            
    }
}

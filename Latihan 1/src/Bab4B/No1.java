/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4B;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No1 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int a,b,c,x;
        double hitung1,hitung2;
        
        System.out.print("Masukan nilai A   : ");
        a=tampung.nextInt();
        System.out.print("Masukan nilai B   : ");
        b=tampung.nextInt();
        System.out.print("Masukan nilai C   : ");
        c=tampung.nextInt();
        
        
        
        hitung1=-b + Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
        hitung2=-b - Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
        
        
        System.out.println("Maka akar persamaan dari soal di atas adalah : X1= "+hitung1+",X2= "+hitung2+"");
    }
}

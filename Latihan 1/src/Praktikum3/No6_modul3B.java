/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class No6_modul3B {
    public static void main(String[] args){
        Scanner segitiga=new Scanner(System.in);
        int X1,Y1,X2,Y2,X3,Y3;
        double JAB,JAC,JBC;
        double K,SK,L;//SK adalak setengah keliling
        
        System.out.print("Masukan X1 : ");
        X1=segitiga.nextInt();
        System.out.print("Masukan Y1 : ");
        Y1=segitiga.nextInt();
        System.out.print("Masukan X2 : ");
        X2=segitiga.nextInt();
        System.out.print("Masukan Y2 : ");
        Y2=segitiga.nextInt();
        System.out.print("Masukan X3 : ");
        X3=segitiga.nextInt();
        System.out.print("Masukan Y3 : ");
        Y3=segitiga.nextInt();
        
        JAB=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
        JAC=Math.sqrt((X3-X1)*(X3-X1)+(Y3-Y1)*(Y3-Y1));
        JBC=Math.sqrt((X3-X2)*(X3-X2)+(Y3-Y2)*(Y3-Y2));
        
        K=JAB+JAC+JBC;
        SK=K/2;
        L=Math.sqrt(SK*(SK-JAB)*(SK-JBC)*(SK-JAC));
        
        System.out.println("");
        System.out.println("Maka kelilingnya adalah "+K);
        System.out.println("Setengah kelilingnya adalah "+SK);
        System.out.println("Dan luasnya adalah "+L);
        
       
       
       
        
    }
}

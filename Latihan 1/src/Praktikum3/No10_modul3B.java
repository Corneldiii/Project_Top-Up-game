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
public class No10_modul3B {
    public static void main(String[] args){
        Scanner Fungsi=new Scanner(System.in);
        double x,m,S,e,a;
        double P,Fx;
        
        System.out.print("Masukan nilai X :");
        x=Fungsi.nextInt();
        System.out.print("Masukan nilai MU :");
        m=Fungsi.nextInt();
        System.out.print("Masukan nilai Sigma :");
        S=Fungsi.nextInt();
       
        P=-0.5*(Math.pow(x-m/S, 2));
        e=2.718;
        a= S * Math.sqrt(2*Math.PI);
        Fx=((1.0/a)*Math.pow(e, P));
        
        
       
        
        System.out.println("Maka nilai dari F(x) aadalah "+Fx);
    }
}

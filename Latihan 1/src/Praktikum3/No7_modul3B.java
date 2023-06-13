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
public class No7_modul3B {
    public static void main(String[] args){
        Scanner fungsi=new Scanner(System.in);
        double X,Fx;
        
        System.out.print("Masukan nilai X : ");
        X=fungsi.nextDouble();
        
        Fx=5+6*X+8*Math.pow(X, 2)+9*Math.pow(X, 3)+5*Math.pow(X, 4);
        
        System.out.println("Maka nilai dari F(x) adalah "+Fx);
    }
}

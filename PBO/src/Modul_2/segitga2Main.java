/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author LENOVO
 */
public class segitga2Main {
    public static void main(String[] args) {
        segitiga2 seg1=new segitiga2();
        
        seg1.setX1(1); seg1.setY1(2);
        seg1.setX2(7); seg1.setY2(2);
        seg1.setX3(7); seg1.setY3(9);
        
        System.out.println("Luas Segitiga dengan titik (1,2 (7,2)) (7,9) adalah :"+seg1.hitungLuas());
        
        segitiga2 seg2=new segitiga2();
        
        seg2.setX1(0); 
        seg2.setY1(0);
        seg2.setX2(5);
        seg2.setY2(4);
        seg2.setX3(8);
        seg2.setY3(2);
        
        System.out.println("Luas Segitiga dengan titik (0,0) (5,4)) (8,2) adalah :"+seg2.hitungLuas());
    }
}

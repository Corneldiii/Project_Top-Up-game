/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    public double x1,y1,x2,y2,x3,y3;
    int setX1;
    public double hitungSisi(double xa,double ya,double xb,double yb){
        return Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2));
    }
    public double hitungKeliling(){
        return hitungSisi(x1,y1,x2,y2)+hitungSisi(x2,y2,x3,y3)+hitungSisi(x3,y3,x1,y1);  
    }
    
    public double hitungLuas(){
        double s = hitungKeliling();
        return Math.sqrt(s*(s-hitungSisi(x1,y1,x2,y2))*(s-hitungSisi(x2,y2,x3,y3))*(s-hitungSisi(x3,y3,x1,y1)));
    }
}

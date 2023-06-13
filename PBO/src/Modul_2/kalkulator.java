/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author LENOVO
 */
public class kalkulator {
    private double angka1,angka2;
    public void setAngka1(double angka1){
        this.angka1=angka1;
    }
    public double getAngka1(){
        return this.angka1;
    }
    public void setAngka2(double angka2){
        this.angka2=angka2;
    }
    public double getAngka2(){
        return this.angka2;
    }
    public double penjumlahan(){
        return angka1+angka2;
    }
    public double pengurangan(){
        return angka1-angka2;
    }
    public double perkalian(){
        return angka1*angka2;
    }
    public double pembagian(){
        return angka1/angka2;
    }
}

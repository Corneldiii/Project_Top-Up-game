/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.latihan;

/**
 *
 * @author LENOVO
 */
public class No3_modul7 {
    public static void main(String[] args){
        int jumlah=0,bilangan=0;
        do{
            jumlah+=bilangan;
            bilangan+=5;
        }while(bilangan<=100);
        System.out.println("Jumlah dari 5+10+15+...+100 adalah = "+jumlah);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_1;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PersegiMain {
    public static void main(String[] args) {
        Persegi objPersegi =new Persegi();
        
        objPersegi.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukan Panjang"));
        
        objPersegi.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukan Lebar"));
        
        JOptionPane.showInputDialog(null,"Luas dari persegi dengan panjang ="+objPersegi.panj+" dan Lebar ="+objPersegi.lebar+" adalah "+objPersegi.luas());
    }
}

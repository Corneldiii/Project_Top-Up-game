/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coba_ppt;

/**
 *
 * @author LENOVO
 */
public class F_7_3 {
    public static void main(String[] args) {
        int[] array={32,27,64,18,95,14,90,70,60,37};
        System.out.printf("%-10s%-8s\n","Index","Value");
        
        for (int counter = 0; counter < array.length; counter++) 
            System.out.printf("%-10d%-8d\n",counter, array[counter]);
    }
}

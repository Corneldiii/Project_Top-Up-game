/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coba_ppt;

/**
 *
 * @author LENOVO
 */
public class F_7_2 {
    public static void main(String[] args) {
        int[] array;
        array=new int[10];
        System.out.printf("%s%8s\n","Index","Value");
        
        for(int counter=0;counter<array.length;counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    }
}

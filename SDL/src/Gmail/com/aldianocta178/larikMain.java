/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gmail.com.aldianocta178;

import java.util.Arrays;

import stackstatis.Stack;

/**
 *
 * @author LENOVO
 */
public class larikMain {
     public static void main(String[] args) {
        int[] larik= {17,8,45,10,15,43,34,65,13,21};
        int index2=Stack.sequentialSearch(larik, 8);
        Arrays.sort(larik);
        Stack.cetak(larik);
        System.out.println("");
        int index=Stack.interpolasiSearch(larik, 8);
        int index3=Stack.binarySearch(larik, 8);
        Stack.index(index,"interpolasi");
        Stack.index(index2,"Sequential");
        Stack.index(index3, "Binary");
        Stack.bubleSortDSC(larik);
        Stack.cetak(larik);
        System.out.println("");
        Stack.selectionSortDSC(larik);
        Stack.cetak(larik);
    }
}

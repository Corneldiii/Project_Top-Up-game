
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gmail.com.aldianocta178;

import java.util.*;

import stackstatis.Stack;

/**
 *
 * @author LENOVO
 */
public class randomMain {
    public static void main(String[] args) {
        int[] arr=new int[10000000];
        System.out.println("Banyak data :"+arr.length);
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        
        System.out.println("Quick Sort");
        int[] arr3=Arrays.copyOf(arr, arr.length);

        long timeStart4=System.nanoTime();
        Stack.quickSortAscending(arr3, 0, arr.length-1);
        long timeFinish4=System.nanoTime();

        double waktu4=(timeFinish4-timeStart4)/1e9;
        System.out.println(waktu4);
        

    }
}
//tujuan,algoritma(ppt asc desc),diagram uml,src larik main,output (asc desc)
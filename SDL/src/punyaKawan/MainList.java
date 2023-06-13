/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaKawan;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MainList {
    public static void main(String[]args){
        LinkedList pertama=new LinkedList();
        Scanner hasil=new Scanner(System.in);
        
        pertama.addFirst(8);
        System.out.println("Data yang sekarang:");
        pertama.print();
        System.out.println("");
        pertama.addFirst(15);
        System.out.println("Data yang Sekarang:");
        pertama.print();
        System.out.println("");
        pertama.addLast(26);
        System.out.println("Data yang Sekarang:");
        pertama.print();
        System.out.println("");
        pertama.addLast(14);
        System.out.println("Data yang Sekarang:");
        pertama.print();
        System.out.println("");
        System.out.println("-----selesai-----");
        
        System.out.print("Cari data yang diperlukan:");
        int dicari=hasil.nextInt();
        if(pertama.search(dicari)==null){
            System.out.println("Hasil Data tdk di temukan");
        }else{
            System.out.println("Hasil Data di temukan:"+pertama.search(dicari).getElemen());
        }
        try{
            System.out.println("Data Sekarang:");
            pertama.print();
            System.out.println("");
            System.out.println("Data yg akan di hapus:"+pertama.removeLast());
            System.out.println("");
            System.out.println("Data yg sekarang:");
            pertama.print();
            System.out.println("");
            
            System.out.println("Data yg akan di hapus:"+pertama.removeLast());
            System.out.println("");
            System.out.println("Data yg sekarang:");
            pertama.print();
            System.out.println("");
            
            System.out.println("Data yg akan di hapus:"+pertama.removeLast());
            System.out.println("");
            System.out.println("Data yg sekarang:");
            pertama.print();
            System.out.println("");
            
             System.out.println("Data yg akan di hapus:"+pertama.removeLast());
            System.out.println("");
            System.out.println("Data yg sekarang:");
            pertama.print();
            System.out.println("");
            
             System.out.println("Data yg akan di hapus:"+pertama.removeLast());
            System.out.println("");
            System.out.println("Data yg sekarang:");
            pertama.print();
            System.out.println("");
        }catch(NoSuchElementException a){
            System.out.println(a.getMessage());
            
        }
    }
}

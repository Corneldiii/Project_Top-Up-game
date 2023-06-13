package SBGKB;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class mainSBGKB {
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        Scanner tampung=new Scanner(System.in);
        
        a.addFirst(8);
        System.out.print("Data sekarang : ");
        a.print();
        System.out.println("");
        a.addFirst(15);
        System.out.print("Data sekarang : ");
        a.print();
        System.out.println("");
        a.addLast(26);
        System.out.print("Data sekarang : ");
        a.print();
        System.out.println("");
        a.addLast(14);
        System.out.print("Data sekarang : ");
        a.print();
        System.out.println("");
        System.out.println("===================");


        System.out.print("Cari data : ");
        int cari=tampung.nextInt();

        if(a.search(cari)==null){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data ditemukan : "+a.search(cari).getElemen());
        }
        System.out.println("");

        try{
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
            System.out.println("Data yang dihapus : "+a.removeLast());
            System.out.println("");
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
            
            System.out.println("Data yang dihapus : "+a.removeLast());
            System.out.println("");
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
            
            System.out.println("Data yang dihapus : "+a.removeFirst());
            System.out.println("");
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
            
            System.out.println("Data yang dihapus : "+a.removeFirst());
            System.out.println("");
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
            
            System.out.println("Data yang dihapus : "+a.removeFirst());
            System.out.println("");
            System.out.print("Data sekarang : ");
            a.print();
            System.out.println("");
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }




        
        
    }
}

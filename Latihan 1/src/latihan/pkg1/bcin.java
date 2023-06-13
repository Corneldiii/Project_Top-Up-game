/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class bcin {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int tanggal,hari,ulang_Tahun;
        String nama,kabar,siap,warn,jawab,pesan;
        
        System.out.println("HALO!!!");
        System.out.println("Perkenalkan nama aku EXDarkOUT");
        System.out.println("aku akan membantumu menjawab pertanyaan berikut inii!");
        System.out.println("Pertama siapa nama kamu?");
        System.out.print("Jawab   : ");
        nama=tampung.next();
        System.out.println("hai "+nama+" salam kenal yaa!");
        System.out.println(nama+" tanggal berapa sekarang?");
        System.out.print("Jawab   :  ");
        tanggal=tampung.nextInt();
        System.out.println("Gimana kabarnya?");
        System.out.print("Jawab   : ");
        kabar=tampung.next();
        if(("baik").equalsIgnoreCase(kabar)){
            System.out.println("Puji tuhan semoga tetep "+kabar+" terus yaaa!!");
            
        }
        
    }
}





























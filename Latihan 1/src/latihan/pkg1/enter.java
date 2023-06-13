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
public class enter {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        int jumlah=0,batas,genap,g=0,gj=0,jumlahGenap=0,jumlahGanjil=0;
        do{
            System.out.print("Masukan batas : ");
            batas=tampung.nextInt();
            
        }while(batas<=0);
        for (int bilangan=5;bilangan<=batas;bilangan+=5){
            jumlah+=bilangan;
            genap=bilangan%2;
            if(genap==0){
                jumlahGenap+=bilangan;
                g++;
            }else{
                jumlahGanjil+=bilangan;
                gj++;
            }
            
        }
        System.out.println("Jumlahnya adalah : "+jumlah);
        System.out.println("Banyak bilangan genap : "+g);
        System.out.println("Jumlah bilangan genap : "+jumlahGenap);
        System.out.println("Banyak bilangan ganjil : "+gj);
        System.out.println("Jumlah bilangan ganjil : "+jumlahGanjil);
    }
}

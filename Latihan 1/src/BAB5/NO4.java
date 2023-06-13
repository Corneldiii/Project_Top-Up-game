/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class NO4 {
    public static void main(String[]  args){
        Scanner Tampung=new Scanner(System.in);
        String ukuran;
        int beli,harga;
        
        System.out.print("Ukuran baju yang anda beli    : ");
        ukuran=Tampung.nextLine();
        
        
        switch(ukuran){
            case "s":
                System.out.println("Berapa baju yang anda beli  : ");
                beli=Tampung.nextInt();
                harga=beli*30000;
                 System.out.println("Jumlah yang harus anda bayarkan    : Rp."+harga);
                break;
            case "m":
                System.out.println("Berapa baju yang anda beli  : ");
                beli=Tampung.nextInt();
                harga=beli*38000;
                 System.out.println("Jumlah yang harus anda bayarkan    : Rp."+harga);
                break;
            case "l":
                System.out.println("Berapa baju yang anda beli  : ");
                beli=Tampung.nextInt();
                harga=beli*45000;
                 System.out.println("Jumlah yang harus anda bayarkan    : Rp."+harga);
                break;
            case "xl":
                System.out.println("Berapa baju yang anda beli  : ");
                beli=Tampung.nextInt();
                harga=beli*50000;
                 System.out.println("Jumlah yang harus anda bayarkan    : Rp."+harga);
                break;
            case "xxl":
                System.out.println("Berapa baju yang anda beli  : ");
                beli=Tampung.nextInt();
                harga=beli*60000;
                System.out.println("Jumlah yang harus anda bayarkan    : Rp."+harga);
                break;
            default :System.out.println("Invalid ERROR");
                break;
        }
        
    }
}

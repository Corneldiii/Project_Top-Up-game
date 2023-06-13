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
public class NO3 {
    public static void main (String[] args){
        Scanner tampung=new Scanner(System.in);
        int bulan;
        String bulanNama,hari;
        
        System.out.println("Petunjuk!!!!!");
        System.out.println("masukan bulan dalam bentuk angka");
        System.out.println("______________________________");
        System.out.print("Bulan   : ");
        bulan=tampung.nextInt();
        switch(bulan){
            case 1:bulanNama="January";
                    hari="31";
                break;
            case 2:bulanNama="February";
                    hari="28";
                break;
            case 3:bulanNama="March";
                    hari="31";
                break;
            case 4:bulanNama="April";
                    hari="30";
                break;
            case 5:bulanNama="May";
                    hari="31";
                break;
            case 6:bulanNama="June";
                    hari="30";
                break;
            case 7:bulanNama="July";
                    hari="31";
                break;
            case 8:bulanNama="August";
                    hari="31";
                break;
            case 9:bulanNama="September";
                    hari="30";
                break;
            case 10:bulanNama="October";
                    hari="31";
                break;
            case 11:bulanNama="November";
                    hari="30";
                break;
            case 12:bulanNama="December";
                    hari="31";
                break;
            default :bulanNama="Invalid month";
                     hari="invalid";
            break;
        }
        System.out.println("Hari pada bulan "+bulanNama+" ada :"+hari);
    }
}

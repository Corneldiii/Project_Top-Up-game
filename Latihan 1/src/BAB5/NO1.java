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
public class NO1 {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        
        int month;
        String monthString;
        
        
        System.out.println("PETUNJUK!!!!");
        System.out.println("Angka dari bulan!!");
        System.out.println("___________________");
        System.out.print("BULAN   :");
        month=Tampung.nextInt();
        
        switch(month){
            case 1:monthString="January";
                break;    
            case 2:monthString="February";
                    break;    
            case 3:monthString="March";
                break;
            case 4:monthString="April";
                break;
            case 5:monthString="May";
                break;
            case 6:monthString="June";
                break;
            case 7:monthString="July";
                break;
            case 8:monthString="August";
                break;
            case 9:monthString="September";
                break;
            case 10:monthString="October";
                break;
            case 11:monthString="November";
                break;
            case 12:monthString="December";
                break;
            default:monthString="Invalid month";
                break;
        }
        
  
      System.out.println(monthString);
    }
}

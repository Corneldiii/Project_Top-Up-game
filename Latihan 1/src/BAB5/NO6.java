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
public class NO6 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        enum Agama{HINDU,BUDHA,YAHUDI,KATOLIK,KRISTEN,ISLAM}
        Agama agamaNama = Agama.KATOLIK;

        switch(agamaNama){
            case HINDU:
                System.out.println("Kitab sucinya adalah    : Veda");
                System.out.println("Nabinya                 : -");
                break;
            case BUDHA:
                System.out.println("Kitab sucinya adalah    : Tripitaka");
                System.out.println("Nabinya                 : Sidarat Gautama");
                break;
            case YAHUDI:
                System.out.println("Kitab sucinya adalah    : Taurat ");
                System.out.println("Nabinya                 : Musa");
                break;
            case KATOLIK:
                System.out.println("Kitab sucinya adalah    : Injil");
                System.out.println("Nabinya                 : Yesus");
                break;
            case KRISTEN:
                System.out.println("Kitab sucinya adalah    : Injil");
                System.out.println("Nabinya                 : Yesus");
                break;
            case ISLAM:
                System.out.println("Kitab sucinya adalah    : Alquran");
                System.out.println("Nabinya                 : Muhamad");
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otakatik;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class dsad {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        int selisih;
        System.out.println("masuk : ");
        int a=tampung.nextInt();
        
        if(a>2019){
            selisih=a-2019;
        }else{
            selisih=2019-a;
        }
        System.out.println(selisih);
    }
}

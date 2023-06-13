/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per_2;

/**
 *
 * @author LENOVO
 */
public class rekrusifPaijo {
    public static void main(String[] args) {
        System.out.println(paijo(3));
        System.out.println();
    }
    public static int paijo(int x){
        
        if(x==0){
            return 0;
        }
        return 2*paijo(x-1)+x*x;
        
    }
}
//public +(x: int): int
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author LENOVO
 */
public class Praktikum_No9 {
    public static void main(String [] args) 
    {
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;

        if (rabbit & donkey | donkey & leporidae | donkey)
            System.out.print("DOG ");

        if (rabbit & donkey | donkey & leporidae | donkey | rabbit )
            System.out.println("CAT ");
    }

}

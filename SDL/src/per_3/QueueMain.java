/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package per_3;

/**
 *
 * @author LENOVO
 */
public class QueueMain {
    public static void main(String[] args) {
        queue antrian = new queue(7);
        antrian.enqueue(26);
        antrian.enqueue(15);
        antrian.enqueue(8);
        antrian.enqueue(14);
        System.out.println("Antrian : "+antrian.toString());
        System.out.println("Keluar : "+antrian.dequeue());
        System.out.println("Antrian : "+antrian.toString());
        System.out.println("Keluar : "+antrian.dequeue());
        System.out.println("Antrian : "+antrian.toString());
        System.out.println("Keluar : "+antrian.dequeue());
        System.out.println("Antrian : "+antrian.toString());
        System.out.println("Keluar : "+antrian.dequeue());
        System.out.println("Antrian : "+antrian.toString());
        System.out.println("Keluar : "+antrian.dequeue());
        System.out.println("Antrian : "+antrian.toString());
        
        
        
        
    }
}

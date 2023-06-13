/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punyaKawan;

/**
 *
 * @author ACER
 */
public class Stack {

    private int[] elemen;
    private int size;
    private int front;

    public Stack() {
        front = -1;
        elemen = new int[10];
        size = 0;
    }

    public void stack(int size) {
        front = -1;
        elemen = new int[size];
        size = 0;
    }

    public boolean push(int nilai) {
        if (size == elemen.length) {
            return false;
        }
        front++;
        elemen[front] = nilai;
        size++;
        return true;
    }
    public int size(){
        return size;
    }

    public boolean isEmptystck() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int pop() {
        int isi = 0;
        if (isEmptystck() == true) {
            System.out.println("tdk ada hasil");
        } else {
            isi = elemen[front];
            front--;
            size--;
        }
        return isi;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp = temp + elemen[i] + " ";
        }
        return temp;

    }
}

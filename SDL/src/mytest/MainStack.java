package mytest;

import StackDinamis.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack tump = new Stack();

        tump.push(10);
        tump.push(5);
        tump.push(7);

        while (!tump.isEmptyStck()) {
            System.out.print("Data sekarang : ");
            tump.print();
            System.out.println("");
            System.out.println("Keluar : " + tump.pop());

        }

        // System.out.println(tump.pop());
        // System.out.println(tump.pop());
    }
}

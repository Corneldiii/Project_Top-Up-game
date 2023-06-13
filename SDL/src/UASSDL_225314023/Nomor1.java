package UASSDL_225314023;
import java.util.*;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        Stack Uas=new Stack();
         
        System.out.print("Masukan nama panjang anda : ");
        String nama=tampung.nextLine();
        for (int i = 0; i < nama.length(); i++) {
            Uas.push(nama.charAt(i));
        }

        System.out.print("Nama anda versi terbalik : ");
        for (int i = 0; i < nama.length(); i++) {
            System.out.print(Uas.pop());
        }
    }
}

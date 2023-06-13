package BelajarUTS;
import java.util.Scanner;
public class scnr {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);

        System.out.println("masukan data : ");
        System.out.println("masukan nama panjnag : ");
        String nama=tampung.nextLine();
        System.out.println("masukan nama gurug : ");
        String namagur=tampung.nextLine();
        System.out.println("Masukan umur : ");
        int umur=tampung.nextInt();

        System.out.println(nama);
        System.out.println(namagur);
        System.out.println(umur);
    }
}

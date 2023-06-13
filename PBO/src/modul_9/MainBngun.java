package modul_9;

import java.util.*;

public class MainBngun {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        BangunDatar[] bd;// membentuk array of objek bd dari class bangunDatar
        System.out.print("Banyak data yang akan di hitung : ");
        int x = tampung.nextInt();
        bd = new BangunDatar[x];// memasukan panjang dari array of objek

        for (int i = 0; i < bd.length; i++) {
            // memasukan pilihan jenis bangun datar
            System.out.println("--------------------------------------");
            System.out.print("1.Lingkaran\n2.Segi Empat\n3.Segitiga\nPilih : ");
            int pilih = tampung.nextInt();

            if (pilih == 1) {// jika 1
                // meminta data jari jari
                System.out.print("Jari jari : ");
                double jari = tampung.nextDouble();
                bd[i] = new Lingkaran(jari);// membuat array of objek bd indek i menjadi objek dari kelas Lingkaran dan
                                            // mengisi method dengan variable jari
            } else if (pilih == 2) {// jika 2
                // memasukan nilai panjang dan lebar
                System.out.print("Panjang : ");
                double panjang = tampung.nextDouble();
                System.out.print("Lebar : ");
                double lebar = tampung.nextDouble();
                bd[i] = new SegiEmpat(panjang, lebar);// membuat array of objek bd indek i menjdai objek dari kelas
                                                      // segiEmpat dan mengisi method dengan variable panjang dan lebar
            } else if (pilih == 3) {// jika 3
                // memasukan data dari ketiga sisi
                System.out.print("sisi 1 : ");
                double a = tampung.nextDouble();
                System.out.print("sisi 2 : ");
                double b = tampung.nextDouble();
                System.out.print("sisi 3 : ");
                double c = tampung.nextDouble();
                bd[i] = new Segitiga(a, b, c);// membuat array of objek bd indek i menjadi objek bbaru kelas segitiga
                                              // dan meengisi method dengan varibale a,b dan c
            } else {// jika tidak
                    // mencetak pemebriatuan salah
                System.out.println("");
                System.out.println("!!!!wrong input!!!!");
                i--;
            }
            System.out.println("");
        }
        // mencetak data dari semua data yang diinputkan
        System.out.println("=======================================");
        System.out.printf("%-10s%-15s%-10s%-10s\n", "No.", "Bangun Datar", "Keliling", "Luas");// dengan format tersebut
                                                                                               // mencetak No bangun
                                                                                               // data keliliing dan
                                                                                               // luas
        System.out.println("---------------------------------------");
        for (int i = 0; i < bd.length; i++) {
            // dengan format tersebut mencetak hasil dari
            // (i+1),bd[i].getJenis(),bd[i].hitungKeliling(),bd[i].hitungLuas()
            System.out.printf("%-10s%-15s%-10s%-10s\n", (i + 1), bd[i].getJenis(), bd[i].hitungKeliling(),
                    bd[i].hitungLuas());
        }

    }
}

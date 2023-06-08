package Project;

import java.util.*;

public class MainLogistic {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        LinkedList tmp = new LinkedList();

        boolean keluar = true;
        while (keluar) {
            System.out.println("\n======== D-A-T-A  L-O-G-I-S-T-I-C ==========");
            System.out.printf("%-22s%-15s%-18s", "(1)", "(2)", "(3)");
            System.out.printf("\n%-18s%-15s%-15s", "Tampilkan data", "Tambah data", "Hapus data");
            System.out.println("\n=============================================");
            System.out.print("Pilih : ");
            int pilih = tampung.nextInt();
            if (pilih == 1) {
                System.out.println("");
                System.out.println("\n==========================================");
                tmp.print2();
                System.out.println("\n==========================================");
                System.out.println("");
            } else if (pilih == 2) {
                System.out.print("Berapa banyak : ");
                int n = tampung.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("");
                    tampung.nextLine();
                    System.out.print("Nama barang           : ");
                    String nama = tampung.nextLine();
                    System.out.print("Exp Date(Tanggal)     : ");
                    int Exp = tampung.nextInt();
                    tmp.addSort(new Logistic(nama, Exp));
                }
            } else if (pilih == 3) {
                try {
                    System.out.println("=========== H A P U S  D A T A ===============");
                    System.out.printf("%-22s%-19s%-15s", "(1)", "(2)","(3)");
                    System.out.printf("\n%-18s%-18s%-15s", "Data Pertama", "Data Terakhir","Hapus Pilih");
                    System.out.println("\n==============================================");
                    System.out.print("Pilih : ");
                    int pilihHps = tampung.nextInt();
                    
                    if (pilihHps == 1) {
                        System.out.print("Hapus berapa kali : ");
                        int bnyk=tampung.nextInt();
                        for (int i = 0; i < bnyk; i++) {
                            tmp.removeFirst();
                        }
                    } else if (pilihHps == 2) {
                        System.out.print("Hapus berapa kali : ");
                        int bnyk=tampung.nextInt();
                        for (int i = 0; i < bnyk; i++) {
                            tmp.removeLast();
                        }
                    }else if(pilihHps==3){
                        System.out.print("Masukan nama yang akan di hapus : ");
                        String plh=tampung.next();
                        tmp.removePilih(plh);
                    } else {
                        System.out.println("Wrong input");
                        keluar=true;
                    }
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    keluar=false;
                }
            } else {
                keluar = false;
            }
        }
    }
}

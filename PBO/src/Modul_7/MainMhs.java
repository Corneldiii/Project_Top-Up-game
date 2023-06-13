package Modul_7;

import java.util.Scanner;

public class MainMhs {
    public static void main(String[] args) {
        // meminta input data yang digunakan
        Scanner tampung = new Scanner(System.in);
        System.out.print("Masukan nama anda         : ");
        String nama = tampung.next();
        System.out.print("Masukan nim anda          : ");
        String nim = tampung.next();
        System.out.print("Masukan tanggal lahir   : ");
        String tglLah = tampung.next();
        System.out.print("Masukan nilai UTS 1 : ");
        double uts1 = tampung.nextInt();
        System.out.print("Masukan nilai UTS 2 : ");
        double uts2 = tampung.nextInt();
        System.out.print("Masukan nilai UAS   : ");
        double uas = tampung.nextInt();
        System.out.print("Masukan Gelar           : ");
        String gelar = tampung.next();
        if (gelar.equalsIgnoreCase("S1")) {// cek variable gelar dengan perintah if apakah sama dengan S1
            MhsS1 mhs1 = new MhsS1();// membuat objek baru bernama mhs1 dengan tipe mhsS1
            mhs1.setNama(nama);// mengset nama pada objek mhs1
            mhs1.setNim(nim);// mengset nim pada objek mhs1
            mhs1.setTglLahir(tglLah);// mengset TglLahir pada objek mhs1
            mhs1.setUts1(uts1);// mengset uts1 pada objek mhs1
            mhs1.setUts2(uts2);// mengset uts2 pada objek mhs1
            mhs1.setUas(uas);// mengset uas pada objek mhs1
            // mencetak output
            System.out.println("Nama    : " + mhs1.getNama());// mencetak nama dengan memanggil isi dari nama pada objek
                                                              // mhs1 dengan perintah getNama
            System.out.println("NIM     : " + mhs1.getNim());// mencetak nim dengan memanggil isi dari nim pada objek
                                                             // mhs1 dengan perintah getNim
            System.out.println("Nilai : " + mhs1.nilaiFinal());// mencetak Nilai dan memanggil method nilaiFinal pad
                                                               // aobjek mhs1
            System.out.println("Nilai final : " + mhs1.NilaiFinal());// mencetak nilai final dengan memanggil method
                                                                     // NilaiFinal pada objek mhs1
        } else if (gelar.equalsIgnoreCase("S2")) {// cek variable gelar dengan perintah if apakah sama dengan S2
            MhsS2 mhs2 = new MhsS2();// membuat objek baru bernama mhs2 dengan tipe mhsS2
            mhs2.setNama(nama);// mengset nama pada objek mhs1
            mhs2.setNim(nim);// mengset nim pada objek mhs1
            mhs2.setTglLahir(tglLah);// mengset TglLahir pada objek mhs1
            mhs2.setUts1(uts1);// mengset uts1 pada objek mhs1
            mhs2.setUts2(uts2);// mengset uts2 pada objek mhs1
            mhs2.setUas(uas);// mengset uas pada objek mhs1

            System.out.println("Nama    : " + mhs2.getNama());// mencetak nama dengan memanggil isi dari nama pada objek
                                                              // mhs2 dengan perintah getNama
            System.out.println("NIM     : " + mhs2.getNim());// mencetak nim dengan memanggil isi dari nim pada objek
                                                             // mhs2 dengan perintah getNim
            System.out.println("Nilai : " + mhs2.nilaiFinal());// mencetak Nilai dan memanggil method nilaiFinal pada
                                                               // objek mhs2
            System.out.println("Nilai final : " + mhs2.skorFinal());// mencetak Nilai final dan memanggil method
                                                                    // skorFinal pada objek mhs2
        }
    }
}

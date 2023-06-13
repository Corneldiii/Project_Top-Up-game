/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentasi;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainMhs {// mendeklarasika class mainMhs
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);// membuat objek scanner untuk mengambil input dari user
        System.out.print("Masukan jumlah anak : ");// menampilkan pesan untuk meminta input jumlah mahasiswa
        int x = tampung.nextInt();// mengambil input jumlah mahasiswa dari user
        Mahasiswa1[] s = new Mahasiswa1[x];// membuat array of objek Mahasiswa1 dengan panjang sejumlah x

        for (int i = 0; i < s.length; i++) {// membuat perulangan untuk meminta input data mahasiswa sejumlah panjang
                                            // array s
            System.out.print("Masukan nama anda         : "); // menampilkan pesan untuk meminta input nama mahasiswa
            String nama = tampung.next();// mengambil input nama mahasiswa dari user
            System.out.print("Masukan nim anda          : ");// menampilkan pesan untuk meminta input nim mahasiswa
            String nim = tampung.next();// mengambil input nim mahasiswa dari user
            System.out.print("Masukan tanggal lahir   : ");// menampilkan pesan untuk meminta input tanggal lahir
                                                           // mahasiswa
            String tglLah = tampung.next();// mengambil input tanggal lahir mahasiswa dari user
            System.out.print("Masukan nilai UTS 1 : ");// menampilkan pesan untuk meminta input nilai UTS 1 mahasiswa
            double uts1 = tampung.nextInt();// mengambil input nilai UTS 1 mahasiswa dari user
            System.out.print("Masukan nilai UTS 2 : ");// menampilkan pesan untuk meminta input nilai UTS 2 mahasiswa
            double uts2 = tampung.nextInt(); // mengambil input nilai UTS 2 mahasiswa dari user
            System.out.print("Masukan nilai UAS   : "); // menampilkan pesan untuk meminta input nilai UAS mahasiswa
            double uas = tampung.nextInt();// mengambil input nilai UAS mahasiswa dari user
            System.out.print("Masukan jenjang          : ");// menampilkan pesan untuk meminta input gelar mahasiswa
            String gelar = tampung.next();// mengambil input gelar mahasiswa dari user
            System.out.println("----------------------------");// menampilkan pemisah antar data mahasiswa
            if (gelar.equalsIgnoreCase("S1")) {// jika gelar mahasiswa S1 maka
                s[i] = new S1();// membuat objek S1 baru pada indeks i array s
                s[i].setNama(nama);// mengeset nama mahasiswa pada objek S1 indeks i array s
                s[i].setNim(nim);// mengeset nim mahasiswa pada objek S1 indeks i array s
                s[i].setTglLahir(tglLah);// mengeset tanggal lahir mahasiswa pada objek S1 indeks i array s
                s[i].setUas(uas);// mengeset nilai UAS mahasiswa pada objek S1 indeks i array s

                s[i].setUts1(uts1);// mengeset nilai UTS 1 mahasiswa pada objek S1 indeks i array s
                s[i].setUts2(uts2);// mengeset nilai UTS 2 mahasiswa pada objek S1 indeks i array s
            } else if (gelar.equalsIgnoreCase("S2")) {// jika gelar mahasiswa S2 maka
                s[i] = new S2();// membuat objek S2 baru pada indeks i array s
                s[i].setNama(nama);// mengeset nama mahasiswa pada objek S2 indeks i array s
                s[i].setNim(nim);// mengeset nim mahasiswa pada objek S2 indeks i array s
                s[i].setTglLahir(tglLah);// mengeset tanggal lahir mahasiswa pada objek S2 indeks i array s
                s[i].setUas(uas);// mengeset nilai UAS mahasiswa pada objek S2 indeks i array s
                s[i].setUts1(uts1);// mengeset nilai UTS 1 mahasiswa pada objek S2 indeks i array s
                s[i].setUts2(uts2);// mengeset nilai UTS 2 mahasiswa pada objek S2 indeks i array s
            }

        }
        System.out.println("===============================================");// menampilkan pemisah
        for (int i = 0; i < s.length; i++) {// Melakukan perulangan untuk setiap objek dalam array s
            System.out.println("Nama : " + s[i].getNama());// Mencetak nama mahasiswa dengan menggunakan method getNama
                                                           // pada indeks i array s
            System.out.println("Nim : " + s[i].getNim());// Mencetak nim mahasiswa dengan menggunakan method getNim pada
                                                         // indeks i array s
            System.out.println("Nilai Total : " + s[i].nilaiFinal());// Mencetak nilaiTotal mahasiswa dengan menggunakan
                                                                     // method nilaiFinal pada indeks i array s
            System.out.println("indeks nilai    : " + s[i].getCourseGrade());// Mencetak indek nilai mahasiswa dengan
                                                                             // menggunakan method getCourseGrade pada
                                                                             // indeks i array s

        }
        System.out.println("=================================================");// mencetak atau menampilkan pemisah
        System.out.println("Mahasiswa S1 yang lulus : ");// mencetak mahasiswa S1 yang lulus
        for (int i = 0; i < s.length; i++) {// Melakukan perulangan untuk setiap objek dalam array s
            if (s[i] instanceof S1) {// Mengecek apakah objek tersebut merupakan mahasiswa S1
                if (s[i].getCourseGrade().equalsIgnoreCase("C") || s[i].getCourseGrade().equalsIgnoreCase("B")
                        || s[i].getCourseGrade().equalsIgnoreCase("A")) {// Mengecek apakah indeks nilai mahasiswa
                                                                         // adalah C, B, atau A
                    System.out.println(("Nama : " + s[i].getNama() + "\nGrade : " + s[i].getCourseGrade()));// Menampilkan
                                                                                                            // nama
                                                                                                            // mahasiswa
                                                                                                            // yang
                                                                                                            // lulus dan
                                                                                                            // grade-nya
                    System.out.println("<------------------------------->");// Menampilkan garis pemisah antara setiap
                                                                            // mahasiswa yang lulus
                }
            }
        }

    }
}

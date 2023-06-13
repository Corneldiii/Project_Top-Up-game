package presentasi;

import java.util.Scanner;

public class mainKar {// deklarasi class
    public static void main(String[] args) {// Deklarasi metode main
        Scanner tampung = new Scanner(System.in);// Proses instansiasi Scanner Class ke dalam variael tampung
        System.out.print("Masukan jumlah pegawai : ");// mencetak masukkan jumlah pegawai
        int x = tampung.nextInt();// membaca masukan pengguna untuk jumlah pegawai yang akan dimasukkan
        Karyawan[] A = new Karyawan[x];// membuat sebuah array karyawan dengan jumlah yang telah dimasukkan pengguna

        for (int i = 0; i < A.length; i++) {// melakukan perulangan
            System.out.println("---------" + (i + 1) + "---------");//// menampilkan pesan untuk memasukkan informasi
                                                                    //// karyawan
            System.out.print("Masukan Jabatan           : ");// Mencetak masukkan jabatan
            String jabatan = tampung.next();// Mengambil input dari pengguna dan menyimpannya sebagai jabatan
                                            // menggunakan objek Scanner
            System.out.print("Masukan nama anda         :  ");// Mencetak Masukkan Nama Anda
            String nama = tampung.next();// Mengambil input dari pengguna dan menyimpannya sebagai nama menggunakan
                                         // objek Scanner
            System.out.print("Masukan NPP anda          : ");// mencetak Masukkan NPP anda
            int npp = tampung.nextInt();// Menerima input nilai integer dari pengguna untuk NPP
            System.out.print("Jumlah anak               : ");// Mencetak tulisan Jumlah anak
            int jum = tampung.nextInt();// Menerima input nilai integer dari pengguna untuk jum
            if (jabatan.equalsIgnoreCase("Kontrak")) {// jika jabatan yang dimasukkan adalah Kontrak
                A[i] = new Kontrak();// maka akan membuat objek baru dari kelas Kontrak
                System.out.print("Masukan gaji per hari   : ");// mencetak tulisan Gaji per hari
                int gaji = tampung.nextInt();// Menerima input nilai integer dari pengguna untuk Gaji

                System.out.print("Masukan jumlah hari     : ");// Mencetak tulisan Masukkan Jumlah Hari
                int jumHari = tampung.nextInt();// Menerima input nilai integer dari pengguna untuk jumHari

                A[i].setJumlahAnak(jum);// Mengambil inputan jumlah anak dari user dan diset ke objek Karyawan pada
                                        // indeks ke-i
                A[i].setNama(nama);// Mengambil inputan nama dari user dan diset ke objek Karyawan pada indeks ke-i
                A[i].setNpp(npp);// Mengambil inputan Npp dari user dan diset ke objek Karyawan pada indeks ke-i

                A[i].setJumHari(jumHari);// Mengambil inputan JumHari dari user dan diset ke objek Karyawan pada indeks
                                         // ke-i

                A[i].setUpahHarian(gaji);// Mengambil inputan UpahHarian dari user dan diset ke objek Karyawan pada
                                         // indeks ke-i

            } else if (jabatan.equalsIgnoreCase("Tetap")) {// jika jabatan yang dimasukkan adalah Tetap

                A[i] = new Tetap();// maka akan membuat objek baru dari kelas Tetap
                System.out.print("Masukan gaji pokok anda : ");// Mencetak Tulisan Masukkan Gaji Pokok anda
                int gaji = tampung.nextInt();// Menerima input nilai integer dari pengguna untuk Gaji

                A[i].setJumlahAnak(jum);// Mengambil inputan jumlah anak dari user dan diset ke objek Karyawan pada
                                        // indeks ke-i
                A[i].setNama(nama);// Mengambil inputan nama dari user dan diset ke objek Karyawan pada indeks ke-i
                A[i].setNpp(npp);// Mengambil inputan Npp dari user dan diset ke objek Karyawan pada indeks ke-i
                A[i].setGajiPokok(gaji);// Mengambil inputan GajiPokok dari user dan diset ke objek Karyawan pada indeks
                                        // ke-i

            }
        }
        for (int i = 0; i < A.length; i++) {// melakukan perulangan
            System.out.println("_______________________");
            System.out.println("Nama            : " + A[i].getNama());// mencetak nama yang didapatkan dari method
                                                                      // getNama() pada objek A dengan index i.
            System.out.println("NPP             : " + A[i].getNpp());// mencetak NPP yang didapatkan dari method
                                                                     // getNpp() pada objek A dengan index i.
            if (A[i] instanceof Kontrak) {// jika objek A dengan index i merupakan instance dari kelas Kontrak
                System.out.println("Jabatan     : Kontrak");// maka mencetak jabatan kontrak
                System.out.println("Upah total  : " + A[i].getJabatan());// mencetak upah total karyawan yang didapatkan
                                                                         // dari method getJabatan() pada objek A dengan
                                                                         // index i
            } else if (A[i] instanceof Tetap) {// jika tidak objek A dengan index i merupakan instance dari kelas Tetap
                System.out.println("Jabatan     : Tetap");// maka mencetak Jabatan tetap
                System.out.println("Upah total  : " + A[i].getJabatan());// mencetak upah total karyawan yang didapatkan
                                                                         // dari method getJabatan() pada objek A dengan
                                                                         // index i

            }
        }
    }
}

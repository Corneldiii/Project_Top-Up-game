package Modul_7;

import java.util.Scanner;

public class MainKar {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        // padaa awal saya meminta input data tentag jabatan user
        System.out.println("Jabatan anda : \n1.Karyawan Tetap\n2.Karyawan Kontrak");
        System.out.print("pilih : ");
        int pilih = tampung.nextInt();
        // meminta data user
        System.out.print("Masukan nama anda       : ");
        String nama = tampung.next();
        System.out.print("Masukan NPP anda        : ");
        int npp = tampung.nextInt();
        // dengan data input jabatan yang ada cek dengan perintah if bandingkan variable
        // pilih
        if (pilih == 1) {// jika 1 lakukan perintah dibawah ini
            //membuat objek baru dengan nama karTep dengan tipe KaryawanTetap
            KaryawanTetap karTep = new KaryawanTetap();
            // meminta input yang diperlukan
            System.out.print("Masukan gaji pokok anda : ");
            int gaji = tampung.nextInt();
            System.out.print("Masukan jumlah anak     : ");
            int jumAnk = tampung.nextInt();
            karTep.setNama(nama);// mengset nama pada objek karTep
            karTep.setNpp(npp);// mengset npp pada objek karTep
            karTep.setJumlahAnak(jumAnk);// mengset jumlahAnak pada objek karTep
            karTep.setGajiPokok(gaji);// mengset gajiPokok pada objek karTep
            // Selanjutnya mencetak output dengan memanggil hal yang diperlukan
            System.out.println("Nama    : " + karTep.getNama());// mencetak Nama dan mengambil isi dari atribut nama
                                                                // pada objek karTep dengan perintah getNama
            System.out.println("NPP     : " + karTep.getNpp());// mencetak NPP dan mengambil isi dari atribut npp pada
                                                               // objek karTep dengan perintah getNpp
            System.out.println("Gaji Total  : " + karTep.gajiTotal());// mencetak gaji total dan memanggil method
                                                                      // gajitotal pada objek karTep
        } else if (pilih == 2) {// atau jika 2 lakukan perintah di bawah ini
            //membuat objek baru dengan nama karKon yang bertipe KaryawanKonntrak
            KaryawanKonntrak karKon = new KaryawanKonntrak();
            // meminta input yang diperlukan
            System.out.print("Masukan gaji per hari   : ");
            int gaji = tampung.nextInt();
            System.out.print("Masukan jumlah anak     : ");
            int jumAnk = tampung.nextInt();
            System.out.print("Masukan jumlah hari     : ");
            int jumHari = tampung.nextInt();
            karKon.setNama(nama);// mengset nama pada objek karKon
            karKon.setNpp(npp);// mengset npp pada objek karKon
            karKon.setUpahHarian(gaji);// mengset upah harian pada objek karKon
            karKon.setJumlahAnak(jumAnk);// mengset jumlahAnak pad aobjek karKon
            karKon.setJumHari(jumHari);// mengset jumlahHari pada objek karKon
            // Selanjutnya mencetak output dengan memanggil hal yang diperlukan
            System.out.println("Nama    : " + karKon.getNama());// mencetak Nama dan mengambil isi dari atribut nama
                                                                // pada objek karKon dengan perintah getNama
            System.out.println("NPP     : " + karKon.getNpp());// mencetak NPP dan mengambil isi dari atribut npp pada
                                                               // objek karKon dengan perintah getNpp
            System.out.println("Gaji total  : " + karKon.upahTotal());// mencetakupah Total dan memanggil method
                                                                      // upahToatal pada objek karKon
        }

    }

}

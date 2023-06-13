package Latihan;

import java.util.Scanner;

public class MainPeg {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        double tunjangan;// mendeklarasi variable
        pegawai[] A;// mendeklarasi A sebagai array of pegawai
        System.out.print("Banyak pegawai : ");
        int bnyk = tampung.nextInt();
        System.out.println("");
        A = new pegawai[bnyk];// memasukan panjang dari array of objek A

        for (int i = 0; i < A.length; i++) {
            // pada line 17 hingga 26 unutk memasukan data
            System.out.println("===== Data Pegawai =====");
            System.out.println("Pilih jabatan \n1.Menejer\n2.Pemasaran\n3.Honorer");
            System.out.print(" pilih : ");
            int jab = tampung.nextInt();
            System.out.print("Nama    : ");
            String nama = tampung.next();
            System.out.print("NPP     : ");
            int npp = tampung.nextInt();
            System.out.print("Gaji pokok : ");
            int gaji = tampung.nextInt();

            if (jab == 1) {// jika isi variable jab sam adengan 1
                // pada line 30 hingga 33 unutk memasukan data
                System.out.print("Tunjangan : ");
                int tun = tampung.nextInt();
                System.out.print("Lembur : ");
                int lembur = tampung.nextInt();
                A[i] = new manajer();// mengubah tipe array of objek A indeks i menjadi manajer
                ((manajer) A[i]).setNama(nama);// mengset nama kedalam A[i] yang bertipe manajer
                ((manajer) A[i]).setNpp(npp);
                ;// mengset npp kedalam A[i] yang bertipe manajer
                ((manajer) A[i]).setGapok(gaji);
                ;// mengset gapok kedalam A[i] yang bertipe manajer
                ((manajer) A[i]).setLembur(lembur);
                ;// mengset lembur kedalam A[i] yang bertipe manajer
                ((manajer) A[i]).setTunJab(tun);
                ;// mengset tunjangan jabatan kedalam A[i] yang bertipe manajer
            } else if (jab == 2) {// jika isi variable jab sama dengan 2
                // memasukan data
                System.out.print("Bonus   : ");
                int bonus = tampung.nextInt();
                A[i] = new Pemasaran();// mengubah tipe array of objek A indeks i menjadi pemasaran
                ((Pemasaran) A[i]).setNama(nama);// mengset nama kedalam A[i] yang bertipe pemasaran
                ((Pemasaran) A[i]).setNpp(npp);// mengset npp kedalam A[i] yang bertipe pemasaran
                ((Pemasaran) A[i]).setGapok(gaji);// mengset gapok kedalam A[i] yang bertipe pemasaran
                ((Pemasaran) A[i]).setBonus(bonus);// mengset bonus kedalam A[i] yang bertipe pemasaran
            } else if (jab == 3) {// jika isi variable jab sama dengan 3
                // memasukan data
                System.out.print("Lembur : ");
                int lembur = tampung.nextInt();
                A[i] = new Honorer();// mengubah tipe array of objek A indeks i menjadi Honorer
                ((Honorer) A[i]).setNama(nama);// mengset nama kedalam A[i] yang bertipe Honorer
                ((Honorer) A[i]).setNpp(npp);// mengset nama kedalam A[i] yang bertipe Honorer
                ((Honorer) A[i]).setGapok(gaji);// mengset nama kedalam A[i] yang bertipe Honorer
                ((Honorer) A[i]).setLembur(lembur);// mengset nama kedalam A[i] yang bertipe Honorer
            }
            System.out.println("");
        }

        for (int j = 0; j < A.length; j++) {
            // mencetak data diri dari setiap array of objek A,berupa nama npp dan status
            System.out.println((j + 1) + ". Npp : \t" + A[j].getNpp() + "\nNama \t:" + A[j].getNama() + "\nStatus :\t"
                    + A[j].getStatus());

            if (A[j] instanceof manajer) {// jika array of objek a bersifat manajer
                manajer man1;// dekalrasi variable bertipe manajer
                man1 = (manajer) A[j];// memasukan data aray of objek A yang bertipe manajer kedalam variable man1
                A[j].getEmail();// memanggil method getEmail sesuai jenis dari array of objek
                System.out.println("=========Manajer=============");
                tunjangan = man1.getTunJab() + man1.getLembur();// menghitung tunjangan dengan memanggil method
                                                                // getTunJab dan getLembur
            } else if (A[j] instanceof Pemasaran) {// jika array of objek a bersifat pemasaran
                Pemasaran pem1;// dekalrasi variable bertipe Pemasaran
                pem1 = (Pemasaran) A[j];// memasukan data aray of objek A yang bertipe Pemasaran kedalam variable pem1
                A[j].getEmail();// memanggil method getEmail sesuai jenis dari array of objek
                System.out.println("=========Pemasaran========== ");
                tunjangan = pem1.getBonus();// menghitung tunjangan dengan memanggil method getBonus
            } else if (A[j] instanceof Honorer) {// jika array of objek a bersifat Honorer
                Honorer hon1;// dekalrasi variable bertipe Honorer
                hon1 = (Honorer) A[j];// memasukan data aray of objek A yang bertipe Honorer kedalam variable hon1
                A[j].getEmail();// memanggil method getEmail sesuai jenis dari array of objek
                System.out.println("=========Honorer==============");
                tunjangan = hon1.getLembur();// menghitung tunjangan dengan memanggil method getLembur
            }
            // mencetak setiap gaji pokok tunjangan dan gaji total dari setiap array of
            // objek A
            System.out.println("Gaji pokok : \t" + A[j].getGapok() + "\nTunjangan :\t" + A[j].getTunjangan()
                    + "\nGaji total : \t" + A[j].hitungGatot());
            System.out.println("");
        }
    }
}

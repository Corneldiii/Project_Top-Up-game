package modul_8;

import java.util.Scanner;

public class mainMhs {
    public static void main(String[] args) {
        //meminta banyak data yang akan diproses
        Scanner tampung = new Scanner(System.in);
        System.out.print("Masukan jumlah anak : ");
        int x = tampung.nextInt();
        //membuat objek s bertipe array of Mahasiswa1 
        Mahasiswa1[] s = new Mahasiswa1[x];
        
        //meminta input yang diperlukan
        for (int i = 0; i < s.length; i++) {
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
            System.out.print("Masukan jenjang          : ");
            String gelar = tampung.next();
            System.out.println("----------------------------");
            //cek variablle gelar
            if (gelar.equalsIgnoreCase("S1")) {
                //membuat array s[i] sebagai objek baru S1()
                //lalu mengSet semua yang data
                s[i] = new S1();
                s[i].setNama(nama);
                s[i].setNim(nim);
                s[i].setTglLahir(tglLah);
                s[i].setUas(uas);
                s[i].setUts1(uts1);
                s[i].setUts2(uts2);
            } else if (gelar.equalsIgnoreCase("S2")) {
                //membuat array s[i] sebagai objek baru S2()
                //lalu mengSet semua yang data
                s[i] = new S2();
                s[i].setNama(nama);
                s[i].setNim(nim);
                s[i].setTglLahir(tglLah);
                s[i].setUas(uas);
                s[i].setUts1(uts1);
                s[i].setUts2(uts2);
            }

        }
        //menampilkan semua data sebanyak panjang s
        System.out.println("===============================================");
        for (int i = 0; i < s.length; i++) {
            System.out.println("Nama : " + s[i].getNama());
            System.out.println("Nim : " + s[i].getNim());
            System.out.println("Nilai Total : " + s[i].nilaiFinal());
            System.out.println("indeks nilai    : " + s[i].getCourseGrade());
            System.out.println("____________________________________________");

        }
        //menampilkan mahasiswa S1 yang lulus
        System.out.println("=================================================");
        System.out.println("Mahasiswa S1 yang lulus : ");
        for (int i = 0; i < s.length; i++) {
            if (s[i] instanceof S1) {//jika array s[i] berada pada class S1 
                if (s[i].nilaiFinal()>=56) {//cek apakah nilainya lebih dari 56
                    System.out.println(("Nama : " + s[i].getNama() + "\nGrade : "+s[i].getCourseGrade()));
                    System.out.println("<------------------------------->");
                }
            }
        }

    }
}

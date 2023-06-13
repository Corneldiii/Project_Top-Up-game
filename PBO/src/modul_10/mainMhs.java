package modul_10;

import java.util.*;

public class mainMhs {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        Mahasiswa1[] obj;// Mendeklarasi array of objek bernama obj
        System.out.println("======================");
        System.out.print("Banyak Mahasiswa  : ");// meminta banyak mahasiswa1
        int x = tampung.nextInt();
        obj = new Mahasiswa1[x];// menentukan panjang dari array of objek Mahasiswa1
        for (int i = 0; i < obj.length; i++) {
            tampung.nextLine();
            // meminta dat ayang diperlukan
            System.out.print("Masukan nama anda         : ");
            String nama = tampung.nextLine();
            System.out.print("Masukan NIM                 : ");
            int nim = tampung.nextInt();
            System.out.print("Gelar anda                : ");
            String gelar = tampung.next();
            if (gelar.equalsIgnoreCase("S1")) {// jika variable gelar sam adengan S1
                obj[i] = new S1();// ubaah array of objek indek i sebagai objek dari class S1
                obj[i].setNim(nim);// line 24 dan 25 digunakan untuk mengset nama dan nim
                obj[i].setName(nama);
                System.out.println("=========================");
                // meminta input nilai
                System.out.print("Masukan nilai UTS 1 : ");
                int uts1 = tampung.nextInt();
                System.out.print("Masukan nilai UTS 2 : ");
                int uts2 = tampung.nextInt();
                System.out.print("Masukan nilai UAS   : ");
                int uas = tampung.nextInt();
                // memasukan hasil input nilai kedalam array of objek test indek 0 sampai 2
                // dengan melalui array of objek obj indekx ke i
                obj[i].test[0] = uts1;
                obj[i].test[1] = uts2;
                obj[i].test[2] = uas;

            } else if (gelar.equalsIgnoreCase("S2")) {// jika variable gelar sama de ngan S2
                obj[i] = new S2();// membuat array of objek obj indek i menjadi objek dari class S2
                obj[i].setNim(nim);// pada line 41 dan 42 digunakan untuk mengset nama dan nim
                obj[i].setName(nama);
                // memasukan input berupa nilai
                System.out.println("=========================");
                System.out.print("Masukan nilai UTS 1 : ");
                double uts1 = tampung.nextInt();
                System.out.print("Masukan nilai UTS 2 : ");
                double uts2 = tampung.nextInt();
                System.out.print("Masukan nilai UAS   : ");
                double uas = tampung.nextInt();
                // memasukan hasil input nilai kedalam array of objek test indek 0 sampai 2
                // dengan melalui array of objek obj indekx ke i
                obj[i].test[0] = uts1;
                obj[i].test[1] = uts2;
                obj[i].test[2] = uas;
            }

        }

        // mencetak semua data mahasiswa yang sudah di inputkan dan menunjukan nilai
        // yang diperoleh d
        for (int i = 0; i < obj.length; i++) {
            System.out.println("===============================================");
            System.out.println("Nama : " + obj[i].getName());// mencetak nama dari array of objek obj indek i dengan
                                                             // perintah getName()
            System.out.println("Nim : " + obj[i].getNim());// mencetak nim dari array of objek obj indek i dengan
                                                           // perintah getNim()
            System.out.println("Nilai Total : " + obj[i].nilaiFinal());// mencetak nilai total dari array of objek obj
                                                                       // indek i dengan perintah nilaiFinal()
            System.out.println("indeks nilai    : " + obj[i].getCourseGrade());// mencetak nilai final dari array of
                                                                               // objek obj indek i dengan perintah
                                                                               // getCourseGrade()

        }

        System.out.println("=================================================");
        // menampilkan mahasiswa S1 yang lulus
        System.out.println("Mahasiswa S1 yang lulus : ");
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof S1) {// jika array s[i] berada pada class S1
                if (obj[i].nilaiFinal() >= 56) {// cek apakah nilainya lebih dari 56
                    System.out.println(("Nama : " + obj[i].getName() + "\nGrade : " + obj[i].getCourseGrade()));
                    System.out.println("<------------------------------->");
                }
            }
        }
    }
}

package modul_8;

import java.util.Scanner;

public class mainKar {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        //meminta jumlah data yang akan diakses
        System.out.print("Masukan jumlah pegawai : ");
        int x = tampung.nextInt();
        //membuat objek A bertipe array of Karyawan sebanyak x
        Karyawan[] A = new Karyawan[x];
        //memasukan data yang diperlukan dengan perintah for sebanyak panjang A
        for (int i = 0; i < A.length; i++) {
            System.out.println("---------"+(i+1)+"---------");
            System.out.print("Masukan Jabatan           : ");
            String jabatan = tampung.next();
            System.out.print("Masukan nama anda         :  ");
            String nama = tampung.next();
            System.out.print("Masukan NPP anda          : ");
            int npp = tampung.nextInt();
            System.out.print("Jumlah anak               : ");
            int jum = tampung.nextInt();
            //mengcek variable jabatan
            if (jabatan.equalsIgnoreCase("Kontrak")) {
                //meminta input kembali dan membuat array A[i] bertipe Kontrak()
                A[i] = new Kontrak();
                System.out.print("Masukan gaji per hari   : ");
                int gaji = tampung.nextInt();
                System.out.print("Masukan jumlah hari     : ");
                int jumHari = tampung.nextInt();
                //mengSet semua data yang diperoleh
                A[i].setJumlahAnak(jum);
                A[i].setNama(nama);
                A[i].setNpp(npp);
                A[i].setJumHari(jumHari);
                A[i].setUpahHarian(gaji);
            }else if(jabatan.equalsIgnoreCase("Tetap")){//mengtes var jabatan
                //meminta input kembali dan membuat array A[i] bertipe Tetap()
                A[i]=new Tetap();
                System.out.print("Masukan gaji pokok anda : ");
                int gaji = tampung.nextInt();
                //mengSet semua data yang diperoleh
                A[i].setJumlahAnak(jum);
                A[i].setNama(nama);
                A[i].setNpp(npp);
                A[i].setGajiPokok(gaji);

            } 
        }
        //proses pencetakann semua data yang sudah diberikan
        for (int i = 0; i < A.length; i++) {
            System.out.println("_______________________");
            System.out.println("Nama            : "+A[i].getNama());
            System.out.println("NPP             : "+A[i].getNpp());
            //mengtes apakah array A[i] berada di class kontrak atau Tetap
            if(A[i] instanceof Kontrak){
                System.out.println("Jabatan     : Kontrak");
                System.out.println("Upah total  : "+A[i].getJabatan());
            }else if(A[i] instanceof Tetap){
                System.out.println("Jabatan     : Tetap");
                System.out.println("Upah total  : "+A[i].getJabatan());
            }
        }
    }
}

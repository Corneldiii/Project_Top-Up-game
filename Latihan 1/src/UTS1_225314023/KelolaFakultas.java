package UTS1_225314023;
import java.util.Scanner;
public class KelolaFakultas {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        System.out.print("Masukan jumlah Prodi    : ");
        int n=tampung.nextInt();

        Prodi[] data=new Prodi[n];
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukan data prodi "+(i+1)+": ");
            System.out.println("");
            String test=tampung.nextLine();
            System.out.print("Kode Prodi  : ");
            String kode=tampung.nextLine();
            System.out.print("Nama Prodi  : ");
            String nama=tampung.nextLine();
            System.out.print("Akreditasi  :");
            String akre=tampung.nextLine();
            System.out.print("Jumlah Mahasiswa    :");
            int jum=tampung.nextInt();

            data[i]=new Prodi(kode,nama);
            data[i].setJenjangAkreditas(akre);
            data[i].setJumlahMahasisiwa(jum);
        }

        System.out.println("INPUT DATA FAKULTAS");
        System.out.println("");
        String c=tampung.nextLine();
        System.out.print("Kode Fakultas   : ");
        String code=tampung.nextLine();
        System.out.print("Nama Fakultas   : ");
        String nama=tampung.nextLine();
        Fakultas datfak=new Fakultas(code, nama);
        datfak.setDaftarProdi(data);

        Prodi[] tamp=datfak.getDaftarProdi();
        
        System.out.println("INFORMASI fAKULTAS DAN PRODI");
        System.out.println(datfak.getNamaFakultas()+"("+datfak.getKodeFakultas()+")");

        System.out.println("Daftar Prodi    : ");
        System.out.println("Kode Prodi  Nama Prodi  Akreditasi  Jumlah Mahasiswa");
        for (int i = 0; i < data.length; i++) {
            System.out.println(tamp[i].getKodeProdi()+"         "+tamp[i].getNamaProdi()+"      "+tamp[i].getJenjangAkreditas()+"       "+tamp[i].getJumlahMahasisiwa());
        }

        System.out.print("Cari prodi dengan akreditasi    : ");
        String cari=tampung.nextLine();

        System.out.println("Prodi dengan jenjang akreditasi "+cari);
        System.out.println("Kode Prodi  Nama Prodi  Akreditasi  Jumlah Mahasiswa");
        datfak.cariProdi(tamp, cari);

        System.out.println("Rata-rata jumlah mahasiswa  : "+datfak.rataRata(tamp)+" orang");

    }
}

package UTS1_225314023;
import javax.swing.*;
public class KelolaFakultas {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan jumlah prodi  : "));

        Prodi[] data=new Prodi[n];
        
        for (int i = 0; i < data.length; i++) {
            String kode=JOptionPane.showInputDialog(null, "Masukan data Prodi "+(i+1)+"\nKode Prodi");
            String nama=JOptionPane.showInputDialog(null, "Masukan data Prodi "+(i+1)+"\nNama Prodi");
            String akre=JOptionPane.showInputDialog(null, "Masukan data Prodi "+(i+1)+"\nAkreditasi");
            int jum=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan data Prodi "+(i+1)+"\nJumlah Mahasiswa"));

            data[i]=new Prodi(kode,nama);
            data[i].setJenjangAkreditas(akre);
            data[i].setJumlahMahasisiwa(jum);
        }

        String kode=JOptionPane.showInputDialog(null, "INPUT DATA FAKULTAS\nKode Fakultas");
        String nama=JOptionPane.showInputDialog(null, "INPUT DATA FAKULTAS\nNama Fakultas");
        Fakultas datfak=new Fakultas(kode, nama);
        datfak.setDaftarProdi(data);

        Prodi[] tamp=datfak.getDaftarProdi();
        
        System.out.println("INFORMASI fAKULTAS DAN PRODI");
        System.out.println(datfak.getNamaFakultas()+"("+datfak.getKodeFakultas()+")");

        System.out.println("Daftar Prodi    : ");
        System.out.println("Kode Prodi  Nama Prodi      Akreditasi  Jumlah Mahasiswa");
        for (int i = 0; i < data.length; i++) {
            System.out.println(tamp[i].getKodeProdi()+"         "+tamp[i].getNamaProdi()+"          "+tamp[i].getJenjangAkreditas()+"       "+tamp[i].getJumlahMahasisiwa());
        }

        String cari=JOptionPane.showInputDialog(null, "Cari prodi dengan akreditasi");

        System.out.println("Prodi dengan jenjang akreditasi "+cari);
        System.out.println("Kode Prodi  Nama Prodi      Akreditasi  Jumlah Mahasiswa");
        datfak.cariProdi(tamp, cari);

        System.out.println("Rata-rata jumlah mahasiswa  : "+datfak.rataRata(tamp)+" orang");

    }
}

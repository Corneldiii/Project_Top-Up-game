package BelajarUTS;

import latihan.main;
import javax.swing.*;;
public class MainObat {
    public static void main(String[] args) {
        DataDokter[] dataDok;
        int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah dokter yang berjaga"));
        dataDok=new DataDokter[x];
        for (int i = 0; i < dataDok.length; i++) {
            String nama=JOptionPane.showInputDialog(null, "Data dokter yang berjaga\nMasukan nama dokter "+(1+i));
            String alamat=JOptionPane.showInputDialog(null, "Data dokter yang berjaga\nMasukan alamat dokter "+(1+i));
            String kode=JOptionPane.showInputDialog(null, "Data dokter yang berjaga\nMasukan kode dokter "+(1+i));
            dataDok[i]=new DataDokter(nama,alamat,kode);
        }
        DataPasien[] datPas;
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah pasien yang akan didata"));
        datPas=new DataPasien[n];
        for (int i = 0; i < datPas.length; i++) {
            String nama=JOptionPane.showInputDialog(null, "Data Pasien\nMasukan nama pasien "+(1+i));
            String alamat=JOptionPane.showInputDialog(null, "Data Pasien\nMasukan alamat pasien "+(1+i));
            String talLah=JOptionPane.showInputDialog(null, "Data Pasien\nMasukan tanggal lahir pasien "+(1+i));
            String gejala=JOptionPane.showInputDialog(null, "Data Pasien\nMasukan gejala yang sering dialami ");

            datPas[i]=new DataPasien(nama,alamat,talLah);
            datPas[i].setGejala(gejala);
        }
        DataObat[] data=new DataObat[3];
        data[0]=new DataObat("Ultra flu",8000);
        data[1]=new DataObat("Paracetamol",10000);
        data[2]=new DataObat("OBH combi",20000);
        
        Resep rsp=new Resep();
        rsp.setDatDok(dataDok);
        rsp.setDatOb(data);
        rsp.setDatPas(datPas);

        DataDokter[] tampDok=rsp.getDatDok();
        DataPasien[] tampPas=rsp.getDatPas();
        DataObat[] tampOb=rsp.getDatOb();
        System.out.println("Dokter yang sedang jaga");
        for (int i = 0; i < dataDok.length; i++) {
            System.out.println((i+1)+"."+tampDok[i].getNama());
        }
        String pilih=JOptionPane.showInputDialog(null,"Pilih dokter yang sedang berjaga");
        System.out.println("!!!Data Pasien!!!");
        for (int index = 0; index < datPas.length; index++) {
            System.out.println("Nama    : "+tampPas[index].getNama());
            System.out.println("Alamat  : "+tampPas[index].getAlamat());
            System.out.println("Tanggal Lahir   : "+tampPas[index].getTanggalLahir());
            System.out.println("Dokter pengampu : "+pilih);
            System.out.println("Gejala  : "+tampPas[index].getGejala());
            System.out.println("Harga Obat  : "+rsp.hargaTotal());
            rsp.penyakit(tampPas[index].getGejala());
            rsp.maxMin();
        }
    }
}

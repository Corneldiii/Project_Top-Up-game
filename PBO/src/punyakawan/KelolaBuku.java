/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punyakawan;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class KelolaBuku {

    public static void main(String[] args) {
      int jumlah=Integer.parseInt(JOptionPane.showInputDialog(null,"Memasukan jumlah buku"));
      Buku[] data1=new Buku[jumlah];
      Buku add=new Buku();
      int jumpengarang=0;
      
      for(int i=0;i < data1.length;i++){
          String kode=JOptionPane.showInputDialog(null,"Memasukan data kode buku");
          String judul=JOptionPane.showInputDialog(null,"Memasukan data judul buku");
          String nama=JOptionPane.showInputDialog(null,"Memasukan data nama peneerbit");
          int tahun=Integer.parseInt(JOptionPane.showInputDialog(null,"Memasukan data tahun terbit buku"));
          jumpengarang=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah pengarang"));
          DataPengarang[] pengarang=new DataPengarang[jumpengarang];
          for (int j = 0; j < pengarang.length; j++) {
              String namaPeng=JOptionPane.showInputDialog(null,"Nama pengarang");
              String alamat=JOptionPane.showInputDialog(null,"Alamat pengarang");
              String NIK=JOptionPane.showInputDialog(null,"NIK pengarang");
              DataPengarang daftarPengarang=new DataPengarang (namaPeng,alamat,NIK);
              pengarang[j]=daftarPengarang;
          }
          
          data1[i]=new Buku();
          data1[i].setJudul(judul);
          data1[i].setKodeBuku(kode);
          data1[i].setTahunTerbit(tahun);
          data1[i].setNamaPengarang(nama);
          data1[i].setDataPengarang(pengarang);
        } 
      DataPengarang baru=new DataPengarang("Marsha","Jl.Puan","12345");
      data1[jumlah-1].tambahPengarang(jumpengarang-1, baru);
      
      
      
      
        for (int i = 0; i < data1.length; i++) {
            System.out.println("Buku "+(i+1));
            System.out.println("Kode buku "+ data1[i].getKodeBuku());
            System.out.println("Judul buku "+data1[i].getJudul());
            System.out.println("Tahun terbit "+data1[i].getTahunTerbit());
            System.out.println("Daftar pengarang");
            DataPengarang[] pengarangBuku =data1[i].getDataPengarang();
            for (int j = 0; j < pengarangBuku.length; j++) {
                System.out.println((j+1)+". "+pengarangBuku[j].getNama());
            }
        }
        int cari=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan tahun dicari" ));
        add.cariTahun(cari, data1);
    }
}

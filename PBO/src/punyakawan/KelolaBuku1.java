/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class KelolaBuku1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int jum=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah buku baru yang akan di simpan"));
      Buku1[] data1=new Buku1[jum];
      
     
      for(int i=0;i<= data1.length-1;i++){
        String kode=JOptionPane.showInputDialog(null,"Masukan data kode buku"+(i+1));
          String judul=JOptionPane.showInputDialog(null,"Masukan data judul buku"+(i+1));
          String penerbit=JOptionPane.showInputDialog(null,"Masukan data penerbit buku"+(i+1));
          int tahun=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan data tahun terbit buku"+(i+1)));
          int jmlhpeng=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan data jumlah pengarang"+(i+1)));
          DaftarPengarang[]pengarang=new DaftarPengarang[jmlhpeng];
          for(int j = 0;j < pengarang.length;j++){
           String nama=JOptionPane.showInputDialog(null,"data nama Pengarang");
           String alamat=JOptionPane.showInputDialog(null,"data alamat Pengarang");
           String nik=JOptionPane.showInputDialog(null,"data nik pengarang");
           DaftarPengarang dafPengarang=new DaftarPengarang(nama,alamat,nik);
           pengarang[j]=dafPengarang;
          }
      
         data1[i]=new Buku1();
         data1[i].setKodeBuku(kode);
         data1[i].setJudul(judul);
         data1[i].setPenerbit(penerbit);
         data1[i].setTahunTerbit(tahun);
         data1[i].setDaftarPengarang(pengarang);
      }
      for(int i =0; i < data1.length;i++){
          System.out.println("data1"+(i+1));
          System.out.println("kode buku :"+data1[i].getKodeBuku());
          System.out.println("judul:"+data1[i].getJudul());
          System.out.println("tahun terbit :"+data1[i].getTahunTerbit());
          DaftarPengarang[]pengarangBuku=data1[i].getDaftarPengarang();
          
          for(int j =0; j < pengarangBuku.length;j++){
          System.out.println((j+1)+"."+pengarangBuku[j].getNama());
      }
      }
         
        
      
    }
    
}

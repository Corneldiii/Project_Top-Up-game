/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otakatik;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class bayu {
    public static void main(String[] args) {
      Scanner Scan = new Scanner(System.in);
      int jumlah=Integer.parseInt(JOptionPane.showInputDialog(null,"Memasukan jumlah data"));
      Buku[] data1=new Buku[jumlah];
      Buku Buku1=new Buku();
      
      for(int i=0;i <= data1.length-1;i++){
          String kode=JOptionPane.showInputDialog(null,"Memasukan data kode buku"+(i+1));
          String judul=JOptionPane.showInputDialog(null,"Memasukan data judul buku"+(i+1));
          String nama=JOptionPane.showInputDialog(null,"Memasukan data nama pengarang"+(i+1));
          int tahun=Integer.parseInt(JOptionPane.showInputDialog(null,"Memasukan data tahun terbit buku"+(i+1)));
          
          data1[i]=new Buku();
          data1[i].setJudul(judul);
          data1[i].setKodeBuku(kode);
          
          data1[i].setTahunTerbit(tahun);
          data1[i].setNamaPengarang(nama);
        }
        System.out.println("Judul Buku :");
        for(int i=0;i <= data1.length-1;i++){
            System.out.println((i+1)+"."+data1[i].getJudul());
        }
        
        int MencariTTB=Integer.parseInt(JOptionPane.showInputDialog(null,"data buku dari Tahunnya"));
        System.out.println("Data Dari Judul Buku Berdasarkan  Tahun Terbitnya :"+MencariTTB);
        for(int i=0;i <= data1.length-1;i++){
            if(data1[i].getTahunTerbit()==MencariTTB){
                System.out.println("-"+data1[i].getJudul());
            }
        }
        String MencariNP=JOptionPane.showInputDialog(null,"Memasukan data nama pengarang");
                System.out.println("Data Dari Judul Buku Berdasarkan Nama Pengarang:"+MencariNP);
        for(int i=0;i <= data1.length-1;i++){  
                if(data1[i].getNamaPengarang().equals(MencariNP)){
                    System.out.println("-"+data1[i].getJudul());
                }
            
        }
    }
}

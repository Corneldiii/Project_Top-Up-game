/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class KelolaBuku {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        int bnyak= Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan banyak data "));
        DaftarBuku[] data=new DaftarBuku[bnyak];
        DaftarBuku Buku=new DaftarBuku();
        
        for (int i = 0; i <= data.length-1; i++) {
            String judul=JOptionPane.showInputDialog(null,"Masukan judul buku "+(i+1));
            String kode=JOptionPane.showInputDialog(null,"Masukan kode buku "+(i+1));
            int tahun= Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan tahun terbit "+(i+1)));
            String nama=JOptionPane.showInputDialog(null,"Masukan nama pengarang "+(i+1));
            
            data[i]=new DaftarBuku();
            data[i].setJudul(judul);
            data[i].setKode_buku(kode);
            data[i].setNama_pengarang(nama);
            data[i].setTahun_terbit(tahun);
        }
        
        System.out.println("DATA BUKU : ");
        for (int i = 0; i <= data.length-1; i++) {
            System.out.println((i+1)+"."+data[i].getJudul());
        }
        
        int cari=Integer.parseInt(JOptionPane.showInputDialog(null,"Cari buku berdasarkan tahun"));
        System.out.println("DATA JUDUL BUKU DARI TAHUN : "+cari);
        for (int i = 0; i <= data.length-1; i++) {
            if(data[i].getTahun_terbit()==cari){
                System.out.println("- "+data[i].getJudul());
            }
        }
        
        String pengarang=JOptionPane.showInputDialog(null,"Masukan nama pengarang yang dicari");
        System.out.println("DATA JUDUL BUKU BERDASARKAN PENGARANG : "+pengarang);
        for (int i = 0; i <= data.length-1; i++) {
            if(data[i].getNama_pengarang().equals(pengarang)){
                System.out.println("- "+data[i].getJudul());
            }
        }
    }
}

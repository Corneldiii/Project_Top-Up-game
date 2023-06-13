package Modul_4;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
         String banyak=JOptionPane.showInputDialog(null,"Masukan banyak mahasiswa");
         int jumlah=Integer.parseInt(banyak);
         Mahasiswa[] data=new Mahasiswa[jumlah];
         Mahasiswa mhs=new Mahasiswa();
         for (int i = 0; i < jumlah; i++) {
            String nama=JOptionPane.showInputDialog(null,"Masukan nama");
            String nim=JOptionPane.showInputDialog(null,"Masukan nim");
            String tanggal=JOptionPane.showInputDialog(null,"Masukan tanggal lahir");
            String input=JOptionPane.showInputDialog(null,"Masukan nilai uts 1");
            double uts1=Double.parseDouble(input);
            String input2=JOptionPane.showInputDialog(null,"Masukan nilai uts 2");
            double uts2=Double.parseDouble(input2);
            String input3=JOptionPane.showInputDialog(null,"Masukan nilai uas ");
            double uas=Double.parseDouble(input3);
            
            data[i]=new Mahasiswa();
            data[i].setNama(nama);
            data[i].setNim(nim);
            data[i].setTglLahir(tanggal);
            data[i].setUas(uas);
            data[i].setUts1(uts1);
            data[i].setUts2(uts2);
            data[i].nilaiFinal();
        }
         
         System.out.println("=====================================================================");
         System.out.println("nim        Nama    Tgl Lahir       UTS1    UTS2    UAS     Final   Nilai ");
         System.out.println("_____________________________________________________________________");
         for(int i=0;i<jumlah;i++){
            System.out.println(data[i].getNim()+"   "+data[i].getNama()+"   "+data[i].getTglLahir()+"          "+data[i].getUts1()+"   "+data[i].getUts2()+"   "+data[i].getUas()+"    "+data[i].getHitung()+"     "+data[i].nilaiFinal());
         }
         int index=0;
         double max=data[0].getHitung();
         for (int i = 0; i <= data.length-1; i++) {
            if(data[i].getHitung()>max){
                index=i;
            }
        }
         System.out.println("Data dengan nilai tertinggi ");
         System.out.println("Nama           : "+data[index].getNama());
         System.out.println("Nim            : "+data[index].getNim());
         System.out.println("Tangal lahhir  : "+data[index].getTglLahir());
         System.out.println("Nilai final    : "+data[index].getHitung());
         System.out.println("Nilai          : "+data[index].nilaiFinal());
        
    }
}

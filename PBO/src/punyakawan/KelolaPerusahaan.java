/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;
import Modul_2.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class KelolaPerusahaan {
    public static void main(String[] args) {
        Perusahaan data=new Perusahaan("Cahya Abadi","JL.Tinggalkan Kenangan","Stefanus Bayu","220903");
        Pegawai1[] bykGajiPegawai;
        int jmlhPeg=Integer.parseInt(JOptionPane.showInputDialog(null,"jumlah data yang dieksekusi"));
        bykGajiPegawai=new Pegawai1[jmlhPeg];
        for (int i = 0; i< bykGajiPegawai.length;i++){
            String nama=JOptionPane.showInputDialog(null,"nama data ke "+(i+1));
            String npp=JOptionPane.showInputDialog(null,"data dari npp anda");
            String Status=JOptionPane.showInputDialog(null,"data dari status yang anda miliki");
            String gol=JOptionPane.showInputDialog(null,"data golongan yang anda miliki 'golongan1/2/3'");
            int jumlahAnak=0;
            
            if (Status.equalsIgnoreCase("menikah")){
                jumlahAnak=Integer.parseInt(JOptionPane.showInputDialog(null,"data dari jumlah anak yang di miliki"));
            }
            bykGajiPegawai[i]=new Pegawai1();
            bykGajiPegawai[i].setNama(nama);
            bykGajiPegawai[i].setNPP(npp);
            bykGajiPegawai[i].setStatus(Status);
            
            bykGajiPegawai[i].setGolongan(gol);
            bykGajiPegawai[i].setJumlahAnak(jumlahAnak);
        }
        System.out.println("NAMA   NPP  GOLONGAN  STATUS JUMLAHANAK  GAJIPOKOK   TUNJANGAN    :TOTAL");
        System.out.println("-----------------------------------------");
        
        for (int i =0;i < bykGajiPegawai.length;i++){
            System.out.println(bykGajiPegawai[i].getNama()+"  "+bykGajiPegawai[i].getNPP()+"     "+bykGajiPegawai[i].getGolongan()+"    "+bykGajiPegawai[i].getStatus()+"   "+bykGajiPegawai[i].getJumlahAnak()+"   "+bykGajiPegawai[i].hitungGajiPokok()+"  "+bykGajiPegawai[i].tunjanganKeluarga()+"   "+bykGajiPegawai[i].hitungGajiTotal());
        }
        int max = bykGajiPegawai[0].hitungGajiPokok(),min =bykGajiPegawai[0].hitungGajiPokok(),jum=0;
        for(int i= 0; i <= bykGajiPegawai.length-1;i++){
            
            max=bykGajiPegawai[0].hitungGajiPokok();
             min=bykGajiPegawai[0].hitungGajiPokok();
            if(max< bykGajiPegawai[i].hitungGajiPokok()){
                max=bykGajiPegawai[i].hitungGajiPokok();
            }
            else if (min > bykGajiPegawai[i].hitungGajiPokok()){
                min=bykGajiPegawai[i].hitungGajiPokok();
            }
            jum+=bykGajiPegawai[i].hitungGajiPokok();
        
        
            
        }
        System.out.println("Data gaji pokok paling rendah  :"+min);
        System.out.println("Data gaji pokok paling tingging  :"+max);
        System.out.println("Data rata rata dari gaji pokok :"+(jum/jmlhPeg));
       
        
    }
    
}

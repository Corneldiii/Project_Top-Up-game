package modul_5;
import Modul_2.*;
import javax.swing.JOptionPane;
public class KelolaPerusahaan {
    public static void main(String[] args) {
        Perusahaan data=new Perusahaan("Maju Karya","JL.jalan sama kamu","Aldian Octavius Soesanto","171003");
        gaji[] banyakPegawai;
        int jumPeg=Integer.parseInt(JOptionPane.showInputDialog(null,"Banyak data yang ingin di proses"));
        banyakPegawai=new gaji[jumPeg];
                for (int i = 0; i < banyakPegawai.length; i++) {
                    String nama=JOptionPane.showInputDialog(null,"Masukan nama data ke "+(i+1));
                    String gol=JOptionPane.showInputDialog(null, "Masaukan Golongan anda dengan menulis 'gol1/2/3'");
                    String npp=JOptionPane.showInputDialog(null, "Masukan NPP anda");
                    String status=JOptionPane.showInputDialog(null, "Masukan status anda saat ini");
                    int jumAnak=0;
                    if(status.equalsIgnoreCase("menikah")){
                        jumAnak=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan jumlah anak"));
                    }
                    banyakPegawai[i]=new gaji();
                    banyakPegawai[i].setNama(nama);
                    banyakPegawai[i].setGolongan(gol);
                    banyakPegawai[i].setJumlahAnak(jumAnak);
                    banyakPegawai[i].setNPP(npp);
                    banyakPegawai[i].setStatus(status);
                }
                System.out.println("==========================================================================================================");
                System.out.println("NPP     Nama        Golongan        status      Jumlah Anak     Gaji pokok      Tunjangan       | Total");
                System.out.println("__________________________________________________________________________________________________________");
                for (int i = 0; i <= banyakPegawai.length-1; i++) {
                    System.out.println(banyakPegawai[i].getNPP()+"      "+banyakPegawai[i].getNama()+"      "+banyakPegawai[i].getGolongan()+"          "+banyakPegawai[i].getStatus()+"            "+banyakPegawai[i].getJumlahAnak()+"            "+banyakPegawai[i].hitungGajiPokok()+"          "+banyakPegawai[i].hitungTunjanganKeluarga()+"          "+banyakPegawai[i].gajiTotal());
                }
                int max=0,min=0,jumlah=0;
                for (int i = 0; i < banyakPegawai.length; i++) {
                    max=banyakPegawai[0].hitungGajiPokok();
                    min=banyakPegawai[0].hitungGajiPokok();
                    if(max<banyakPegawai[i].hitungGajiPokok()){
                        max=banyakPegawai[i].hitungGajiPokok();
                    }else if(min>banyakPegawai[i+1].hitungGajiPokok()){
                        min=banyakPegawai[i].hitungGajiPokok();
                    }
                    jumlah+=banyakPegawai[i].hitungGajiPokok();
                }
                System.out.println("Gaji pokok tertinggi    : "+max);
                System.out.println("Gaji pokok terendah     : "+min);
                System.out.println("Rata rata gaji pokok    : "+(jumlah/jumPeg));
            }  
}

// String cari=JOptionPane.showInputDialog(null,"Masukan nama untuk melihat data  ");
//                 for (int i = 0; i < banyakPegawai.length; i++) {
//                     if(cari.equals(banyakPegawai[i].getNama())){
//                         System.out.println("Nama        : "+banyakPegawai[i].getNama());
//                         System.out.println("NPP         : "+banyakPegawai[i].getNPP());
//                         System.out.println("Golongan    : "+banyakPegawai[i].getGolongan());
//                         System.out.println("Status      : "+banyakPegawai[i].getStatus());
//                         System.out.println("Jumlah Anak : "+banyakPegawai[i].getJumlahAnak());
//                         System.out.println("Gaji pokok  : "+banyakPegawai[i].hitungGajiPokok());
//                         System.out.println("Tunjangan   : "+banyakPegawai[i].hitungTunjanganKeluarga());
//                         System.out.println("Total gaji  : "+banyakPegawai[i].gajiTotal());
//                         break;
//                     }
//                 }
//                 String kluar=JOptionPane.showInputDialog(null,"kembali ke menu (ya/tidak)");
//                     if(kluar.equalsIgnoreCase("ya")){
//                         out=true;
//                     }else{
//                         out=false;
//                     }
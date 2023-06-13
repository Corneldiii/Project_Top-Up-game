package Modul_6;
import Modul_2.*;
import javax.swing.JOptionPane;
public class KelolaPerusahaan {
    public static void main(String[] args) {
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
                Perusahaan data=new Perusahaan("Maju Karya","JL.jalan sama kamu","Aldian Octavius Soesanto","171003");
                data.setDaftar(banyakPegawai);


                gaji baru=new gaji();
                baru.setNama("agus");
                baru.setNPP("56789");
                baru.setGolongan("gol2");
                baru.setStatus("menikah");
                baru.setJumlahAnak(4);
                data.addPegawai(jumPeg-1, baru);
                

                gaji[] tampung=data.getDaftar();
                System.out.println("==========================================================================================================");
                System.out.println("NPP     Nama        Golongan        status      Jumlah Anak     Gaji pokok      Tunjangan       | Total");
                System.out.println("__________________________________________________________________________________________________________");
                for (int i = 0; i < banyakPegawai.length; i++) {
                    System.out.println(tampung[i].getNPP()+"      "+tampung[i].getNama()+"      "+tampung[i].getGolongan()+"          "+tampung[i].getStatus()+"            "+tampung[i].getJumlahAnak()+"            "+tampung[i].hitungGajiPokok()+"          "+tampung[i].hitungTunjanganKeluarga()+"          "+tampung[i].gajiTotal());
                }
                System.out.println("Gaji pokok tertinggi    : "+data.cariTerbesar(tampung));
                System.out.println("Rata rata gaji pokok    : "+data.rataGaji(tampung));
                
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
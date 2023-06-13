package Modul_6;
import Modul_2.*;
public class Perusahaan {
    private String namaPerusahaan;
    private String alamat;
    private String pemilik;
    private String NPWP;
    private String daftarPegawai;
    private gaji[] daftar;

    public Perusahaan(String namaPerusahaan,String alamat,String pemilik,String NPWP){
        this.namaPerusahaan=namaPerusahaan;
        this.alamat=alamat;
        this.pemilik=pemilik;
        this.NPWP=NPWP;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getNPWP() {
        return NPWP;
    }

    

    public String getDaftarPegawai() {
        return daftarPegawai;
    }

    public void setDaftarPegawai(String daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }

    public gaji[] getDaftar() {
        return daftar;
    }

    public void setDaftar(gaji[] daftar) {
        this.daftar = daftar;
    }

    public void addPegawai(int n,gaji  x){
        this.daftar[n]=new gaji();
        this.daftar[n].setNama(x.getNama());
        this.daftar[n].setGolongan(x.getGolongan());
        this.daftar[n].setNPP(x.getNPP());
        this.daftar[n].setStatus(x.getStatus());
        this.daftar[n].setJumlahAnak(x.getJumlahAnak());
    }

    public int rataGaji(gaji[] x){
        int jumlah=0;
        for (int i = 0; i < x.length; i++) {
            jumlah+=x[i].hitungGajiPokok();
        }
        return jumlah/x.length;
    }

    public int cariTerbesar(gaji[] x){
        int max=0;
            for (int i = 0; i < x.length; i++) {
                max=x[0].hitungGajiPokok();
                if(max<x[i].hitungGajiPokok()){
                        max=x[i].hitungGajiPokok();
                }
            }
            return max;

    }

}

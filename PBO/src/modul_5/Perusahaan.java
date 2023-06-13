package modul_5;
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


}

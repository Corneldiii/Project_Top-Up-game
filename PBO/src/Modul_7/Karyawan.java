package Modul_7;

public class Karyawan {
    
    protected int npp;
    protected String nama;
    protected int jumlahAnak;
    static int subsidiPerAnak = 100000;
    public int getNpp() {
        return npp;
    }

    public void setNpp(int npp) {
        this.npp = npp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    public int tunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}

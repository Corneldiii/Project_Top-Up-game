package Modul_4;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String tglLahir;
    private double uts1,uts2,uas,hitung;
    

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double nilaiFinal(){
        return (0.3*uts1)+(0.3*uts2)+(0.4*uas);
    }

    public double getHitung() {
        return hitung;
    }

    public void setHitung(double hitung) {
        this.hitung = hitung;
    }
    
}

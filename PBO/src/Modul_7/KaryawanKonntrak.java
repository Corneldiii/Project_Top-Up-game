package Modul_7;

public class KaryawanKonntrak extends Karyawan {
    private int upahHarian;
    private int jumHari;
    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }
    public int getJumHari() {
        return jumHari;
    }
    public void setJumHari(int jumHari) {
        this.jumHari = jumHari;
    }
    public int upahTotal() {
        return (upahHarian * jumHari) + tunjanganAnak();
    }

}

package Modul_7;

public class KaryawanTetap extends Karyawan {
    private int gajiPokok;
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public int gajiTotal() {
        return gajiPokok + tunjanganAnak();
    }
}

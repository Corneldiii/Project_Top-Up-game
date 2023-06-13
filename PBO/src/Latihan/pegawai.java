package Latihan;

public abstract class pegawai implements Email {
    private int npp;// mendeklarasi variable bertipe int
    private String nama;// mendeklarasi variable bertipe String
    private double gajiPokok;// mendeklarasi variable dengan tipe double

    // pada line 9 hingga 31 digunkanan untuk method stter dan getter
    int getNpp() {
        return npp;
    }

    String getNama() {
        return nama;
    }

    double getGapok() {
        return gajiPokok;
    }

    void setNpp(int nopeg) {
        npp = nopeg;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setGapok(int upah) {
        gajiPokok = upah;
    }

    // pada line 33-36 membuat method bertipe abstrack yang akan diturunkan
    abstract String getStatus();

    abstract double getTunjangan();

    abstract double hitungGatot();

    public abstract void getEmail();

}

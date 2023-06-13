package presentasi;

public class Karyawan {
    // pada line ke 5 hingga 12 adalah deklarasi dari variavble yang bertipe
    // protected
    protected int npp;
    protected String nama;
    protected int jumlahAnak;
    protected int jabatan;
    protected int upahHarian;
    protected int jumHari;
    protected int gajiPokok;
    static int subsidiPerAnak = 100000;

    // pada line 16 hingga 66 berisi method yang digunakan untuk method setter dan
    // getter untuk setiap variable yang ada
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

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

    public int getJabatan() {
        return jabatan;
    }

    // method dibawah ini digunakan untuk menhitung tunjagan yang didabat
    public int tunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}

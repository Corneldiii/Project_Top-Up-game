package BelajarUTS;

public class DataPasien {
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private String gejala;

    DataPasien(String nama,String alamat,String tangalLahir){
        this.nama=nama;
        this.alamat=alamat;
        this.tanggalLahir=tangalLahir;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }
    
    
}

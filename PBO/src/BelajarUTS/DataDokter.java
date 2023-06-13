package BelajarUTS;

public class DataDokter {
    private String nama;
    private String alamat;
    private String kode;

    DataDokter(String nama,String alamat,String kode){
        this.nama=nama;
        this.alamat=alamat;
        this.kode=kode;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKode() {
        return kode;
    }

}

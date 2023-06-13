package Modul_6;

public class DataPengarang {
    private String nama;
    private String alamat;
    private String NIK;

    public DataPengarang(String nama,String alamat,String NIK){
        this.nama=nama;
        this.alamat=alamat;
        this.NIK=NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNIK() {
        return NIK;
    } 
}

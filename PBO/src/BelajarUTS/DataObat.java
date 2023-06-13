package BelajarUTS;

public class DataObat {
    private String nama;
    private int harga;
   
    DataObat(String nama,int harga){
        this.nama=nama;
        this.harga=harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
}

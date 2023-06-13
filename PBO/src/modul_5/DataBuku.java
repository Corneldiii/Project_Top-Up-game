package modul_5;

public class DataBuku {
    private String judul;
    private String kode;
    private String penerbit;
    private int tahunTerbit;
    private DataPengarang[] dataPengarang;

    DataBuku(){}

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public DataPengarang[] getDataPengarang() {
        return dataPengarang;
    }

    public void setDataPengarang(DataPengarang[] dataPengarang) {
        this.dataPengarang = dataPengarang;
    }
    
    
    
    
    
}

    


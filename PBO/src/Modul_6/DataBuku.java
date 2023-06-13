package Modul_6;

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
    
    public void addPengarang(int n,DataPengarang data){
        this.dataPengarang[n]=new DataPengarang(data.getNama(),data.getAlamat(),data.getNIK());
    }
    public void cariTahun(int tahun,DataBuku[] x){
        int max=x[0].getTahunTerbit(),min=x[0].getTahunTerbit();
        for (int i = 0; i < x.length; i++) {
            if(x[i].getTahunTerbit()==tahun){
                System.out.println("Daftar Buku pada tahun "+tahun+" : ");
                System.out.println((i+1)+"."+x[i].getJudul());
            }
            if(x[i].getTahunTerbit()>max){
                max=x[i].getTahunTerbit();
            }else if(x[i].getTahunTerbit()<min){
                min=x[i].getTahunTerbit();
            }
            
        }

        System.out.println("Buku yang memiliki tahun terbit terlama :"+min);
        System.out.println("Buku dengan tahun terbit terbaru    :  "+max);
    }

    
    
    
    
}

    


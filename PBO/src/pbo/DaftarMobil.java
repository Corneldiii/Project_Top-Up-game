package pbo;

public class DaftarMobil {
    private String warna,merk;
    private String pemilik;
    private String NPWP;
    
    public DaftarMobil(String warna,String merk){
        this.merk=merk;
        this.warna=warna;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }
    
    public String getWarna() {
        return warna;
    }

    public String getMerk() {
        return merk;
    }
}

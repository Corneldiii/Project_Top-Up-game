package pbo;

public class Dealer {
    private String namaDealer;
    private String alamat;
    private DaftarMobil[] dftr;

    public Dealer(String namaDealer,String alamat){
        this.namaDealer=namaDealer;
        this.alamat=alamat;
    }
    
    public String getNamaDealer() {
        return namaDealer;
    }
    public String getAlamat() {
        return alamat;
    }

    public DaftarMobil[] getDftr() {
        return dftr;
    }

    public void setDftr(DaftarMobil[] dftr) {
        this.dftr = dftr;
    }

    public void cetakMobil(DaftarMobil[] n){
        for(int i=0;i<n.length;i++){
            System.out.println("-"+n[i].getMerk());
        }
    }
    public void addMobil(int n,DaftarMobil data){
        this.dftr[n]=new DaftarMobil(data.getWarna(),data.getMerk());
        this.dftr[n].setNPWP(data.getNPWP());
        this.dftr[n].setPemilik(data.getPemilik());

    }
    public void cariAbu(DaftarMobil[] n){
        for(int i=0;i<n.length;i++){
            if(n[i].getWarna().equalsIgnoreCase("abu abu")){
                System.out.println("Merk    : "+n[i].getMerk());
                System.out.println("Warna     : "+n[i].getWarna());
            }
        }

    }
    public int hitungWarna(DaftarMobil[] n,String warna){
        int index=0;
        for (int i = 0; i < n.length; i++) {
            if(n[i].getWarna().equalsIgnoreCase(warna)){
                index++;
            }
        }
        return index ;
    }
}

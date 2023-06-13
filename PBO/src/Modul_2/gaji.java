package Modul_2;

public class gaji {
    private String nama,golongan,status,NPP;
    private int jumlahAnak;


    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNPP() {
        return NPP;
    }

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int hitungGajiPokok(){
        switch(golongan){
            case "gol1":
                return 1300000;
            case "gol2":
                return 1750000;
            case "gol3":
                return 2000000;
            default:
                break;
        }
        return 0;
    }
    public int hitungTunjanganKeluarga(){
        if(status.equalsIgnoreCase("menikah")){
            return 300000+(jumlahAnak*100000);
        }
        return 0;
    }

    public int gajiTotal(){
        return hitungGajiPokok()+hitungTunjanganKeluarga();
    }
}

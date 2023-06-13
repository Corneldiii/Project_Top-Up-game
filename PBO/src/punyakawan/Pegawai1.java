/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;

/**
 *
 * @author ACER
 */
public class Pegawai1 {
    private String NPP , nama , golongan , status ;
    private int jumlahAnak;   
    
    public String getNPP() {
        return NPP;
    }

    public void setNPP(String nPP) {
        NPP = nPP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int hitungGajiPokok(){
        switch(golongan){
            case"golongan1":
                return 1300000;
            case"golongan2":
                return 1750000;
            case"golongan3":
                return 2000000;
            default:
                break;
        }
        return 0;
    }

    public int tunjanganKeluarga(){
       if(status.equalsIgnoreCase("menikah")){
           return 300000+(jumlahAnak*100000);
       }
       return 0;
    }

    public int hitungGajiTotal(){
        return hitungGajiPokok()+tunjanganKeluarga();
    }
}




   
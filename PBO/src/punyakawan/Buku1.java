/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;

/**
 *
 * @author ACER
 */
public class Buku1 {

    /**
     * @param args the command line arguments
     */
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private String penerbit;
    private DaftarPengarang[]daftarPengarang;
    
    Buku1(){}
    
    public String getKodeBuku(){
        return kodeBuku;
    }
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku =kodeBuku;
    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public DaftarPengarang[] getDaftarPengarang(){
        return daftarPengarang;
    }
    public void setDaftarPengarang(DaftarPengarang []daftarPengarang){
        this.daftarPengarang =daftarPengarang;
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otakatik;

/**
 *
 * @author LENOVO
 */
public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private String namaPengarang;

   Buku(){}
   
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
       this.judul =judul;
   }
   public int getTahunTerbit(){
       return tahunTerbit;
   }
   public void setTahunTerbit(int tahunTerbit){
       this.tahunTerbit = tahunTerbit;
   }
   public String getNamaPengarang(){
       return namaPengarang;
   }
   public void setNamaPengarang(String namaPengarang){
       this.namaPengarang = namaPengarang;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punyakawan;

/**
 *
 * @author USER
 */
public class Buku {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;
    private String namaPengarang;
    private DataPengarang[] dataPengarang;
    

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
   public DataPengarang[] getDataPengarang(){
       return dataPengarang;
   }
   public void setDataPengarang(DataPengarang[] dataPengarang){
       this.dataPengarang =dataPengarang;
   }
   public void tambahPengarang(int n,DataPengarang data) {
        this.dataPengarang[n]=new DataPengarang (data.getNama(),data.getAlamat(),data.getNIK());
   }
   public void cariTahun(int tahun,Buku[] x){
       int max=x[0].getTahunTerbit(),min=x[0].getTahunTerbit();
       for (int i = 0; i < x.length; i++) {
           if(x[i].getTahunTerbit()==tahun){
               System.out.println("Daftar buku pada tahun "+tahun+" : ");
               System.out.println((i+1)+"."+x[i].getJudul());
           }
           if(x[i].getTahunTerbit()>max){
               max=x[i].getTahunTerbit();
           }else if(x[i].getTahunTerbit()<min){
               min=x[i].getTahunTerbit();
           } 
       }
       System.out.println("Buku tahun terbit terlama : "+min);
       System.out.println("Buku tahun terbit terbaru : "+max);
   }
    
}

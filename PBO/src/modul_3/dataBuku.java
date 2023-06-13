/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

/**
 *
 * @author LENOVO
 */
public class dataBuku {
    private penerbit dataPenerbit;
    private String judul,pengarang;
    private int tahunTerbit;
    
    public dataBuku(String judul,String pengarang,penerbit dataPenerbit,int tahunTerbit){
        this.judul=judul;
        this.pengarang=pengarang;
        this.tahunTerbit=tahunTerbit;
        this.dataPenerbit=dataPenerbit;
    }

    public String getJudul() {
        return judul;
    }

    public penerbit getDataPenerbit() {
        return dataPenerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    public String baruLama(){
        int selisih=2023-tahunTerbit;
        if(selisih<=5){
            return "BUKU BARU";
        }
        return "BUKU LAMA";
    }
    
}

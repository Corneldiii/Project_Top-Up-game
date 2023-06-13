/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;

import Modul_2.*;

/**
 *
 * @author ACER
 */
public class Perusahaan {

    /**
     * @param args the command line arguments
     */
    private String namaPerusahaan;
    private String alamat;
    private String pemilik;
    private String npwp;
    private String daftarPegawai;
    private Pegawai1[] daftar;
            
    
    public Perusahaan(String namaPerusahaan,String alamat,String pemilik,String npwp){
     this.namaPerusahaan= namaPerusahaan;
     this.alamat = alamat;
     this.pemilik = pemilik;
     this.pemilik = pemilik;
    }
    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getPemilik(){
        return pemilik;
    }
    public String getNpwp(){
        return npwp;
    }
    public String getDaftarPegawai(){
        return daftarPegawai;
    }
    public Pegawai1[] getDaftar() {
        return daftar;
    }
    public void setDaftar(Pegawai1[] daftar) {
        this.daftar = daftar;
    }
    

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakawan;

/**
 *
 * @author ACER
 */
public class DaftarPengarang {

    private String nik;
    private String nama;
    private String alamat;
    
    public DaftarPengarang(String nama,String alamat,String nik){
        this.nama=nama;
        this.alamat=alamat;
        this.nik=nik;
    }
    
    public String getNik(){
        return nik;
    
    
    }
    public String getNama(){
        return nama;
    
    
    }
    public String getAlamat(){
        return alamat;
    
   
    }
    
}

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
public class DataPengarang {
    private String nama;
    private String alamat;
    private String NIK;
    
    DataPengarang(String nama,String alamat,String NIK){
        this.nama=nama;
        this.alamat=alamat;
        this.NIK=NIK;
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNIK(){
        return NIK;
    }
    
}

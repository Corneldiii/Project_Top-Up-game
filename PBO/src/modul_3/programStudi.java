/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

/**
 *
 * @author LENOVO
 */
public class programStudi {
    private String kode_prodi;
    private String nama_prodi;
    private Pegawai ketua_prodi;
    
    public programStudi(String kode_prodi,String nama_prodi){
        this.kode_prodi=kode_prodi;
        this.nama_prodi=nama_prodi;
    }

    public String getKode_prodi() {
        return kode_prodi;
    }

    public String getNama_prodi() {
        return nama_prodi;
    }

    public Pegawai getKetua_prodi() {
        return ketua_prodi;
    }

    public void setKetua_prodi(Pegawai ketua_prodi) {
        this.ketua_prodi = ketua_prodi;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class mainProdi {
    public static void main(String[] args) {
        Pegawai data1=new Pegawai("123234","Algojo");
        data1.setGelar("s.Kom");
        data1.setEmail("abahGamer123@gmail.com");
        
        programStudi ketua=new programStudi("1232","informatika");
        ketua.setKetua_prodi(data1);
        Pegawai kepala=ketua.getKetua_prodi();
        String nama=kepala.getNama();
        
        JOptionPane.showMessageDialog(null,"kode prodi : "+ketua.getKode_prodi()+""+"\nNama Prodi : "+ketua.getNama_prodi()+"\nDiketuai oleh : "+nama);
        
    }
}

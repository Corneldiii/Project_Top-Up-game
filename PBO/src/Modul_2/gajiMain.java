/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class gajiMain {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        
        gaji orang=new gaji();
        
        System.out.print("nama : ");
        String name=tampung.next();
        orang.setNama(name);
        System.out.print("Masukan NPP : ");
        String npp=tampung.nextLine();
        orang.setNPP(npp);
        System.out.print("Golongan : ");
        String gol=tampung.next();
        orang.setGolongan(gol);
        System.out.print("Status : ");
        String status=tampung.next();
        orang.setStatus(status);
        if(status.equalsIgnoreCase("menikah")){
            System.out.print("Jumlah anak : ");
            int anak=tampung.nextInt();
            orang.setJumlahAnak(anak);
        }
        
        System.out.println("Gaji pokok anda : "+orang.hitungGajiPokok());
        System.out.println("Tunjangan keluarga : "+orang.hitungTunjanganKeluarga());
        System.out.println("Gaji total : "+orang.gajiTotal());
    }
}

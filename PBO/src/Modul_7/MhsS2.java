package Modul_7;

import Modul_4.Mahasiswa;

public class MhsS2 extends Mahasiswa{// meminta turunan pada class Mahasiswa dengan perintah extends
    // method dibawah saya gunakan untuk menentukan Nilai final apa yang didapat
    // dengan memanggil nama dari method saja
    // pada method ini saya menggunakan String untuk tipe balikannya
    public String skorFinal(){
        double hitung=super.nilaiFinal();// menyipan hasil dari pemanggilan method turunan dari induk dengan perintah
                                         // super untuk perbadingan
        if(hitung>= 85){
            return "A";
        }else if(70<=hitung && hitung<85){
            return "B";
        }else if(56<=hitung && hitung<70){
            return "C";
        }else if(45<=hitung && hitung<56){
            return "D";
        }else if(hitung<45){
            return "E";
        }

        return "error";
    }
}

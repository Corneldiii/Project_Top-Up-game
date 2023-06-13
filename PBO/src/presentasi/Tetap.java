package presentasi;

public class Tetap extends Karyawan {//meminta turunnan dari subclass Karyawan dengan menggunakan perintah extends
    //method ini berfungsi untuk menghitung gaji yang sudah didapat
    public int getJabatan(){
        return gajiPokok + tunjanganAnak();
    }
}

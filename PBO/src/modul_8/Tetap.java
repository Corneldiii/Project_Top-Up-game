package modul_8;

public class Tetap extends Karyawan {//meminta akses kepasa subclass
    //membuat method dengan nama getJabatan yang sesuai dengan subClass 
    //untuk menghitung upah total
    public int getJabatan(){
        return gajiPokok + tunjanganAnak();
    }
}

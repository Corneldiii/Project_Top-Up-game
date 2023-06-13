package modul_8;

public class Kontrak extends Karyawan {//meminta akses ke subclass
    //membuat method dengan nama getJabatan yang sesuai dengan subClass 
    //untuk menghitung upah total
    public int getJabatan(){
        return (upahHarian * jumHari) + tunjanganAnak();
    }
}

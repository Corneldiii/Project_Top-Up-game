package presentasi;

public class Kontrak extends Karyawan {// Program ini merupakan subclass Kontrak yang meng-extend class Karyawan
    public int getJabatan() {// memiliki method getJabatan yang mengembalikan nilai total gaji dari seorang
                             // karyawan kontrak
        return (upahHarian * jumHari) + tunjanganAnak();// Total gaji dihitung dari perkalian upah harian dengan jumlah
                                                        // hari kerja, ditambah dengan tunjangan anak yang didapatkan
                                                        // dari method tunjanganAnak yang diwarisi dari class Karyawan
    }
}

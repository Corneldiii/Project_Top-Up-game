/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package presentasi;

/**
 *
 * @author ACER
 */
public class Mahasiswa1 {
    // Deklarasi kelas Mahasiswa dengan beberapa atribut dan metode
    protected String nim;// atribut nim dengan tipe data String dan akses modifier protected
    protected String nama;// atribut nama dengan tipe data String dan akses modifier protected
    protected String tglLahir;// atribut tglLahir dengan tipe data String dan akses modifier protected
    protected String courseGrade;// atribut courseGrade dengan tipe data String dan akses modifier protected
    protected double uts1, uts2, uas;// atribut uts1, uts2, dan uas dengan tipe data double dan akses modifier
                                     // protected

    public String getNim() {// metode getNim untuk mengembalikan nilai atribut nim
        return nim;
    }

    public void setNim(String nim) {// metode setNim untuk mengisi nilai atribut nim
        this.nim = nim;
    }

    public String getNama() {// metode getNama untuk mengembalikan nilai atribut nama
        return nama;
    }

    public void setNama(String nama) {// metode setNama untuk mengisi nilai atribut nama
        this.nama = nama;
    }

    public String getTglLahir() {// metode getTglLahir untuk mengembalikan nilai atribut tglLahir
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {// metode setTglLahir untuk mengisi nilai atribut tglLahir
        this.tglLahir = tglLahir;
    }

    public double getUts1() {// metode getUts1 untuk mengembalikan nilai atribut uts1
        return uts1;
    }

    public void setUts1(double uts1) {// metode setUts1 untuk mengisi nilai atribut uts1
        this.uts1 = uts1;
    }

    public double getUts2() {// metode getUts2 untuk mengembalikan nilai atribut uts2
        return uts2;
    }

    public void setUts2(double uts2) { // metode setUts2 untuk mengisi nilai atribut uts2
        this.uts2 = uts2;
    }

    public double getUas() { // metode getUas untuk mengembalikan nilai atribut uas
        return uas;
    }

    public void setUas(double uas) {// metode setUas untuk mengisi nilai atribut uas
        this.uas = uas;
    }

    public double nilaiFinal() {// metode nilaiFinal untuk menghitung nilai akhir mahasiswa berdasarkan bobot
                                // nilai
        return (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
    }

    public String getCourseGrade() {// metode getCourseGrade untuk mengembalikan nilai atribut courseGrade
        return courseGrade;
    }
}

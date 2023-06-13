package modul_8;

public class Mahasiswa1{
    //pada line 5 hingga 9 saya gunakan untuk deklarasi variable 
    //dengan modifier protected
    protected String nim;
    protected String nama;
    protected String tglLahir;
    protected String courseGrade;
    protected double uts1,uts2,uas;

    //pada line 12 hingga 58 saya gunakan untuk perintah setter dan getter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    //method dibawah ini saya fungsikan sebagai penghitung nilai final
    public double nilaiFinal(){
        return (0.3*uts1)+(0.3*uts2)+(0.4*uas);
    }
    //method dibawah ini merupakan method yang diturunkan ke class anak
    public String getCourseGrade() {
        return courseGrade;
    }

    
    
}

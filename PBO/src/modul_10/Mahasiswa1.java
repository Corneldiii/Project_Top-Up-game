package modul_10;

public class Mahasiswa1 implements Leaner {
    // pad aline 4 hingga 8 mendeklarasi variabe yang diperlukan
    protected final static int NUM_OF_TESTS = 3;
    protected String name;
    protected int nim;
    protected double[] test;
    protected String courseGrade;

    public Mahasiswa1(String studentName) {// membuat construktor kelas Mahasiswa1 dengan paramater
        name = studentName;
        test = new double[NUM_OF_TESTS];
        courseGrade = "****";
    }

    // pada line 17 hingga line 30 digunakan untuk setter dan getter
    public void setName(String name) {
        this.name = name;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    // membuat construktor tanpa parameter
    public Mahasiswa1() {
        this("NO NAME");
    }

    // methhod yang difungsikan sebagai penghitung nnilai final
    public double nilaiFinal() {
        return (0.3 * test[0]) + (0.3 * test[1]) + (0.4 * test[2]);
    }

    // mengerjakan method yang diimplementasikan dengn interface
    @Override // mengerjakan method dibawah ini terlebih dahulu jika di subclass ada
    public String getCourseGrade() {
        return courseGrade;
    }

}

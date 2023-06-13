package modul_10;

public class S1 extends Mahasiswa1 {
    // method yang sama dengan method yang ada di superclass yang berisi algoritma
    // untuk menentukan nilai
    public String getCourseGrade() {
        double hitung = super.nilaiFinal();
        if (hitung >= 80) {
            courseGrade = "A";
        } else if (70 <= hitung && hitung < 80) {
            courseGrade = "B";
        } else if (56 <= hitung && hitung < 70) {
            courseGrade = "C";
        } else if (45 <= hitung && hitung < 56) {
            courseGrade = "D";
        } else if (hitung < 45) {
            courseGrade = "E";
        }

        return courseGrade;
    }

}

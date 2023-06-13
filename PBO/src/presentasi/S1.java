package presentasi;

public class S1 extends Mahasiswa1 {

    public String getCourseGrade() {// Metode untuk mengambil nilai akhir mahasiswa dan mengembalikan grade
        double hitung = super.nilaiFinal();// Menghitung nilai akhir mahasiswa menggunakan metode nilaiFinal() dari
                                           // kelas induk
        if (hitung >= 80) {// Jika nilai akhir >= 80, kembalikan grade A
            return "A";
        } else if (70 <= hitung && hitung < 80) {// Jika nilai akhir >= 70 dan < 80, kembalikan grade B
            return "B";
        } else if (56 <= hitung && hitung < 70) {// Jika nilai akhir >= 56 dan < 70, kembalikan grade C
            return "C";
        } else if (45 <= hitung && hitung < 56) {// Jika nilai akhir >= 45 dan < 56, kembalikan grade D
            return "D";
        } else if (hitung < 45) { // Jika nilai akhir < 45, kembalikan grade E
            return "E";
        }

        return "error"; // Jika tidak memenuhi syarat di atas, kembalikan error
    }

}

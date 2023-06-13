package presentasi;

public class S2 extends Mahasiswa1 {// Mendefinisikan kelas S2 yang merupakan turunan dari kelas Mahasiswa1
    public String getCourseGrade() { // Mendefinisikan metode untuk mendapatkan nilai huruf dari kursus
        double hitung = super.nilaiFinal();// Menghitung nilai final menggunakan metode nilaiFinal yang diperoleh dari
                                           // superclass Mahasiswa1
        if (hitung >= 85) {// Memeriksa apakah nilai final lebih besar atau sama dengan 85, jika ya, maka
                           // nilai huruf adalah A
            return "A";
        } else if (70 <= hitung && hitung < 85) {// Jika nilai final berada di antara 70 dan 85, maka nilai huruf adalah
                                                 // B
            return "B";
        } else if (56 <= hitung && hitung < 70) {// Jika nilai final berada di antara 56 dan 70, maka nilai huruf adalah
                                                 // C
            return "C";
        } else if (45 <= hitung && hitung < 56) {// Jika nilai final berada di antara 45 dan 56, maka nilai huruf adalah
                                                 // D
            return "D";
        } else if (hitung < 45) {// Jika nilai final kurang dari 45, maka nilai huruf adalah E
            return "E";
        }

        return "error";// Jika terjadi kesalahan, maka metode akan mengembalikan "error"
    }
}

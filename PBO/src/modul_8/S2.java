package modul_8;

public class S2 extends Mahasiswa1 {
    public String getCourseGrade(){
        double hitung=super.nilaiFinal();
        if(hitung>= 85){
            return "A";
        }else if(70<=hitung && hitung<85){
            return "B";
        }else if(56<=hitung && hitung<70){
            return "C";
        }else if(45<=hitung && hitung<56){
            return "D";
        }else if(hitung<45){
            return "E";
        }

        return "error";
    }
}

package Project;

public class Logistic implements Comparable {
    private String nama;
    private int tanggal;

    public Logistic() {
    }

    Logistic(String nama, int tanggal) {
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public int getTanggal() {
        return tanggal;
    }

    @Override
    public int compareTo(Object a) {
        if(this.getTanggal()==((Logistic)a).getTanggal()){
            return 0;
        }else if(this.getTanggal()>((Logistic)a).getTanggal()){
            return 1;
        }else{
            return -1;
        }
    }

    
}

package per_3;

public class Mahasiswa implements Comparable {
    private int nim;
    private String nama;

    public Mahasiswa(int nim,String nama){
        this.nim=nim;
        this.nama=nama;
    }

    

    public String toString(){
        System.out.println("");
        return nama+" ["+ nim +"]";
    }

    @Override
    public int compareTo(Object a) {
        if(this.getNim()==((Mahasiswa)a).getNim()){
            return 0;
        }else if(this.getNim()>((Mahasiswa)a).getNim()){
            return 1;
        }else{
            return -1;
        }
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}

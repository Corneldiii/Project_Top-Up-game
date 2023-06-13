package UTS1_225314023;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private String jenjangAkreditas;
    private int jumlahMahasisiwa;

    Prodi(String kodeProdi,String namaProdi){
        this.kodeProdi=kodeProdi;
        this.namaProdi=namaProdi;
    }
    

    public String getKodeProdi() {
        return kodeProdi;
    }


    public String getNamaProdi() {
        return namaProdi;
    }


    public String getJenjangAkreditas() {
        return jenjangAkreditas;
    }

    public void setJenjangAkreditas(String jenjangAkreditas) {
        this.jenjangAkreditas = jenjangAkreditas;
    }

    public int getJumlahMahasisiwa() {
        return jumlahMahasisiwa;
    }

    public void setJumlahMahasisiwa(int jumlahMahasisiwa) {
        this.jumlahMahasisiwa = jumlahMahasisiwa;
    }
    
}

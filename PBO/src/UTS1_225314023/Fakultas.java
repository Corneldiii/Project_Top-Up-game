package UTS1_225314023;

public class Fakultas {
    private String kodeFakultas;
    private String namaFakultas;
    private Prodi[] daftarProdi;

    Fakultas(String kodeFakultas,String namaFakultas){
        this.kodeFakultas=kodeFakultas;
        this.namaFakultas=namaFakultas;
    }
    

    public String getKodeFakultas() {
        return kodeFakultas;
    }


    public void setKodeFakultas(String kodeFakultas) {
        this.kodeFakultas = kodeFakultas;
    }


    public String getNamaFakultas() {
        return namaFakultas;
    }


    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }


    public Prodi[] getDaftarProdi() {
        return daftarProdi;
    }

    public void setDaftarProdi(Prodi[] daftarProdi) {
        this.daftarProdi = daftarProdi;
    }

    public void cariProdi(Prodi[] x,String cari){
        for (int i = 0; i < x.length; i++) {
            if(x[i].getJenjangAkreditas().equalsIgnoreCase(cari)){
                System.out.println(x[i].getKodeProdi()+"            "+x[i].getNamaProdi()+"     "+x[i].getJenjangAkreditas()+"  "+x[i].getJumlahMahasisiwa());
            }
        }
    }

    public double rataRata(Prodi[] x){
        double jumlah=0;
        for (int i = 0; i < x.length; i++) {
            jumlah+=x[i].getJumlahMahasisiwa();
        }
        return jumlah/x.length;
    }
    
}

package BelajarUTS;

public class Resep {
    private DataDokter[] datDok;
    private DataObat[] datOb;
    private Resep[] resep;
    private DataPasien[] datPas;

    public DataDokter[] getDatDok() {
        return datDok;
    }
    public void setDatDok(DataDokter[] datDok) {
        this.datDok = datDok;
    }
    public DataObat[] getDatOb() {
        return datOb;
    }
    public void setDatOb(DataObat[] datOb) {
        this.datOb = datOb;
    }
    public Resep[] getResep() {
        return resep;
    }
    public void setResep(Resep[] resep) {
        this.resep = resep;
    }
    public DataPasien[] getDatPas() {
        return datPas;
    }
    public void setDatPas(DataPasien[] datPas) {
        this.datPas = datPas;
    }
    
    public int hargaTotal(){
        int jumlah=0;
        for (int i = 0; i < datOb.length; i++) {
            jumlah+=datOb[i].getHarga();
        }
        return jumlah;
    }

    public void maxMin(){
        int max=datOb[0].getHarga(),min=datOb[0].getHarga();
        for (int i = 0; i < datOb.length; i++) {
            if(datOb[i].getHarga()>max){
                max=datOb[i].getHarga();
            }else if(datOb[i].getHarga()<min){
                min=datOb[i].getHarga();
            }
        }
        System.out.println("Hargo obat termahal : "+max);
        System.out.println("Harga obat termurah : "+min);
    }

    public String penyakit(String x){
        if(x.equalsIgnoreCase("hidung tersumbat")){
            System.out.println("Dugaan penyakit : Pilek/Flu");
            System.out.println("Obat    : "+datOb[0].getNama());
        }else if(x.equalsIgnoreCase("Suhu tubuh tinggi")){
            System.out.println("Dugaan penyakit : Demam");
            System.out.println("Obat    : "+datOb[1].getNama());
        }else if(x.equalsIgnoreCase("Batuk riak")){
            System.out.println("Dugaan penyakit : Batuk Berdahakk");
            System.out.println("Obat    : "+datOb[2].getNama());
        }
        return "Not Found";
    }
    


}

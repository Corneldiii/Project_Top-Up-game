package modul_9;

public class manajer extends pegawai {
    private double tunjanganJabatan,lemburan;//mendeklarasi variable dengan tipe double 

    //pada line 7 hingga 21 digunakan untuk setter dan getter
    double getTunJab(){
        return tunjanganJabatan;
    }

    double getLembur(){
        return lemburan;
    }

    void setTunJab(double honJab){
        tunjanganJabatan=honJab;
    }

    void setLembur(double overtime){
        lemburan=overtime;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungGatot(){
        return getGapok()+tunjanganJabatan+lemburan;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double getTunjangan(){
        return tunjanganJabatan+lemburan;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    String getStatus(){return "Manajer";}
}

package modul_9;

public class Pemasaran extends pegawai {
    private double bonus;//mendeklarasi variable dengan tipe double 

    //pad aline 7 hingga 13 dingukanan untuk setter dan getter
    double getBonus(){
        return bonus;
    }

    void setBonus(double bonus){
        this.bonus=bonus;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungGatot(){
        return getGapok()+bonus;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double getTunjangan(){
        return bonus;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    String getStatus(){return "Pemasaran";}
}

package modul_9;

public class Honorer extends pegawai {
    private double lembur;//mendeklarasi variable lembur bertipe double dengan sifat private

    //pada line 7 hingga 12 digunakan unutk method setter dan getter
    double getLembur(){
        return lembur;
    }
    void setLembur(double lembur){
        this.lembur=lembur;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada
             // class induk
    double hitungGatot(){//menggatin isi method hitungGatot yang sudah di override
        return getGapok()+lembur;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada
             // class induk
    double getTunjangan(){//mengganti isi method getTunjangan yang sudah di override
        return lembur;
    }
    @Override // menandakan bahwa method dibawahnya akan menggantikan method yang sama pada
              // class induk
    String getStatus(){return "Honorer";}//mengganti isi method getStatus yang sudah di override 
}

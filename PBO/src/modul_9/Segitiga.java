package modul_9;

public class Segitiga extends BangunDatar{
    private double sisi1,sisi2,sisi3;//mendeklarasi variable dengan tipe double 
    //construktor dibawah ini saya gunkanan untuk memasukan nilaai kedalam variable diatas
    Segitiga(double sisi1,double sisi2,double sisi3){
        this.sisi1=sisi1;
        this.sisi2=sisi2;
        this.sisi3=sisi3;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungKeliling(){//mengantti isi method hitungKeliling yang sudah di override
        return sisi1+sisi2+sisi3;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungLuas(){//mengganti isi method hitungLuas yang sduah di ovesrride
        double s=hitungKeliling()/2;
        double luas=Math.sqrt(s*(s-sisi1)*(s-sisi2)*(s-sisi3));
        return Math.round(luas);
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    String getJenis(){//mengganti isi method getJenis yang sudah di override
        return "Segitiga";
    }
}

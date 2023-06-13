package modul_9;

public class SegiEmpat extends BangunDatar {
    private double panjang,lebar;//mendeklarasi variable dengan tipe double 
    //construktor dibawah ini saya gunkanan untuk memasukan nilaai kedalam variable diatas
    SegiEmpat(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungKeliling(){//mengantti isi method hitungKeliling yang sudah di override
        return (panjang*2)+(lebar*2);
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungLuas(){//mengganti isi method hitungLuas yang sduah di override
        return panjang*lebar;
    }
    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    String getJenis(){//mengganti isi method getJenis yang sudah di override
        return "Segi empat";
    }
}

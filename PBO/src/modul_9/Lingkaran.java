package modul_9;

public class Lingkaran extends BangunDatar{
    private double jari;//mendeklarasi variable dengan tipe double 
    //construktor dibawah ini saya gunkanan untuk memasukan nilaai kedalam variable diatas
    Lingkaran(double jari){
        this.jari=jari;
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungKeliling(){//mengantti isi method hitungKeliling yang sudah di override
        return Math.round(2*Math.PI*jari);
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    double hitungLuas(){//mengganti isi method hitungLuas yang sduah di override
        return Math.round(Math.PI*Math.pow(2, jari));
    }

    @Override// menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    String getJenis(){//mengganti isi method getJenis yang sudah di override
        return "Lingkaran";
    }
}

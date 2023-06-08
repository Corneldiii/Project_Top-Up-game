package project;

public class Dana extends TopUp{
    private double DiscDn;

    @Override
    public double HitungPajak(double hitungTotal){
        return 0.05*hitungTotal;
    }

    public double getDiscDn() {
        return DiscDn;
    }

    public void setDiscDn(double discDn) {
        DiscDn = discDn;
    }

    @Override
    public String getCode(){
        for (int i = 0; i < 6; i++) {
            code += (int)(Math.random()*10) + "";
        }
        return code+="DN";
    }

    public double DiscDn(double hitungTotal){
        double TotDisc=0;
        if(hitungTotal<50000){
            setDiscDn(0.05);
            TotDisc= hitungTotal*0.05;
        }else if(hitungTotal<=100000){
            setDiscDn(0.1);
            TotDisc= hitungTotal*0.1;
        }else if(hitungTotal>100000){
            setDiscDn(0.15);
            TotDisc= hitungTotal*0.15;
        }
        System.out.println("Selamat anda mendapatkan voucer Discount "+getDiscDn()*100+" % !!!!");
        System.out.println("Otomatis digunakan pada pembelian selanjutnya!!");
        return TotDisc;
    }

    
}

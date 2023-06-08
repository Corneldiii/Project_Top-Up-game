package project;

public class Indomart extends TopUp{
    private int IndoPoint=0;

    

    @Override
    public double HitungPajak(double hitungTotal){
        return 0.03*hitungTotal;
    }
    @Override
    public String getCode(){
        for (int i = 0; i < 6; i++) {
            code += (int)(Math.random()*10)+ "";
        }
        return code+="ID";
    }

    public void IdPoint(double hitungTotal){
        if(hitungTotal<=50000){
            IndoPoint+=500;
        }else if(hitungTotal<=100000){
            IndoPoint+=5000;
        }else if(hitungTotal<=250000){
            IndoPoint+=10000;
        }else if(hitungTotal>250000){
            IndoPoint+=15000;
        }

        System.out.println("Selamat anda memperoleh "+IndoPoint+" Indomart Point");
        System.out.println("Kumpulkan lebih banyak lagi untuk memperoleh untuk potongan harga!!!!");
    }

    public int getIndoPoint() {
        return IndoPoint;
    }

    public void setIndoPoint(int indoPoint) {
        IndoPoint = indoPoint;
    }
    
}

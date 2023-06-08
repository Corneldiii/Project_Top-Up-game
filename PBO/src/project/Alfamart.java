package project;

public class Alfamart extends TopUp{
private int alfaPoint=0;

    @Override
    public double HitungPajak(double hitungTotal){
        if(alfaPoint==100){
            alfaPoint=0;
            return hitungTotal;
        }
        return 0.04*hitungTotal;
    }
    
    @Override
    public String getCode(){
        for (int i = 0; i < 6; i++) {
            code += (int)(Math.random()*10) + "";
        }
        return code+="AL";
    }

    public void AlfaPoint(double total){
        if(total<50000){
            alfaPoint+=5;
        }else if(total<=100000){
            alfaPoint+=25;
        }else if(total>100000){
            alfaPoint+=50;
        }

        System.out.println("Selamat anda memperoleh "+alfaPoint+" Point");
        System.out.println("Kumpulkan "+(100-alfaPoint)+" lagi untuk memperoleh GRATIS PAJAK!!!");
    }
    public int getAlfaPoint() {
        return alfaPoint;
    }

    
}

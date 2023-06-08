package project;

public class TransferBank extends TopUp{

    @Override
    public double HitungPajak(double hitungTotal){
        return 0.05*hitungTotal;
    }

    @Override
    public String getCode(){
        for (int i = 0; i < 6; i++) {
            code += (int)(Math.random()*10) + "";
        }
        return code+="TB";
    }
}

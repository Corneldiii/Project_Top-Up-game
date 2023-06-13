package UTS1_225314023;

import project.TopUp;

public abstract class Bayar extends TopUp{
    private double total;
    protected final int[] code=new int[6];
    protected String Code;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String userName(){
        return null;
    }

    @Override
    public String getId(){
        return null;
    }
    @Override
    public double hitungTotal(){
        return 0;
    }
    
    public String getGame(){
        return null;
    }

    abstract double HitungPajak();

    
}

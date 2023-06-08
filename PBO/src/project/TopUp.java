package project;

abstract class TopUp implements interFc {
    protected String code="";

    abstract public double HitungPajak(double total);

    public String getCode(){
        return code;
    }

}

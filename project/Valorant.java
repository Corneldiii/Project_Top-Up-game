package project;

public class Valorant extends Akun{
    private final int HargaVp=114;
    private double harga;
    private double disc=0;
    private int  bonus,n;
    private String nama;
    private int bnyk;

    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama,int n) {
        this.nama = nama;
        this.n=n;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String userName(){
        return "(Valorant) "+UserName;
    }

    @Override
    public String getId(){
        return ID;
    }
    
    public double hitungTotal(){
        hitungTotal=HargaVp*getJumlah();
        return hitungTotal;
    }

    public String getGame(){
        return "Valorant";
    }

    public double Bundel(){
        bnyk = (int) (Math.random() * 100);
        if(n==1){
            disc=getHarga()*0.05;
            setBonus(bnyk);
        }else if(n==2){
            disc=getHarga()*0.1;
            setBonus(bnyk);
        }else if(n==3){
            disc=getHarga()*0.15;
            setBonus(bnyk);
        }else{
            disc=0;
        }
        return disc;
    }

}

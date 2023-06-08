package project;

public class Mole extends Akun {
    private final int HargaDiam = 315;
    private final String[] skin = new String[8];

    @Override
    public String userName() {
        return "(Mobile Legends) " + UserName;
    }

    @Override
    public String getId() {
        return ID;
    }

    public double hitungTotal() {
        hitungTotal=HargaDiam * getJumlah();
        return hitungTotal;
    }

    public String getGame() {
        return "Moblie Legends";
    }

    public  String bonusSkin(){
        skin[0]="Badang-Fist of zen";
        skin[1]="Granger-Agent Z";
        skin[2]="Valir-Demon Lord";
        skin[3]="Nana-Clockwork Maid ";
        skin[4]="ZONKK";
        skin[5]="Layla-Green Flash";
        skin[6]="Claude-Golden Bullet";
        skin[7]="Bruno-Vanguard Elite";
        int x=(int)(Math.random()*8);
        if(getJumlah()==77){
            return skin[x];
        }else if(getJumlah()==774){
            return skin[x];
        }else if(getJumlah()==1708){
            return skin[x];
        }else if(getJumlah()==4003){
            return skin[x];
        }
        return "ZONKKK";
    }
}

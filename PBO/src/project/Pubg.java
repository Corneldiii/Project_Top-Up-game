package project;

public class Pubg extends Akun {
    private final int HargaUc = 200;
    public double disc;

    @Override
    public String userName() {
        return "(PUBG) " + UserName;
    }

    @Override
    public String getId() {
        return ID;
    }

    public double hitungTotal() {
        hitungTotal=HargaUc * getJumlah();
        return hitungTotal;
    }

    public String getGame() {
        return "Pubg Mobile";
    }

    public double custom() {
        double hasilDisc=0;
        if(getJumlah()<50){
            return hasilDisc;
        }else if (getJumlah() <= 100) {
            System.out.println("Selamat anda memperoleh Bonus : +20UC");
            setJumlah(getJumlah() + 20);
        } else if (getJumlah() <= 500) {
            System.out.println("Selamat anda memperoleh Bonus : +50UC");
            setJumlah(getJumlah() + 50);
        }else if(getJumlah() <= 5000){
            disc = (int) (Math.random() * 5);
            hasilDisc = hitungTotal() * (disc / 100);
            System.out.println("Selamat anda memperoleh Bonus : -"+hasilDisc);
            return hasilDisc;
        }else{
            disc = (int) (Math.random() * 15);
            hasilDisc = hitungTotal() * (disc / 100);
            System.out.println("Selamat anda memperoleh Bonus : -"+hasilDisc);
            return hasilDisc;
        }
        return hasilDisc;

    }
}

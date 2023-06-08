package project;

public class epepMax extends Akun {
    private final int HargaDiam = 200;
    private double disc=0;

    @Override
    public String userName() {
        return "(FFmax) " + UserName;
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
        return "Free Fire Max";
    }

    public double Kejutan() {
        double hasilDisc = 0;
        if (getJumlah() < 100) {
            disc = (int) (Math.random() * 5);
            hasilDisc = hitungTotal() * (disc / 100);
        } else if (getJumlah() <= 4000) {
            disc = (int) (Math.random() * 10);
            hasilDisc = hitungTotal() * (disc / 100);
        } else {
            disc = (int) (Math.random() * 15);
            hasilDisc = hitungTotal() * (disc / 100);
        }

        return hasilDisc;
    }
}

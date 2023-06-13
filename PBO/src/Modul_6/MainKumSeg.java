package Modul_6;
import javax.swing.JOptionPane;
public class MainKumSeg {
    public static void main(String[] args) {
        Segitiga[] daftar;
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Banyak segitiga "));
        daftar=new Segitiga[n];
        for (int i = 0; i < daftar.length; i++) {
            int x1=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X1"));
            int y1=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y1"));
            int x2=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X2"));
            int y2=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y2"));
            int x3=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X3"));
            int y3=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y3"));
            daftar[i]=new Segitiga();
            daftar[i].setX1(x1);
            daftar[i].setY1(y1);
            daftar[i].setX2(x2);
            daftar[i].setY2(y2);
            daftar[i].setX3(x3);
            daftar[i].setY3(y3);
        }
        KumpulanSegitiga seg= new KumpulanSegitiga();
        seg.setDaftarSegitiga(daftar);
        double tampung=seg.rataRata(daftar);
        System.out.println("Rata rata dari semua segitiga adalah : "+tampung);
        
        seg.Terluas(daftar);
        seg.terkecil(daftar);
    }
}

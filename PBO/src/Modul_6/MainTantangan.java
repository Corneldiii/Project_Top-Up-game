package Modul_6;

import javax.swing.JOptionPane;

public class MainTantangan {
    public static void main(String[] args) {
        KumpulanSegitiga2[] daftar;
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Banyak segitiga "));
        daftar=new KumpulanSegitiga2[n];
        for (int i = 0; i < daftar.length; i++) {
            int x1=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X1"));
            int y1=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y1"));
            int x2=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X2"));
            int y2=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y2"));
            int x3=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" X3"));
            int y3=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan titik segtiga ke "+(i+1)+" Y3"));

            Titik tikA=new Titik(x1,y1);
            Titik tikB=new Titik(x2,y2);
            Titik tikC=new Titik(x3,y3);
            daftar[i]=new KumpulanSegitiga2();
            daftar[i].Segitiga2(tikA, tikB, tikC);
        }
        KumpulanSegitiga2 obj=new KumpulanSegitiga2();
        obj.setDaftar(daftar);

        double tampung=obj.rataRata(daftar);
        System.out.println("Rata rata dari semua segitiga adalah : "+tampung);
        obj.Terluas(daftar);
        obj.terkecil(daftar);


    }
}

package latihan.pkg1;
import java.util.Scanner;
public class Alpro {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int jumlah=0,rata,N=0,pilih;
        String nama;
        boolean menu=true;
        while(menu){
        System.out.println("Pilih : ");
        System.out.println("1.Data  diri");
        System.out.println("2.mencari rata rata");
        System.out.println("3.keluar");
        System.out.print("pilih : ");
        pilih=tampung.nextInt();
        
        int[] test=new int[5];
            switch (pilih) {
                case 1:
                    System.out.println("Masukan nama anda : ");
                    nama=tampung.next();
                    break;
                case 2:
                    for(int i=0;i<5;i++){
                        System.out.println("Masukan nilai : ");
                        test[i]=tampung.nextInt();
                        jumlah+=test[i];
                        N++;
                    }
                    rata=jumlah/N;
                    System.out.println("Rata ratanya adalah : "+rata);
                    System.out.println("");
                    System.out.println("Cetak isi nilai");
                    for(int i=0;i<5;i++){
                        System.out.println("nilai : "+test[i]);
                    }           break;
                case 3:
                    menu=false;
                    break;
            }
    }
    }
}
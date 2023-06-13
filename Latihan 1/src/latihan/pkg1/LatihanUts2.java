package latihan.pkg1;
import java.util.Scanner;
public class LatihanUts2 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        
        int ukuran,harga;
        String type;
        double disc,total;
        
        System.out.print("Type(1.LED,2.LCD) : ");
        type=tampung.nextLine();
        
        
        
        if("LED".equals(type)){
            System.out.print("Ukuran(inch)      : ");
            ukuran=tampung.nextInt();
            System.out.print("Harga             : Rp.");
            harga=tampung.nextInt();
            disc=0.05*harga;
            total=harga-disc;
            System.out.println("Harga       : Rp. "+harga);
            System.out.println("Discounut   : Rp. "+disc);
            System.out.println("__________________________ - ");
            System.out.println("Harga akhir : Rp. "+total);
        }else if ("LCD".equals(type)){
                System.out.print("Ukuran(inch)      : ");
                ukuran=tampung.nextInt();
            if(ukuran==14){
                System.out.print("Harga             : Rp.");
                harga=tampung.nextInt();
                disc=0.1*harga;
                total=harga-disc;
                System.out.println("Harga       : Rp. "+harga);
                System.out.println("Discounut   : Rp. "+disc);
                System.out.println("_________________________ -");
                System.out.println("Harga akhir : Rp. "+total);
            }else if(ukuran==32){
                System.out.print("Harga             : ");
                harga=tampung.nextInt();
                disc=0.12*harga;
                total=harga-disc;
                System.out.println("Harga       : Rp. "+harga);
                System.out.println("Discounut   : Rp. "+disc);
                System.out.println("__________________________ - ");
                System.out.println("Harga akhir : Rp. "+total);
            }else if(ukuran>=40){
                System.out.print("Harga             : Rp.");
                harga=tampung.nextInt();
                disc=0.15*harga;
                total=harga-disc;
                System.out.println("Harga       : Rp. "+harga);
                System.out.println("Discounut   : Rp. "+disc);
                System.out.println("_________________________ -");
                System.out.println("Harga akhir : Rp. "+total);
                
            }
        }
    }
}

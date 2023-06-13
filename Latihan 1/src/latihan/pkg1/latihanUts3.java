package latihan.pkg1;
import java.util.Scanner;
public class latihanUts3 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        
        
        double disc,total,dibayar;
        int a,b,c,hari;
        
        System.out.println("Petunjuk!!!!");
        System.out.println("SENIN=1,SELASA=2,RABU=3,KAMIS=4,JUMAT=5,SABTU=6,MINGGU=7");
        System.out.print("Jumlah barang A   : ");
        a=tampung.nextInt();
        System.out.print("Jumlah barang B   : ");
        b=tampung.nextInt();
        System.out.print("Jumlah barang C   : ");
        c=tampung.nextInt();
        System.out.print("Hari apa anda beli: ");
        hari=tampung.nextInt();
        
        if(hari==1 || hari==2 || hari==3 ){
            total=10000*a+15000*b+20000*c;
            System.out.println("Harga                           : Rp."+total);
            System.out.println("Discount yang anda dapatkan     : Rp.0");
            System.out.println("____________________________________________ -");
            System.out.println("Total yang harus anda bayarkan  : Rp."+total);
        }else if (hari==4 || hari==5){
            total=10000*a+15000*b+20000*c; 
            disc=total*0.1;
            dibayar=total-disc;
            System.out.println("Harga                           : Rp."+total);
            System.out.println("Discount yang anda dapatkan     : Rp."+disc);
            System.out.println("______________________________________________ -");
            System.out.println("Total yang harus anda bayarkan  : Rp."+dibayar);
        }else if (hari==6 || hari==7){
            total=10000*a+15000*b+20000*c; 
            disc=total*0.2;
            dibayar=total-disc;
            System.out.println("Harga                           : Rp."+total);
            System.out.println("Discount yang anda dapatkan     : Rp."+disc);
            System.out.println("______________________________________________ -");
            System.out.println("Total yang harus anda bayarkan  : Rp."+dibayar);
        }else{
            System.out.println("Invalid code(ERROR!)");
        }
            
        
    }
}

package latihan.pkg1;
import java.util.Scanner;
public class latihanUts1 {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        boolean menu=true;
        boolean lagi=true;
        do{
        System.out.println("Keluar?[1.ya/2.tidak]");
        int pilih=tampung.nextInt();
        if(pilih==1){
            menu=false;
        }else if(pilih==2){
            menu=true;
        }
        while(lagi){
            System.out.println("Masukan ke 2");
            pilih=tampung.nextInt();
            if(pilih==1){
                lagi=false;
            }else if(pilih==2){
                lagi=true;
            }
        }while(lagi);
        }while(menu);
    }

}

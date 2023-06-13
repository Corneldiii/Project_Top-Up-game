package pbo;
import java.util.Scanner;
    

public class PBO2 {
    static double rata=0,max=0.0,min=0.0;
    static int N;
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
       System.out.print("Masukan jumlah mahasiswa : ");
        N=tampung.nextInt();
        double[] ips=new double[N];
        String[] jumSks=new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Masukan IPS ke "+(i+1)+" : ");
            ips[i]=tampung.nextDouble();
            rata+=ips[i];
            if(ips[i] > 2.75){
                jumSks[i]="24";
            }else if(2.5< ips[i] && ips[i]<=2.75){
                jumSks[i]="22";
            }else if(ips[i]<2.5){
                jumSks[i]="20";
            }
           maxMin(ips[i],i);
        }
         System.out.println("No.         IPS         Jumlah SKS maks");
        System.out.println("==========================================");
        for (int i = 0; i < N; i++) {
            System.out.println((i+1)+".         "+ips[i]+"              "+jumSks[i]);
        }
        System.out.println("rata ratanya adalah : "+rata(N,rata));
        System.out.println("Nilai IPS tertinggi : "+max);
        System.out.println("Nilai IPS terendah  : "+min);
    }
    static void maxMin(double f,int u){
        if(u==0){
            max=f;
            min=f;
        }else{
            if(f<min)min=f;
            if(f>max)max=f;
               
        }
    }
    static double rata(double x,double c){
        return c/x;
    }
}

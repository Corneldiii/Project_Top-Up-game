package belajarUAS;
import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        Scanner tampung=new Scanner(System.in);
        System.out.println("Masukan angka : ");
        int c=tampung.nextInt();
        int[] data=new int[c];
        for(int i=0;i<data.length;i++){
            System.out.println("Masukan data ke "+(i+1)+" :");
            data[i]=tampung.nextInt();
        }
        int max=data[0],min=data[0];
        for(int j=0;j<data.length;j++){
            if(data[j]>max){
                max=data[j];
            }else if(data[j]<min){
                min=data[j];
            }else if(j==data.length){
                max=data[j];
                min=data[j];
            }
        }
        System.out.println("min : "+min);
        System.out.println("Max : "+max);
    }
}

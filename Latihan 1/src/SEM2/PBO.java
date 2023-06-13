package SEM2;

public class PBO {
    static int i=0,a=0,b=0,c=0;
    static double rata,max,min;
    static double[] curahHujan={50,70,110,80,90,130,190,240,290,310,280,350,390,330,280,240,244,190,230,170,100,130,80,40,50,70,30,80,120,190};
        public static void main(String[] args){
        int jumlah=0;
        System.out.println("No. Curah Hujan ");
        System.out.println("===================");
        for(i=0;i< curahHujan.length;i++){
            System.out.println((i+1)+". "+curahHujan[i]);
            jumlah+=curahHujan[i];
        }
        
            System.out.println("Rata rata : "+rata(jumlah));
            kategori();
            System.out.println("Curah hujan tertinggi : "+max);
            System.out.println("Curah hujan terrendah : "+min);
            System.out.println("Jumlah hari dengan curah hujan tinggi : "+c);
            
            
    }
    static double rata(double n){
        rata=n/curahHujan.length;
        return rata;
    }
    static void kategori(){
            if(0<rata && rata<=100){
                a++;
                System.out.println("Kategori curah hujan : Rendah");
            }else if(100<rata && rata<=300){
                b++;
                System.out.println("Kategori curah hujan : Sedang");
            }else if(300<rata && rata<=500){
                c++;
                System.out.println("Kategori curah hujan : Tinggi");
            }
    }
    static void maxMin(){
        for(i=0;i<curahHujan.length;i++){
               if(curahHujan[i]<min)min=curahHujan[i];
               if(curahHujan[i]>max)max=curahHujan[i];
           }
        }
    }
    


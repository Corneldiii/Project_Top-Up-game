package K416_225314023;
import java.util.Scanner;
public class Looping_225314023 {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        String nama,nim;
        int nilai,pilih,data,N=1;//meminta variable dengan nama nama tersebut pada Interger
        double celcius,fahrenheit,reamur,jumlah=0,rata;//meminta tempat unutk variable dengan nama nama tersebut pada double
        boolean menu=true;//menentukan isi dari variable menu dengan data true pada tipe data boolean
        
        
        while(menu){//selama isi variable menu sama dengan true akan terus beroprasi
        System.out.println("Menu:");//mencetak tulisan menu
        System.out.println("1. Data diri");//mencetak tulisan 1. Data diri
        System.out.println("2. Rata-rata nilai");//mencetak tulisan 2. Rata-rata nilai
        System.out.println("3. Konversi suhu");//mencetak tulisan 3. Konversi suhu
        System.out.println("4. Keluar");//mencetak tulisan 4. keluar
        System.out.print("Pilih   : ");//mencetak tulisan pilih :
        pilih=tampung.nextInt();//membaca hasil inputan dan menyimpan pada variable pilih dan disimpan ke memori tampung pada class scanner
        
            switch(pilih){//jika berisi 1 maka program di jalankan
                case 1://jika berisi 1 maka diproses
                    System.out.print("Masukan nama anda   : ");
                    nama=tampung.next();
                    System.out.print("Masukan NIM anda    : ");
                    nim=tampung.next();
                    break;//program selesai di kerjakan
                case 2://jika berisi 4 maka program di jalankan
                    System.out.print("masukan berapa banyak data  : ");//mencetak tulisan masukan berapa banyak data  : 
                    data=tampung.nextInt();//membaca inputan berupa variable dengan nama data dan disimpan ke memori tampung pada clas scanner
                    while(N<=data){//selama isi data N lebih kecil sama dengan data program dijalankan terus
                        System.out.print("Masukan nilai "+N+"  : ");//mencetak tulisan Masukan nilai "+N+"  : 
                        nilai=tampung.nextInt();//membaca dan menyimpan variable nilai ke memori tampung pada class scanner
                        jumlah+=nilai;//mengisi variable jumlah dengan hasil dari penambahan jumlah dengan nilai
                        N++;//menambahkan 1 dengan isi variable N
                    }   
                    rata=jumlah/data;//menghitung hasil dari jumlah dibagi dengan data dan disimpan ke variable rata
                    System.out.println("Maka jumlah rata rata dari "+data+" nilai adalah   : "+rata);//mencetak tulisan Maka jumlah rata rata dari "+data+" nilai adalah   : "+rata
                    break;//program selesai di kerjakan
                case 3://jika berisi 4 maka program di jalankan
                    System.out.print("Masukan suhu dalam Celcius  : ");//mencetak tulisan Masukan suhu dalam Celcius  : 
                    celcius=tampung.nextInt();//membaca dan menyimpan variable celcius ke memori tampung pada class scanner
                    fahrenheit= (9.0/5.0)*celcius + 32;//menghitung hasil dari (9.0/5.0)*celcius + 32 dan disimpan ke variable fahrenheit
                    reamur=(4.0/5.0)*celcius;//menghitung hasil dari (4.0/5.0)*celcius dan disimpan ke variable reamur
                    System.out.println("Maka hasil konversi suhu "+celcius+" derajat celcius adalah :");//mencetak tulisan Maka hasil konversi suhu "+celcius+" derajat celcius adalah :
                    System.out.println("Fahrenheit  : "+fahrenheit);//mencetak tulisan Fahrenheit  : "+fahrenheit
                    System.out.println("Reamur      : "+reamur);//mencetak tulisan Reamur      : "+reamur
                    break;//program selesai di kerjakan
                case 4://jika berisi 4 maka program di jalankan
                    menu=false;//mengisi variable menu dengan false
                    break;//program selesai di kerjakan
                
            }
        
        }
    }
}

    
    


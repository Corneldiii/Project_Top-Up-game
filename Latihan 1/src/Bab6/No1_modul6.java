package Bab6;
public class No1_modul6 {
    public static void main(String[] args){
        int liter=1,harga=6500;//meminta tempat pada interger dengan nama liter yang usdah berisi 1 dan harga yang di isi 6500
        
        
        System.out.println("Harga per liter Rp. "+harga);
        System.out.print("Jumlah Liter        ");//mencetak tulisan jumlah Liter
        System.out.println("Harga(Rp)");//mencetak Harga(RP)
        System.out.println("--------------------------------------");//mencetak----
        System.out.println("--------------------------------------");//mencetak----
        while(liter<21){//selama isi variable liter lebih kecil dari 21 maka program akan dijalankan terus
            System.out.print(liter+"                    Rp.");//mencetak isi variable liter dan tulisan Rp.
            System.out.println(harga);//mencetak isi variable harga
            liter=liter+1;//mengisi variable liter dengan isi variable liter sendiri lalu ditambah 1
            harga=liter*6500;//mengeisi vaiable harga dengan isi variable harga sendiri lalu ditambah 6500
            
            
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

    }
}

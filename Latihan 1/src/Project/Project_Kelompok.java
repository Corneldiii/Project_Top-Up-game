package Project;
import java.util.Scanner;
public class Project_Kelompok {
    static boolean menu=true,lagi=true;//meminta variable universal bertipe boolean dengan nama menu yang bernilai true,dan lagi yang bernilai ture
    static String pilih,voucer,tujuan,sekarang;//meminta variable universal bertipe String dengan nama pilih,voucer,tujuan,sekarang
    static int Bekpay=0,totalBf=0,N=0,km;;//meminta variable universal bertipe int dengan nama Bekpay yang berisi 0,totalBf yang berisi 0,N yan berisi 0 dan km
    static double total,harga=1000;//meminta variable universal bertipe double dengan nama total,dan harga yang berisi 1000
    public static void main(String[] args) {//meminta metode main
        Scanner tampung=new Scanner(System.in);//meminta variable tampung pada scanner
        int isiUlang,pin;//meminta variable dengan nama isiUlang dan pin
        
        while(menu){//selama nilai variable true akan terus di ulang
        System.out.println("-----------------------------");
        System.out.println("           BekGo          ");
        System.out.println("-----------------------------");
        System.out.println("Bekride    Voucer   Bekpay");
        System.out.println("Bekfood");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("!!! peringatan spasi sama dengan _ !!!");
        System.out.print("Pilih : ");
        pilih=tampung.next();//membaca dan menyimpan input
        
        if("bekride".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah bekride
            System.out.print("Masukan tujuan anda : ");
            tujuan=tampung.next();//membaca input dan menyimpan
            System.out.print("masukan lokasi anda saat ini : ");
            sekarang=tampung.next();//membaca dan menyimpan input
            System.out.print("masukan jarak(km) : ");
            km=tampung.nextInt();//membaca dan menyimpan input
            if(km<10)km=10;//jika isi variable km kurang dari 10 maka isi variable km di ganti 10
            System.out.print("Masukan voucer : ");
            voucer=tampung.next();//membaca dan menyimpan input
            switch(voucer){//jika isi voucer
                case "disc10"://case pertama jika berisi disc10
                    disc(km, 0.1);//menghitung total biaya dengan mengirim input ke method disc
                    bayarBr();//memanggil method bayarBr
                    break;//selesai
                case "disc50":
                    disc(km, 0.5);//menghitung total biaya dengan mengirim input ke method disc
                    bayarBr();//memanggil method bayarBr
                    break;//selesai
                case "-":
                    disc(km, 0.0);//menghitung total biaya dengan mengirim input ke method disc
                    bayarBr();//memanggil method bayarBr
                    break;//selesai
                      
            }
        }else if("voucer".equalsIgnoreCase(pilih)){//atau jika isi variable pilih adalah voucer
            System.out.println("-----------------------------");
            System.out.println("            VOUCER      ");
            System.out.println("-----------------------------");
            System.out.println("");
            System.out.println("Vouver anda : ");
            System.out.println("____________________________________");
            System.out.println("Discount 10% tanpa minimal belanja");
            System.out.println("{Berlaku hingga 30 desember}      ");
            System.out.println("___________________________________");
            System.out.println("Discount 50% tanpa minimum belanja");
            System.out.println("{Berlaku hingga 30 november}");
            System.out.println("____________________________________");
            keluar();//memangil method keluar
            
        }else if("bekpay".equalsIgnoreCase(pilih)){//atau jika isi variable pilih adalah bekpay
            System.out.println("-----------------------------");
            System.out.println("            BEKPAY      ");
            System.out.println("-----------------------------");
            System.out.println("Cek_saldo           Isi_ulang");
            System.out.print("pilih : ");
            pilih=tampung.next();//membaca dan menyimpan input
            switch(pilih){//jika variable saldo
                case "cek_saldo"://case pertama berisi cek_saldo
                    System.out.println("Saldo anda  : Rp."+Bekpay);//mencetak tulisan dan isi variable universal Bekpay
                    keluar();//memanggil method keluar
                    break;//selesai
                case "isi_ulang"://case ke dua berisi isi_ulang
                    System.out.print("Jumlah isi ulang : Rp.");
                    isiUlang=tampung.nextInt();//membaca dan menyimpan input
                    Bekpay+=isiUlang;//menambahkan isi variable Bekpay dengan variable isiUlang
                    System.out.println("[Transfer-Bank only]");
                    System.out.print("Metode bayar : ");
                    pilih=tampung.next();//membaca dan menyimpan input
                    if("transfer_bank".equalsIgnoreCase(pilih)){
                        
                        System.out.print("Masukan pin anda : ");
                        pin=tampung.nextInt();//membaca dan menyimpan input
                        if(pin==224466){//jika isi variable pin sama dengan 224466
                            System.out.println("---------------------------------");
                            System.out.println("SELAMAT ISI ULANG ANDA BERHASIL");
                            keluar();//memanggil method keluar
                            
                        }else{//jika tidak 
                            System.out.println("!! PIN SALAH !!");
                            keluar();//memanggil method keluar
                        }
                            
                    }
                    break;//selesai    
            }      
            
        }else if("bekfood".equalsIgnoreCase(pilih)){//atau jika isi variable pilih adalah bekfood
            int pilihMenu,z;//meminta variable bertipe int dengan nama pilihMenu dan z
            System.out.print("masukan lokasi anda saat ini : ");
            sekarang=tampung.next();//membaca dan menyimpan input
            System.out.print("masukan jarak(km) : ");
            km=tampung.nextInt();//membaca dan menyimpan input
            if(km<10)km=10;//jika isi variable km kurang dari 10 isi variable km di isi dengan 10
            System.out.println("Makanan yang lagi hits!!!");
            System.out.println("Banyak pilihan : ");
            menu();//memanggil method menu
            System.out.print("Pilih : ");
            pilih=tampung.next();//membaca dan menyimpan input
            switch(pilih){//periksa variable pilih
                case "martabak"://jika martabak
                    do{//melakukan perulangan minimal sekali
                    martabak();//memanggil method martabak
                    pilihMenu=tampung.nextInt();//membaca dan menyimpan input
                    switch(pilihMenu){//periksa variable pilihMenu
                        case 1://jika 1
                            banyak(30000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(30000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(25000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(32000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            banyak(24000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 6://jika 6
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                    }
                    }while(lagi);//selama nilai variable lagi bernilai true
                    break;//selesai
                case "bakso"://jika bakso
                    while(lagi){//melakukan perulangan selama nilai lagi sama dengan true
                    bakso();//memanggil method bakso
                    pilihMenu=tampung.nextInt();//membaca dan menyimpan input
                    switch(pilihMenu){//periksa variable pilihMenu
                        case 1://jika 1
                            banyak(14000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(19000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(18000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(14000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            banyak(26000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 6://jika 6
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                    }
                    }
                    break;//selesai
                case "boba_milk":
                    while(lagi){//melakukan perulangan selama nilai variable lagii sama dengan true
                    bobaMilk();//memanggil method bobaMilk
                    pilihMenu=tampung.nextInt();//membaca dan menyimpan inpuy
                    switch(pilihMenu){//periksa variable pilihMenu
                        case 1://jika 1
                            banyak(21000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(19000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(18000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(18000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            banyak(19000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 6://jika 6
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                        }
                    }
                    break;//selesai
                case "geprek":
                    while(lagi){//melakukan perulangan selama nilai lagi sama dengan true
                        geprek();//memanggil method geprek
                        pilihMenu=tampung.nextInt();//membaca dan menyimpan input
                    switch(pilihMenu){//periksa variable pilihMenu
                        case 1://jika 1
                            banyak(20000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(15000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(15000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(18000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                        }
                    }
                    break;//selesai
                case "nasi_goreng"://jika nasi_goreng
                    while(lagi){//melakukan perulangan selama lagi sama dengan true
                        nasiGoreng();//memanggil method nasiGoreng
                        pilihMenu=tampung.nextInt();//membaca dan menyimpan input
                    switch(pilihMenu){//periksa variable pilihMenu
                        case 1://jika 1
                            banyak(23500);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(235000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(24000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(20500);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                        }
                    }
                    break;//selesai
                case "mie_ayam"://jika mie_ayam
                    while(lagi){//melakukan perulangan selama lagi sama dengan true
                        mieAyam();//memanggil method mieAyam
                        pilihMenu=tampung.nextInt();//membaca dan menyimpan input
                    switch(pilihMenu){//memeriksa variable pilihMenu
                        case 1://jika 1
                            banyak(12500);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 2://jika 2
                            banyak(11500);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 3://jika 3
                            banyak(12000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 4://jika 4
                            banyak(14000);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 5://jika 5
                            banyak(15500);//memanggil method banyak dengan masukan input berupa harga
                            break;//selesai
                        case 6://jika 6
                            lagi=false;//mengganti nilai boolean lagi dengan false
                            menu=true;//mengganti nilai boolean menu dengan false
                            break;//selesai
                        }
                    }
                    break;//selesai
            }
        }
            
        }
    }
    public static double disc(int m,double c){//meminta method bertipe double dengan nama disc dan meminta masukan bertipe int dan double dengan nama m dan c
        double harga=1000,hitung,total;//meminta variable harga=1000,hitung,total
        harga=harga*m;//menghitung hasil dari harga dikali masukan nilai m
        hitung=harga*c;//menghitung hasil dari harga dikali masukan nilai c dan disimpan ke hitung
        total=harga-hitung;//menghitung hasil harga dikurangi hitung disimpan ke total
        Bekpay-=total;//mengurangi isi variable Bekpat dengan total
        System.out.println("Harga   : Rp."+harga);
        System.out.println("Disc    : Rp."+hitung);
        System.out.println("Total   : Rp."+total);
        return total;//mengembalikan nilai total
    }
    
    private static void driverBr(int n){//membuat method bertipe void dengan nama driverBr dan meminta masukan bertipe int n
        String[] namaDriver={"Bambang Mercon","Bagus pika","Amel Ria","Siska Kuncup","Jamal Rudin"};//meminta array dengan nama namDriver bertipe string dengan isian nama nama driver
        String [] platNomor={"AB 2353 IC","R 4332 CO","KB 8756 ZX","AD 1243 CT","B 8481 RT"};//meminta array dengan nama platNomor yang bertipe string dengan isian plat 
        String [] motor={"Mio","Aerox","Supra X","CBR150R","Beat"};//meminta array bernama montor yang bertipe string dengan isian jenis montor
        System.out.println("----------------------");
        System.out.println("    PESANAN DITERIMA ");
        System.out.println("----------------------");
        System.out.println("Driver  : "+namaDriver[n]);//mencetak array
        System.out.println("Plat    : "+platNomor[n]);//mencetak array
        System.out.println("Montor  : "+motor[n]);//mencetak array
        
    }
    private static void driverBf(int m,int c,double q){//membuat ,ethod bertipe void dengan nama driverBf yang meminta masukan bertipe int dengan nama m dan c dan bertip double dengan nama q
        String[] namaDriver={"Becky heri","Pidi baik","Agus ujang","Amel Uwuw","Jajang Vespa"};//array nama driver
        String [] platNomor={"AB 2266 OC","B 5676 QW","AD 9856 SD","B 2254 JP","R 4567 VS"};//array plat driver
        String [] motor={"Beat","Vario","Supra X","Mio","Vespa"};//array montor driver
        System.out.println("----------------------");
        System.out.println("    PESANAN DITERIMA ");
        System.out.println("----------------------");
        System.out.println("Driver  : "+namaDriver[m]);//mencetak array
        System.out.println("Plat    : "+platNomor[m]);//mencetak array
        System.out.println("Montor  : "+motor[m]);//mencetak array
        harga=harga*c;//menghitung hasil harga dikali dengan masukan c
        double hitung=totalBf*q;//kalikan variable totalBf dengan masukan q
        total=(harga+totalBf)-hitung;//menghitung hasill dari harga ditambah totalBf lalu dikurang hitung
        Bekpay-=total;//mengurangi isi variable Bekpay dengan total
        System.out.println("Ongkir  : Rp."+harga);
        System.out.println("Harga   : Rp."+totalBf);
        System.out.println("Disc    : Rp."+hitung);
        System.out.println("Total   : Rp."+total);
        System.out.println("----------------------");
        System.out.println("    TERIMA KASIH    ");
        
    }
    static void alamat(String n, String v){//membuat method bertipe void dengan nama alamat dan masukan bertipe String dengan nama n dan v
        System.out.println("Titik penjempuatan  : "+v);
        System.out.println("Titik tujuan        : "+n);
        System.out.println("        Terima Kasih        ");
        System.out.println("");
    }
    private static void menu(){//membuat method menu yag bertipe void
        String[] menu={"Martabak","Bakso","Bobal_milk","Geprek","Nasi_Goreng","Mie_Ayam"};//membuat array menu yang berisi menu bekfood
        for (int i = 0; i < menu.length; i++)System.out.println("-"+menu[i]);//mencetak isi array dengan perulangan
    }
    private static void martabak(){//membuat method bertipe void untuk menu martabak
        String[] martabak={"Martabak Coklat Keju","Martabak Coklat Susu","Martabak Keju susu","Martabak Telur spesial","Martabak Telur Biasa"};
        String[] harga={"Rp. 30.000","Rp. 19.000","Rp. 25.000","Rp. 32.000","Rp. 24.000"};
        for(int i=0;i<martabak.length;i++){
            System.out.print(""+(i+1)+". "+martabak[i]);//mencetak isi array dengan perulangan
            System.out.println("    :   "+harga[i]);
        }
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
        
    }
    public static void bakso(){//membuat method bertipe void untuk menu bakso
        String[] bakso={"Basko Urat","Bakso Telur","Bakso Beranak","Bakso Lava","Bakso Komplit"};
        String[] harga={"Rp. 14.000","Rp. 19.000","Rp. 18.000","Rp. 14.000","Rp. 26.000"};
        for(int i=0;i<bakso.length;i++){
            System.out.print(""+(i+1)+". "+bakso[i]);
            System.out.println("    :   "+harga[i]);//mencetak isi array dengan perulangan
        }
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
    }
    public static void bobaMilk(){//membuat method bertipe void untuk menu bobaMilk
        String[] boba={"Boba Brown Sugar","Boba Taro","Boba Vanilla","Boba Milk Tea","Boba Coklat"};
        String[] harga={"Rp. 21.000","Rp. 19.000","Rp. 18.000","Rp. 18.000","Rp. 19.000"};
        for(int i=0;i<boba.length;i++){
            System.out.print(""+(i+1)+". "+boba[i]);
            System.out.println("    :   "+harga[i]);//mencetak isi array dengan perulangan
        }
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
    }
    public static void geprek(){//membuat method bertipe void untuk menu geprek
        String[] geprek={"Geprek Mozarella","Geprek Original","Geprek Matah","Geprek Hot Lava"};
        String[] harga={"Rp. 20.000","Rp. 15.000","Rp. 15.000","Rp. 18.000"};
        for(int i=0;i<geprek.length;i++){
            System.out.print(""+(i+1)+". "+geprek[i]);//mencetak isi array dengan perulangan
            System.out.println("    :   "+harga[i]);
        }
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
    }
    public static void nasiGoreng(){//membuat method bertipe void untuk menu nasiGoreng
        String[] nasiGoreng={"Nasgor Sosis","Nasgor Original","Nasgor Ayam","Magelangan"};
        String[] harga={"Rp. 23.500","Rp. 23.500","Rp. 24.000","Rp. 20.500"};
        for (int i = 0; i < nasiGoreng.length; i++) {
            System.out.print(""+(i+1)+". "+nasiGoreng[i]);//mencetak isi array dengan perulangan
            System.out.println("    :   "+harga[i]);
        }
        System.out.println("5. Keluar");
        System.out.print("Pilih : ");
    }
    public static void mieAyam(){//membuat method bertipe void untuk menu miAyam
        String[] mieAyam={"Mie Pangsit","Mie ayam Original","Mie Ayam Ceker","Mie Ayam Bakso","Mie Ayam komplit"};
        String[] harga={"Rp. 12.500","Rp. 11.500","Rp. 12.000","Rp. 14.000","Rp. 15.500"};
        for (int i = 0; i < mieAyam.length; i++) {
            System.out.print(""+(i+1)+". "+mieAyam[i]);//mencetak isi array dengan perulangan
            System.out.println("    :   "+harga[i]);
        }
        System.out.println("6. Keluar");
        System.out.print("Pilih : ");
    }
    public static void keluar(){//membuat method bertipe void untuk keluar app
        Scanner tampung=new Scanner(System.in);
        System.out.println("< Keluar app?[ya/tidak]");
        pilih=tampung.next();
        if("ya".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah ya
            menu=false;//ubah nilai boolean menu ke false
            lagi=false;//ubah nilai boolean lagi ke false
        }else{
            menu=true;//ubah nilai boolean menu ke true
        }
    }
    public static void bayarBf(int m, int n){//membuat method untuk mekanisme pembayaran bekfood yang bertipe void dengan masukan bertipe int dengan nama m dan n
        Scanner tampung=new Scanner(System.in);
        System.out.print("Masukan voucer : ");
        voucer=tampung.next();//membaca dan menyimpan inputan
        switch(voucer){//memeriksa variable voucer
            case "disc10"://jika berisi disc10
                System.out.println("[Cash/Bekpay]");
                System.out.print("Pilih metode bayar : ");
                pilih=tampung.next();//membaca dan menyimpan input
                if("cash".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah cash
                    N++;//tambah variable N dengann 1
                    driverBf(m,n, 0.1);//memanggil method driverBf dengan masukan method
                    keluar();//memanggil method keluar
                }else if("bekpay".equalsIgnoreCase(pilih)){
                    if(Bekpay<harga){
                        System.out.println("Maaf saldo anda tidak cukup.");
                        keluar();//memanggil method keluar
                    }else{
                        N++;//tambah variable N dengann 1
                        driverBf(m,n, 0.1);//memanggil method driverBf dengan masukan method
                        keluar();//memanggil method keluar
                    }
                }
            break;//selesai
            case "disc50"://jika berisi disc50
                System.out.println("[Cash/Bekpay]");
                System.out.print("Pilih metode bayar : ");
                pilih=tampung.next();//membaca dan menyimpan input
                if("cash".equalsIgnoreCase(pilih)){//jika isi pilih adalah cash
                    N++;//tambah variable N dengan 1
                    driverBf(m,n, 0.5);//memanggil method driverBf dengan masukan
                    keluar();//memanggil method keluar
                }else if("bekpay".equalsIgnoreCase(pilih)){//jika isi pilih adalah bekpay
                    if(Bekpay<harga){//jika bekpay kurang dari harga
                        System.out.println("Maaf saldo anda tidak cukup.");//cetak
                        keluar();//memanggil method keluar
                    }else{//jika tidak
                        N++;//tambah variable N dengan 1
                        driverBf(m,n, 0.5);//memanggil method driverBf dengan masukan
                        keluar();//memanggil method keluar
                    }
                }
            break;//selesai
            case "-"://jika berisi -
                System.out.println("[Cash/Bekpay]");
                System.out.print("Pilih metode bayar : ");
                pilih=tampung.next();//membaca dan menyimpan input
                if("cash".equalsIgnoreCase(pilih)){//jika isi variable pilih adlaah disc10
                    N++;//tambah variable N dengan 1
                    driverBf(m,n, 0.0);//memanggil method driverBf dengan masukan
                    keluar();//memanggil method keluar
                }else if("bekpay".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah bekpay
                    if(Bekpay<harga){//jika bekpay kurang dari harga
                        System.out.println("Maaf saldo anda tidak cukup.");
                        keluar();//memanggil method keluar
                    }else{
                        N++;//tambah variable N dengan 1
                        driverBf(m,n, 0.0);//memanggil method driverBf dengan masukan
                        keluar();//memanggil method keluar
                    }
                }
            break;//selesai
        }
    }
    public static void  bayarBr(){//membuat method dengan nama bayarBr bertip void
        Scanner tampung=new Scanner(System.in);
        System.out.print("Pilih metode bayar : ");
        pilih=tampung.next();//membaca dan menyimpan input
        if("cash".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah cash
            N++;//tambah variable N dengan 1
            driverBr(N);//memanggil method driverBr dengan masukan N
            alamat(tujuan, sekarang);//memanggil method alamat dengan masukan
            keluar();//memanggil method keluar
            }else if("bekpay".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah bekpay
            if(Bekpay<harga){//jika bekpay kurang dari harga
                System.out.println("Maaf saldo anda tidak cukup.");
                keluar();//memanggil method keluar
            }else{//jika tidak
                N--;//kurangi variable N dengan 1
                driverBr(N);//memanggil method driverBr dengan masukan N
                alamat(tujuan, sekarang);//memanggil method alamat dengan masukan
                keluar();//memanggil method keluar
            }
        }
    }
    public static int hitungBekfood(int m,int l){//membuat method bertipe int dengan nama hitungBekfood dengan masukan bertipe int dengan nama m dan l
        int hitungBf=m*l;//meghitung hasil dari m dikali l dan disiman ke hitungBf
        return hitungBf;//mengembalikan nilai hitungBf
    }
    public static void pesan(){//membuat method bertipe void dengan nama pesan
        Scanner tampung=new Scanner(System.in);
        System.out.println("Harga total : "+totalBf);
        System.out.println("Mau pesan yang lain?[ya/tidak]");
        pilih=tampung.next();//membaca dan menyimpan input
        if("ya".equalsIgnoreCase(pilih)){//jika isi variable pilih adalah ya
            lagi=true;//ubah nilai boolean lagi ke true
        }else if("tidak".equalsIgnoreCase(pilih)){//ataub jika berisi tidak
            lagi=false;//mengubah nilai boolean lagi menjafdi false
            N++;//menambah nilai N dengan 1
            bayarBf(N, km);//memanggil method bayarBf dengan masukan
        }
    }
    public static void banyak(int m){//membuat method dengan nama banyak yang bertipe void dengan masukan bertipe int m
        Scanner tampung=new Scanner(System.in);
        System.out.println("Berapa banyak yang mau anda beli ?\t");
        int z=tampung.nextInt();//membaca dan menyimpan input
        totalBf+=hitungBekfood(z, m);//menambahkan variable totalBf denga hasil method hitungBekfood dengan masukan z dan m
        pesan();//memanggil method pesan
    }
}
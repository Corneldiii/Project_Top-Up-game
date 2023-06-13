package pbo;
import javax.swing.JOptionPane;
public class MainDealer {
    public static void main(String[] args){

        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan banyak mobil"));
        DaftarMobil[] dftr=new DaftarMobil[n];

        for (int i = 0; i < dftr.length; i++) {
            String merk=JOptionPane.showInputDialog(null,"Masukan Merk mobil "+(i+1));
            String warna=JOptionPane.showInputDialog(null,"Masukan Warna "+(i+1));
            String pemilik=JOptionPane.showInputDialog(null,"Masukan nama pemilik "+(i+1));
            String npwp=JOptionPane.showInputDialog(null, "Masukan NPWP "+(i+1)) ;
            
            dftr[i]=new DaftarMobil(warna,merk);
            dftr[i].setNPWP(npwp);
            dftr[i].setPemilik(pemilik);
        }

        Dealer data=new Dealer("Cahyo dealer","JL.sama aku yuk");
        data.setDftr(dftr);

        DaftarMobil baru=new DaftarMobil("abu abu", "Honda CRV");
        baru.setNPWP("224313");
        baru.setPemilik("Agus");
        data.addMobil((n-1), baru);

        DaftarMobil[] tampung=data.getDftr();
        System.out.println("DATA MOBIL YANG DIJUAL");
        data.cetakMobil(tampung);
        System.out.println("MOBIL YANG DIJUAL DENGAN WARNA ABU ABU");
        data.cariAbu(tampung);
        
        String cariData=JOptionPane.showInputDialog(null,"Merk yang di cari");
        for(int i=0;i<dftr.length;i++){
            if(tampung[i].getMerk().equalsIgnoreCase(cariData)){
                System.out.println("DATA LENGKAP KENDARAAN: ");
                System.out.println("Merk        : "+tampung[i].getMerk());
                System.out.println("Warna       : "+tampung[i].getWarna());
                System.out.println("Nama Dealer : "+data.getNamaDealer());
                System.out.println("Pemilik     : "+tampung[i].getPemilik());
                System.out.println("Alamat      : "+data.getAlamat());
                System.out.println("NPWP        : "+tampung[i].getNPWP());
            }
        }

        String cariWarna=JOptionPane.showInputDialog(null,"Warna yang dicari");
        System.out.println("Jumlah mobil berwarna "+cariWarna+"   : "+data.hitungWarna(tampung, cariWarna));
        
        
    }
}

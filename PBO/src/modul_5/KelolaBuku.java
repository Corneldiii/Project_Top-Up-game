package modul_5;
import javax.swing.JOptionPane;
public class KelolaBuku {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah buku"));
        DataBuku[] Buku=new DataBuku[n];
        
        for (int i = 0; i < Buku.length; i++) {
            String judul=JOptionPane.showInputDialog(null,"Judul buku");
            String kode=JOptionPane.showInputDialog(null,"kode buku");
            String penerbit=JOptionPane.showInputDialog(null,"penerbit buku");
            int tahunTerbit=Integer.parseInt(JOptionPane.showInputDialog(null,"Tahun terbit buku"));
            int jumpe=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah pengarang"));
            DataPengarang[] pengarang=new DataPengarang[jumpe];
            for (int j = 0; j < pengarang.length; j++) {
                String nama=JOptionPane.showInputDialog(null,"Nama pengarang");
                String alamat=JOptionPane.showInputDialog(null,"Alamat pengarang");
                String NIK=JOptionPane.showInputDialog(null,"NIK pengarang");
                DataPengarang daftarPengarang=new DataPengarang(nama,alamat,NIK);
                pengarang[j]=daftarPengarang;
            }

            
            Buku[i]=new DataBuku();
            Buku[i].setJudul(judul);
            Buku[i].setKode(kode);

            Buku[i].setPenerbit(penerbit);
            Buku[i].setTahunTerbit(tahunTerbit);
            
            Buku[i].setDataPengarang(pengarang);
        }

        for (int i = 0; i < Buku.length; i++) {
            System.out.println("Buku " + (i+1));
            System.out.println("Kode buku: " + Buku[i].getKode());
            System.out.println("Judul buku: " + Buku[i].getJudul());
            System.out.println("Tahun terbit: " + Buku[i].getTahunTerbit());
            System.out.println("Daftar pengarang:");
            DataPengarang[] pengarangBuku = Buku[i].getDataPengarang();
            for (int j = 0; j < pengarangBuku.length; j++) {
                System.out.println((j+1)+". "+pengarangBuku[j].getNama());
            }
        }


    }
}


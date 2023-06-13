package modul_9;

public class MainHewan {
    public static void main(String[] args) {
        Hewan kewan;//mendeklarasi variable kewan bertipe hewan
        kewan=new Anjing();//mengubah variable kewan menjadi objek dari kelas Anjing()
        System.out.println("Nama hewan : "+kewan.namaHewan());//memanggil method namaHewan() untuk melihat nama hewan
        kewan.suara();//memanggil method untuk menunjukan suara dari hewan tersebut

        kewan=new Kucing();//mengubah variable kewan menjadi objek dari kelas Kucing()
        System.out.println("Nama hewan : "+kewan.namaHewan());
        kewan.suara();//memanggil method untuk menunjukan suara dari hewan tersebut

        kewan=new Dino();//mengubah variable kewan menjadi objek dari kelas Dino()
        System.out.println("Nama hewan : "+kewan.namaHewan());
        kewan.suara();//memanggil method untuk menunjukan suara dari hewan tersebut

        kewan=new Bebek();//mengubah variable kewan menjadi objek dari kelas Bebek()
        System.out.println("Nama hewan : "+kewan.namaHewan());
        kewan.suara();//memanggil method untuk menunjukan suara dari hewan tersebut

    }
}

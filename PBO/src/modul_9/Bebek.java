package modul_9;

public class Bebek extends Hewan{//meminta turunan untuk class anjing dari supperclass Hewan
    @Override//menandakan bahwa method dibawahnya akan menggantikan method yang sama pada class induk
    void suara(){// mengubah isi method suara yang sudah di override
        System.out.println("Suaranya : Kwek kwek");
    }
    @Override//menandakan method dibawahnya untuk menggantikan method yang sama pada class induk
    String namaHewan(){// mengubah isi method namaHewan yang sudah di override
        return "Bebek";
    }
}

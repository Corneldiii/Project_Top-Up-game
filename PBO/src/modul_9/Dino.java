package modul_9;

public class Dino extends Hewan {//meminta turunan untuk class anjing dari supperclass Hewan
    @Override//menandakan method dibawahnya untuk menggantikan method yang sama pada class induk
    void suara() {// mengubah isi method suara yang sudah di override
        System.out.println("Suaranya : Rawrrr rawrrr");
    }
    @Override//menandakan method dibawahnya untuk menggantikan method yang sama pada class induk
    String namaHewan(){// mengubah isi method namaHewan yang sudah di override
        return "Dino";
    }
}

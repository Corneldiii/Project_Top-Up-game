package modul_9;

public class Anjing extends Hewan {// meminta turunan untuk class anjing dari supperclass Hewan
    @Override // menandakan bahwa method dibawahnya akan menggantikan method yang sama pada
              // class induk
    void suara() {// mengubah isi method suara yang sudah di override
        System.out.println("Suaranya : Guk Guk ");
    }

    @Override // menandakan bahwa method dibawahnya akan menggantikan method yang sama pada
              // class induk
    String namaHewan() {// mengubah isi method namaHewan yang sudah di override
        return "Anjing";
    }
}

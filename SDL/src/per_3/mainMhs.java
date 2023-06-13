package per_3;


public class mainMhs {
    public static void main(String[] args) {
        Mahasiswa [] data= new Mahasiswa[5];

        data[0] = new Mahasiswa(12,"Ahay");
        data[1]=new Mahasiswa(11, "aldi");
        data[2]=new Mahasiswa(15, "ucup");
        data[3]=new Mahasiswa(17, "wedy");
        data[4]=new Mahasiswa(19, "abdul");

        

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }

        Object key= new Mahasiswa(12, "aldi");
        int cari=staticLarik2.sequentialSearch(data,key);

        if(cari>-1){
            System.out.println("Data ditemukan");
            System.out.println("di indeks : "+cari);
        }else{
            System.out.println("Data tidak ditemukan");
        }

    }
}

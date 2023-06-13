package Modul_6;
public class KumpulanSegitiga{
    private int jumlahSegitiga;
    private Segitiga[] daftarSegitiga;

    KumpulanSegitiga(){}

    public int getJumlahSegitiga() {
        return jumlahSegitiga;
    }

    public void setJumlahSegitiga(int jumlahSegitiga) {
        this.jumlahSegitiga = jumlahSegitiga;
    }

    public Segitiga[] getDaftarSegitiga() {
        return daftarSegitiga;
    }

    public void setDaftarSegitiga(Segitiga[] daftar) {
        this.daftarSegitiga = daftar;
    }

    public double rataRata(Segitiga[] daftar){
        double jumlah=0;
        for (int i = 0; i < daftar.length; i++) {
            jumlah+=daftar[i].hitungLuas();
        }
        return jumlah/daftar.length;
    }
    public void Terluas(Segitiga[] arr){
        double max=arr[0].hitungLuas();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].hitungLuas()>max){
                max=arr[i].hitungLuas();
                index=i;
            }
        }
        System.out.println("Segitiga dengan luas terbesar  memiliki titik ("+arr[index].getX1()+","+arr[index].getY1()+") ("+arr[index].getX2()+","+arr[index].getY2()+") dan ("+arr[index].getX3()+","+arr[index].getY3()+") memiliki luas  : "+max);
    }

    public void terkecil(Segitiga[] arr){
        double min=arr[0].hitungLuas();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i].hitungLuas()<min){
                min=arr[i].hitungLuas();
                index=i;
            }
        }
        System.out.println("Segitiga terkecil  memiliki titik ("+arr[index].getX1()+","+arr[index].getY1()+") ("+arr[index].getX2()+","+arr[index].getY2()+") dan ("+arr[index].getX3()+","+arr[index].getY3()+") memiliki luas  : "+min);

    }

}
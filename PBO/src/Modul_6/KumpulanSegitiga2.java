package Modul_6;

public class KumpulanSegitiga2 {
    private Titik titikA,titikB,titikC;
    private double sisiA,sisiB,sisiC;
    private KumpulanSegitiga2[] daftar;
    
    KumpulanSegitiga2(){}

    public void Segitiga2 (Titik satu,Titik dua,Titik tiga){
        this.titikA=satu;
        this.titikB=dua;
        this.titikC=tiga;
    }
    public KumpulanSegitiga2[] getDaftar() {
        return daftar;
    }

    public void setDaftar(KumpulanSegitiga2[] daftar) {
        this.daftar = daftar;
    }

    public double hitungSisi(Titik A,Titik B){
        int x1,x2,y1,y2;
        
        x1=A.getX(); y1=A.getY();
        x2=B.getX(); y2=B.getY();
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2));
    }
    public double hitungKeliling(){
        double sisiA = hitungSisi(titikA, titikB);
        double sisiB = hitungSisi(titikA, titikC);
        double sisiC = hitungSisi(titikB, titikC);
        return (sisiA + sisiB +sisiC);
    }
    public double hitungLuas(){
        double s = hitungKeliling()/2;
        
        return Math.sqrt(s * (s-sisiA) * (s-sisiB) * (s-sisiC));
    }

    public double rataRata(KumpulanSegitiga2[] daftar){
        double jumlah=0;
        for (int i = 0; i < daftar.length; i++) {
            jumlah+=daftar[i].hitungLuas();
        }
        return jumlah/daftar.length;
    }
    public void Terluas(KumpulanSegitiga2[] arr){
        double max=arr[0].hitungLuas();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].hitungLuas()>max){
                max=arr[i].hitungLuas();
                index=i;
            }
        }
        System.out.println("Segitiga dengan luas terbesar  memiliki titik A "+arr[index].titikA.getX()+","+arr[index].titikA.getY()+", Titik B "+arr[index].titikB.getX()+","+arr[index].titikB.getY()+", Titik c "+arr[index].titikC.getX()+","+arr[index].titikC.getY()+"  memiliki luas  : "+max);
    }

    public void terkecil(KumpulanSegitiga2[] arr){
        double min=arr[0].hitungLuas();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i].hitungLuas()<min){
                min=arr[i].hitungLuas();
                index=i;
            }
        }
        System.out.println("Segitiga terkecil  memiliki titik A "+arr[index].titikA.getX()+","+arr[index].titikA.getY()+", Titik B "+arr[index].titikB.getX()+","+arr[index].titikB.getY()+", Titik c "+arr[index].titikC.getX()+","+arr[index].titikC.getY()+"  memiliki luas  : "+min);

    }
}

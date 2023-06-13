package Bab6;
public class No3B_modul6 {
    public static void main(String[] args){
        double suku=0,akhir=10;//meminta tempat pada double dengan nama suku yang berisi angka 0 dan akhir yang berisi angka 10
        double angka=-1,per,totalAngka=0,totalPer=0;//meminta tempat pada double dengan nama angka yang berisi negatif 1,per yang berisi 1,totalAngka dan totalPer yang masing masing berisi 0
        double X1,X2,FX1=0,FX2=0;//meminta tempat pada double dengan nama X1,X2,FX1,FX2
         X1=1.5;//mengisi variable X1 deengan 1.5
         X2=2.75;//mengii variable X2 dengan 2.75
         
         while(suku<akhir){//selama isi variable suku lebih kecil dari isi variable akhir program akan terus berjalan
             suku++;//menambahkan isi variable suku dengan +1
             angka=angka+2;//mengisi variable angka dengan isi variabvle itu sendiri dan ditambah dengan +2
             per=1/angka;//mengisi variable per dengan hasil dari 1 dibagi dengan isi variable angka
             System.out.println(per);//mencetak isi variable per
             System.out.println("angka "+angka);//menetak tulisan angka dan diteruskan dengan mencetak isi variable angka
             totalAngka=totalAngka+angka;//mengisi variable totalAngka dengan hasil penjumlahan isi variable total dengan angka
             totalPer=totalPer+per;//mengisi variable totalPer dengan hasil penjumlahan dari isi variable totalPer sendiri dengan per
             FX1=1.0/2.0- 2.0/Math.PI*(totalPer*Math.sin(angka*X1));//mengisi variable FX1 dengan hasil perhitunggan dari 1.0/2.0- 2.0/Math.PI*(totalPer*Math.sin(angka*X1))
             FX2=1.0/2.0- 2.0/Math.PI*(totalPer*Math.sin(angka*X2));//mengisi variable FX2 dengan hasil perhitungan dari 1.0/2.0- 2.0/Math.PI*(totalPer*Math.sin(angka*X2))
         }
             
             System.out.println("total per : "+totalPer);//mencetak tulisan total per : lalu dilanjutkan dengan mencetak isi variable totalPer
             System.out.println("total angka : "+totalAngka);//mencetak tulisan total angka : lalu dilanjutkan dengan mencetak isi variable totalAngka
             System.out.println("Fungsi X = "+X1+" : "+FX1);//mencetak tulisa fungsi X = lalu mencetak isi variable X1  : dan mencetak isi variable FX1
             System.out.println("Fungsi X = "+X2+" : "+FX2);//mencetak tulisan fungsi X = lalu mencetak isi variable X2 : dan mencetak isi variable FX2
         
    }
}

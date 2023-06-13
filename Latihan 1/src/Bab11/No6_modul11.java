/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab11;

/**
 *
 * @author LENOVO
 */
public class No6_modul11 {
    public static void main(String[] args) {
        int[] bil={23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};//meminta array bertipe int dengan nama bil yang berisi {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21}
        int[] genap=new int[7];//meminta array bertipe int dengan nama genap sebanyak 7
        int[] ganjil=new int[6];//meminta array bertipe int dengan nama ganjil sebanyak 6
        int simpan,a=0,b=0;//meminta tempat pada int dengan nama a,b yang masing masing berisi 0 dan simpan
        for(int i=0;i<bil.length;i++){//perulangan i yang berisi 0 dengan kondisi i kurang dari panjang array bil,i ditambah 1
            int nilai=bil[i]%2;//hitung array bil ke i dibagi habis dengan 2
            if(nilai==0){//jika nilai sama dengan 0
                    genap[a++]=bil[i];//masukan nilai array ke i ke array genap ke a
            }else if(nilai==1){//atau jika nilai ==1
                    ganjil[b++]=bil[i];//masukan nilai array bil ke i ke array ganjil ke b
            }
        }
        System.out.println("Genap : ");//mencetak "Genap : "
        for(int j=0;j<genap.length;j++)System.out.print(genap[j]+" ");//mencetak isi array genap dengan perulangan
        System.out.println("");
        System.out.println("Ganjil : ");//mencetak "Ganjil : "
        for(int k=0;k<ganjil.length;k++)System.out.print(ganjil[k]+" ");//mencetak isi array ganjil dengan perulangan
        
    }
}

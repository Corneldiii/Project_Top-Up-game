/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab11;

/**
 *
 * @author LENOVO
 */
public class No5_modul11 {
    public static void main(String[] args) {
        int n=0,m=0;//meminta tempat pada int dengan nama n,m yang masing masing berisi 0
        int[] usia1={18, 39, 45, 50, 65, 70, 90 };//meminta array bertipe int dengan nama usia1 yang berisi {18, 39, 45, 50, 65, 70, 90 }
        int[] usia2={20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96 };//meminta array bertipe int dengan nama usia2 yang bersi {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96 }
        int[] usiaGabung=new int[usia1.length+usia2.length];//meminta array bertipe int dengan nama usiaGabung sebanyak jumlah array usia1 dan usia2 ditambah
        
        for (int c = 0; c < usiaGabung.length; c++) {//untuk perulangan c dengan isi 0,dengan kondisi c kurang dari banyak array usiaGabung, c ditambah 1
            if (n<usia1.length && m < usia2.length) {//jika n kurang dari banyak array usia1 dan m kurang dari banyak array usia2
                if(usia1[n]<=usia2[m]){//jika usia1[n] kurang dari sama dengan usia2[m] maka
                    usiaGabung[c]=usia1[n];//masukan isi array usia1[n] ke usiaGabung[c] 
                    n++;//n ditambah 1
                }else if(usia2[m]<=usia1[n]){//jika usia2[m] kurang dari sama dengan usia1[n] maka
                    usiaGabung[c]=usia2[m];//masukan isi array usia2[m] ke usiaGabung[c] 
                    m++;//m ditambah 1
                }
            }else{//jika tidak
                usiaGabung[c]=usia2[m];//masukan isi array usia2[m] ke usiaGabung[c] 
                m++;//m ditambah 1
            }
        }
        System.out.print("Usia Gabungan : ");//mencetak Usia Gabungan : 
        for (int i = 0; i < usiaGabung.length; i++) {//unutk perulangan i yang berisi 0 dengan kondisi i kurang dari jumlah array usiaGabung, i ditambah 1
            System.out.print(usiaGabung[i]+",");//mencetak usiaGabung[i]+","
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9;

/**
 *
 * @author LENOVO
 */
public class No3_modul9 {
    public static void main(String[] args) {
        //memulai perulangan untuk variable jam
        for(int jam=1;jam<=5;jam++){//untuk perulangan jam sama dengan 1,dengan kondisi jam kurang dari sama dengan 5 dan unutk setiap perulangan isi variable jamn ditambah 1
            System.out.print("jam : ");//mencetak "jam : "
            System.out.println(jam);//mencetak isi variable jam
            //memulai perulangan untuk variable menit
            for(int menit=1;menit<60;menit++){//unutk perulangan menit yang berisi 1 dengan kondisi menit kurang dari sama dengan 60 dan unutk setiap perulangan isi variable menit ditambah 1
                System.out.print("Menit : ");//mencetak "menit : "
                System.out.println(menit);//mencetak isi variable menit
                System.out.print("detik : ");//mencetak "detik : "
                //memulai perulangan unutk variable detik
                for(int detik=1;detik<=60;detik++){//untuk perulangan detik yang berisi 1 dengan kondisi detik lebih kecil sama dengan 60 dan untuk setiap perulangan isi variable detik ditambah 1
                    
                    System.out.print(detik+" ");//mencetak isi variable detik 
                    
                }
                System.out.println("");
            }
        }
    }
}

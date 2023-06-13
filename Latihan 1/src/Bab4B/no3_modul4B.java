/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4B;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class no3_modul4B {
    public static void main(String[] args){
        Scanner tampung=new Scanner(System.in);
        int januari,februari,maret,april,mei,juni,juli,agustus,september,oktober,november,desember;
        int bulan,tanggal;
        String nama,alamat;
        
        
        januari=1;
        februari=2;
        maret=3;
        april=4;
        mei=5;
        juni=6;
        juli=7;
        agustus=8;
        september=9;
        oktober=10;
        november=11;
        desember=12;
        
        System.out.print("Nama                          : ");
        nama=tampung.nextLine();
        System.out.print("Alamat                        : ");
        alamat=tampung.nextLine();
        System.out.print("Bulan anda lahir              : ");
        bulan=tampung.nextInt();
        System.out.print("Tanggal berapa anda lahir     : ");
        tanggal=tampung.nextInt();
        
        if (bulan==1 && 20<=tanggal && tanggal<=31 || bulan == 2 && 1<= tanggal && tanggal<=18){
            System.out.println("Bintang anda adalah : Aquarius");
            System.out.println("Sifat anda          : emosional dan sentimental dalam perasaan, tetapi mereka tidak suka mengungkapkannya secara terbuka. Ketika mereka merasa terlalu emosional, mereka akan mengasingkan diri dan lebih suka berdiam diri sendiri.");
        }else if(bulan==2 && 19<=tanggal && tanggal <= 28 || bulan==3 &&  1<= tanggal && tanggal <=20){
            System.out.println("Bintang anda adalah : Pisces");
            System.out.println("Sifat anda          : belas kasih yang mereka miliki. Kebaikan dan kasih sayang adalah dua hal terpenting dalam diri Pisces. Hati mereka selalu penuh cinta, dan itulah mengapa mereka memiliki banyak cinta untuk ditebar.");
        }else if(bulan==3 && 21<=tanggal && tanggal <=31 || bulan==4 && 1<=tanggal && tanggal<=19){
            System.out.println("Bintang anda adalah : Aries");
            System.out.println("Sifat anda          :  sosok yang sangat penuh percaya diri. Kepercayaan dirinya amatlah tinggi sehingga mampu menjadi seorang pemimpin yang bisa diandalkan. Di sisi lain, Aries juga punya sifat kompetitif sehingga sangat menyukai tantangan");
        }else if(bulan==4 && 20<=tanggal && tanggal <=30 || bulan==5 && 1<=tanggal && tanggal<=20){
            System.out.println("Bintang anda adalah : Taurus");
            System.out.println("Sifat anda          : seseorang yang berada di bawah naungan zodiak Taurus adalah orang yang memiliki kepribadian setia, dapat diandalkan, lembut, penyayang, serta murah hati. Selain itu, Taurus adalah seseorang yang dikenal sabar, sangat bersahabat, dan mandiri");
        }else if(bulan==5 && 21<=tanggal && tanggal <=31 || bulan==6 && 1<=tanggal && tanggal<=20){
            System.out.println("Bintang anda adalah : Gemini");
            System.out.println("Sifat anda          : karakter zodiak yang santai dan mudah menyesuaikan dengan lingkungan baru. Mereka bersedia mencoba apa pun setidaknya satu kali, jadi jangan sembarangan menantangnya atau Anda akan kewalahan sendiri.");
        }else if(bulan==6 && 21<=tanggal && tanggal <=30 || bulan==7 && 1<=tanggal && tanggal<=22){
            System.out.println("Bintang anda adalah : Cancer");
            System.out.println("Sifat anda          : penyayang dan bersemangat dan sangat peduli tentang masalah keluarga dan rumah mereka. Cancer bersimpati dan melekat pada orang-orang yang mereka dekati. Beberapa karakteristik Cancer lainnya termasuk kesetiaan dan kemampuan untuk berempati dengan rasa sakit dan penderitaan orang lain.");
        }else if(bulan==7 && 23<=tanggal && tanggal <=31 || bulan==8 && 1<=tanggal && tanggal<=22){
            System.out.println("Bintang anda adalah : Leo");
            System.out.println("Sifat anda          : merupakan sosok yang loyal, humoris, total melakukan sesuatu, punya jiwa kepemimpinan, dan optimistis. Leo juga dikenal dengan sifatnya yang terbuka sehingga memudahkan mereka ketika membangun pertemanan.");
        }else if(bulan==8 && 23<=tanggal && tanggal <=31 || bulan==9 && 1<=tanggal && tanggal<=22){
            System.out.println("Bintang anda adalah : Virgo");
            System.out.println("Sifat anda          :sebagai zodiak yang rendah hati, sederhana, dan sangat setia. Mereka memiliki rasa tanggung jawab yang kuat dan percaya dalam membantu orang-orang yang ada di sekitar mereka.");
        }else if(bulan==9 && 23<=tanggal && tanggal <=30 || bulan==10 && 1<=tanggal && tanggal<=22){
            System.out.println("Bintang anda adalah : Libra");
            System.out.println("Sifat anda          : ciri kepribadian Libra yang paling menonjol adalah sifatnya yang sangat pemaaf. Bahkan jika Anda melakukan kesalahan besar, mereka dengan tulus akan memaafkan Anda. Mereka sangat percaya pada pengampunan, maka dari itu mereka tidak menyimpan dendam terlalu lama.");
        }else if(bulan==10 && 23<=tanggal && tanggal <=31 || bulan==11 && 1<=tanggal && tanggal<=21){
            System.out.println("Bintang anda adalah : Scorpio");
            System.out.println("Sifat anda          :  orang yang sangat bersemangat dan intens di antara semua tanda zodiak lainnya. Mereka memiliki kemampuan luar biasa untuk membuat orang di sekeliling mereka merasa hidup dan energik setiap kali bersama Scorpio");
        }else if(bulan==11 && 22<=tanggal && tanggal <=30 || bulan==12 && 1<=tanggal && tanggal<=21){
            System.out.println("Bintang anda adalah : Sagitarius");
            System.out.println("Sifat anda          : kepribadian Sagitarius yang paling menonjol adalah mereka sangat optimis, dari dalam maupun luar diri mereka. Mereka selalu melihat segala sesuatu dari sudut pandang optimis, dan tidak pernah gagal untuk bermimpi besar.");
        }
       
    }
}

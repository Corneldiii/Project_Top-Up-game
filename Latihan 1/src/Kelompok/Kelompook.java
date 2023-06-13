package Kelompok;
import java.util.Scanner;
public class Kelompook {
    public static void main(String[] args){
        Scanner Tampung=new Scanner(System.in);
        double gaji,TK,TF,TS,THR,honor,honor2,masuk;
        double gaji2,TK2,TF2,TS2;
        double gaji3,TK3,TF3,TS3;
        double gaji4,TK4,TF4,TS4;
        double gaji5,TK5,TS5;

        double Hitung,Yadapen,yayasan,yayasan2;
        String nama,status,golongan;
        System.out.print("Masukan nama anda : ");
        nama=Tampung.nextLine();
        System.out.print("Masukan status anda : ");
        status=Tampung.nextLine();
       
        
        
                if(status.equals("dosen")){//jika status terisi kata dosen maka melaksanakan bawahnya
                System.out.print("Masukan golongan anda : ");
                golongan=Tampung.nextLine();
                if (golongan.equals("PNS")) {//jika golongan terisi PNS maka akan melaksanakan perintah dibawahnya
                System.out.print("Masukan Gaji pokok anda         : Rp.");//meminta inputGaji pokok pada user
                gaji=Tampung.nextDouble();//dibaca dan disimpan ke gaji pada memori tampung pada scanner
                System.out.print("Masukan tunjangan keluarga      : Rp.");//meminta iinput tunjangan keluarga pada user
                TK=Tampung.nextDouble();//dibaca dan disimpan ke YK pada memori  tampung pada class scanner
                System.out.print("Masukan tunjangan fungsional    : Rp.");
                TF=Tampung.nextDouble();
                System.out.print("Masukan tunjangan struktural    : Rp.");
                TS=Tampung.nextDouble();
                System.out.print("Masukan THR PNS                 : Rp.");
                THR=Tampung.nextDouble();
                Hitung=gaji+TK+TF+TS-THR;
                System.out.println("THR yang anda dapatkan sebesar  : Rp."+Hitung);
                
                }
                else if (golongan.equals("Tetap")){
                    System.out.print("Masukan Gaji pokok anda         : Rp.");
                    gaji2=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan keluarga      : Rp.");
                    TK2=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan fungsional    : Rp.");
                    TF2=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan struktural    : Rp.");
                    TS2=Tampung.nextDouble();
                    Hitung=gaji2+TK2+TF2+TS2;
                    System.out.print("THR yang anda dapatkan sebesar  : Rp."+Hitung);
                }
                    
                else if (golongan.equals("Calon")){
                        System.out.print("Masukan Gaji pokok anda         : Rp.");
                        gaji3=Tampung.nextDouble();
                        System.out.print("Masukan tunjangan keluarga      : Rp.");
                        TK3=Tampung.nextDouble();
                        System.out.print("Masukan tunjangan fungsional    : Rp.");
                        TF3=Tampung.nextDouble();
                        System.out.print("Masukan tunjangan struktural    : Rp.");
                        TS3=Tampung.nextDouble();
                        Hitung=0.8*gaji3+TK3+TF3+TS3;
                        System.out.println("THR yang anda dapatkan sebesar  : Rp."+Hitung);
                }
                else if(golongan.equals("Kontrak")){
                            System.out.print("Masukan Honor kontrak 1 bulan");
                            honor=Tampung.nextDouble();
                            if(honor>2000000){
                                System.out.println("THR yang anda dapatkan sebesar  : Rp.2000000");
                            }else{
                                System.out.println("THR yang anda dapatkan sebesar  : "+honor);
                            }
                }
                
                }else if(status.equals("tenaga pendidikan")){
                    System.out.println("Golongan anda adalah    : ");
                    golongan=Tampung.nextLine();
                    
                    if(golongan.equals("Tetap")){
                        System.out.print("Masukan Gaji pokok anda         : Rp.");
                    gaji4=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan keluarga      : Rp.");
                    TK4=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan fungsional    : Rp.");
                    TF4=Tampung.nextDouble();
                    System.out.print("Masukan tunjangan struktural    : Rp.");
                    TS4=Tampung.nextDouble();
                    Hitung=gaji4+TK4+TF4+TS4;
                       System.out.println("Maka THR yang anda dapatkan sebesar  : Rp."+Hitung);
                    }
                    else if (golongan.equals("Calon")){
                        System.out.print("Masukan Gaji pokok anda         : Rp.");
                        gaji5=Tampung.nextDouble();
                        System.out.print("Masukan tunjangan keluarga      : Rp.");
                        TK5=Tampung.nextDouble();
                        System.out.print("Masukan tunjangan struktural    : Rp.");
                        TS5=Tampung.nextDouble();
                        Hitung=(0.8*gaji5)+TK5+TS5;
                        System.out.println("Maka THR yang anda dapatkan sebesar : Rp."+Hitung);
                    }
                    else if(golongan.equals("Kontrak")){
                        System.out.print("Masukan Honor kontrak 1 bulan");
                            honor2=Tampung.nextDouble();
                            if(honor2>2000000){
                                System.out.println("THR yang anda dapatkan sebesar  : Rp.2000000");
                            }else{
                                System.out.println("THR yang anda dapatkan sebesar  : "+honor2);
                            }
                    }
                    else if(golongan.equals("Harian")){
                            System.out.print("Berapa hari masuk  : ");
                            masuk=Tampung.nextDouble();
                            Hitung= 60000*masuk;
                            System.out.println("Maka THR yang anda dapatkan sebesar    : Rp."+Hitung);

                    }
            
        
                
                
            }    
            
    
        
    }   
}
        
    

        

package project;

import java.util.Scanner;

public class mainTopUp {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        int n = 1;
        int c=0;
        int x = 0;
        int lanjutan=-1;
        int alfPoint=0;
        double disc = 0;
        double total = 0;
        double dsc = 0;
        boolean keluar = true;
        TopUp byr;
        Akun[]  pengunaAkun=new Akun[100];
        while (keluar) {
            System.out.println("");
            System.out.println("");
            System.out.println("===================Ucup Top Up======================");
            System.out.printf("%-12s%-12s%-14s%-12s", "(1)", "(2)", "(3)", "(4)");
            System.out.printf("\n%-11s%-11s%-15s%-11s", "Top Up", "Riwayat", "Daftar Game", "Keluar");
            System.out.println("\n====================================================");
            System.out.print("Pilih : ");
            int menu = tampung.nextInt();
            if (menu == 1) {
                System.out.println("");
                System.out.print("Mau berapa kali TopUp deck : ");
                x = tampung.nextInt();
                System.out.println("");
                boolean topup = true;
                for (int i = 0; i < x; i++) {
                    lanjutan++;
                    System.out.println("===================Ucup Top Up======================");
                    System.out.printf("%-12s%-12s%-14s%-12s", "(1)", "(2)", "(3)", "(4)");
                    System.out.printf("\n%-11s%-11s%-13s%-11s", "FF MAX", "PUBG", "Valorant", "Mobile Legends");
                    System.out.println("\n====================================================");
                    System.out.print("Pilih : ");
                    int pilih = tampung.nextInt();

                    if (pilih == 1) {
                        tampung.nextLine();
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("===================Free Fire MAX======================");
                        System.out.printf("%-12s%-12s%-14s%-12s", "(1)", "(2)", "(3)", "(4)");
                        System.out.printf("\n%-11s%-11s%-13s%-11s", "70Dm", "1450Dm", "3640Dm", "36500Dm");
                        System.out.println("\nHarga : 1Dm = Rp.200,00");
                        System.out.println("\n====================================================");
                        System.out.print("Masukan ID          : \t");
                        String id = tampung.nextLine();
                        System.out.print("Masukan UserName    : ");
                        String un = tampung.nextLine();
                        System.out.print("Masukan Email     : ");
                        String email = tampung.next();
                        System.out.println("====================================================");
                        System.out.print("Pilih banyak Diamon : ");
                        int pilDm = tampung.nextInt();
                        System.out.print("Hadiah kejutan (YA/TIDAK) : ");
                        String kejutan = tampung.next();
                        pengunaAkun[lanjutan]=new epepMax();
                        epepMax tmp = (epepMax)pengunaAkun[lanjutan];
                        tmp.setID(id);
                        tmp.setUserName(un);
                        tmp.setEmail(email);
                        if (pilDm == 1) {
                            tmp.setJumlah(70);
                        } else if (pilDm == 2) {
                            tmp.setJumlah(1450);
                        } else if (pilDm == 3) {
                            tmp.setJumlah(3640);
                        } else if (pilDm == 4) {
                            tmp.setJumlah(36500);
                        } else {
                            System.out.println("Wrong Input");
                        }
                        if (kejutan.equalsIgnoreCase("YA")) {
                            disc = tmp.Kejutan();
                        }
                        
                    } else if (pilih == 2) {
                        tampung.nextLine();
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("===================PUBG==================================");
                        System.out.printf("%-12s%-12s%-12s%-11s%-12s", "(1)", "(2)", "(3)", "(4)", "(5)");
                        System.out.printf("\n%-11s%-11s%-13s%-11s%-11s", "70Uc", "250Uc", "1250Uc", "5000Uc", "Custom");
                        System.out.println("\nHarga : 1Uc = Rp.200,00");
                        System.out.println("\n========================================================");
                        System.out.print("Masukan ID          : \t");
                        String id = tampung.nextLine();
                        System.out.print("Masukan UserName    : ");
                        String un = tampung.nextLine();
                        System.out.print("Masukan Email     : ");
                        String email = tampung.next();
                        System.out.println("====================================================");
                        System.out.print("Pilih banyak Uc : ");
                        int pilUc = tampung.nextInt();
                        pengunaAkun[lanjutan] = new Pubg();
                        Pubg tmp = (Pubg) pengunaAkun[lanjutan];
                        tmp.setID(id);
                        tmp.setUserName(un);
                        tmp.setEmail(email);
                        if (pilUc == 1) {
                            tmp.setJumlah(70);
                        } else if (pilUc == 2) {
                            tmp.setJumlah(250);
                        } else if (pilUc == 3) {
                            tmp.setJumlah(1250);
                        } else if (pilUc == 4) {
                            tmp.setJumlah(5000);
                        } else if (pilUc == 5) {
                            System.out.print("Banyak UC   : ");
                            int bnyk = tampung.nextInt();
                            tmp.setJumlah(bnyk);
                        } else {
                            System.out.println("Wrong Input");
                        }

                    } else if (pilih == 3) {
                        tampung.nextLine();
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("===================Valorant======================");
                        System.out.printf("%-12s%-12s%-11s%-12s%-11s", "(1)", "(2)", "(3)", "(4)", "(5)");
                        System.out.printf("\n%-11s%-11s%-13s%-11s%-11s", "420Vp", "1375Vp", "4000Vp", "8150Vp",
                                "Bandel");
                        System.out.println("\nHarga : 1Dm = Rp.114,00");
                        System.out.println("\n====================================================");
                        System.out.print("Masukan ID          : \t");
                        String id = tampung.nextLine();
                        System.out.print("Masukan UserName    : ");
                        String un = tampung.nextLine();
                        System.out.print("Masukan Email     : ");
                        String email = tampung.next();
                        System.out.println("====================================================");
                        System.out.print("Pilih : ");
                        int pilVp = tampung.nextInt();
                        pengunaAkun[lanjutan] = new Valorant();
                        Valorant tmp = (Valorant) pengunaAkun[lanjutan];
                        tmp.setID(id);
                        tmp.setUserName(un);
                        tmp.setEmail(email);
                        if (pilVp == 1) {
                            tmp.setJumlah(420);
                        } else if (pilVp == 2) {
                            tmp.setJumlah(1375);
                        } else if (pilVp == 3) {
                            tmp.setJumlah(4000);
                        } else if (pilVp == 4) {
                            tmp.setJumlah(8150);
                        } else if (pilVp == 5) {
                            System.out.println("===================Bandel======================");
                            System.out.printf("%-18s%-19s%-17s", "(1)", "(2)", "(3)");
                            System.out.printf("\n%-16s%-17s%-15s", "Rapunzell", "Avanger", "Black white");
                            System.out.printf("\n%-16s%-17s%-15s", "Rp.250.000", "Rp.300.000", "Rp.500.000");
                            System.out.println("\n====================================================");
                            System.out.print("Pilih : ");
                            int pilihBundel = tampung.nextInt();
                            if (pilihBundel == 1) {
                                tmp.setNama("Rapunzell", 1);
                                tmp.setHarga(250000);
                            } else if (pilihBundel == 2) {
                                tmp.setNama("Avanger", 2);
                                tmp.setHarga(300000);
                            } else if (pilihBundel == 3) {
                                tmp.setNama("Black White", 3);
                                tmp.setHarga(500000);
                            } else {
                                System.out.println("Wrong Input");
                            }
                        } else {
                            System.out.println("Wrong Input");
                        }
                    } else if (pilih == 4) {
                        tampung.nextLine();
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("===================Mobile Legends======================");
                        System.out.printf("%-12s%-12s%-14s%-12s", "(1)", "(2)", "(3)", "(4)");
                        System.out.printf("\n%-11s%-11s%-13s%-11s", "77Dm", "774Dm", "1708Dm", "4003Dm");
                        System.out.println("\nHarga : 1Dm = Rp.315,00");
                        System.out.println("\n====================================================");
                        System.out.print("Masukan ID          : \t");
                        String id = tampung.nextLine();
                        System.out.print("Masukan UserName    : ");
                        String un = tampung.nextLine();
                        System.out.print("Masukan Email     : ");
                        String email = tampung.next();
                        System.out.println("====================================================");
                        System.out.print("Pilih banyak Diamon : ");
                        int pilVp = tampung.nextInt();
                        pengunaAkun[lanjutan] = new Mole();
                        Mole tmp = (Mole) pengunaAkun[lanjutan];
                        tmp.setID(id);
                        tmp.setUserName(un);
                        tmp.setEmail(email);

                        if (pilVp == 1) {
                            tmp.setJumlah(77);
                        } else if (pilVp == 2) {
                            tmp.setJumlah(774);
                        } else if (pilVp == 3) {
                            tmp.setJumlah(1708);
                        } else if (pilVp == 4) {
                            tmp.setJumlah(4003);
                        } else {
                            System.out.println("Wrong Input");
                        }
                    } else {
                        System.out.println("");
                        System.out.println("Wrong input");
                        i--;
                    }

                }

                System.out.println("");
                System.out.println("");
                System.out.println("===============Konfirmasi Pembelian===============");
                for (int j = 0; j <= lanjutan; j++) {
                    if (pengunaAkun[j] instanceof epepMax) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---------------" + ((epepMax) pengunaAkun[j]).getGame() + "---------------");
                        System.out.println("User Name   : " + pengunaAkun[j].userName());
                        System.out.println("ID          : " + pengunaAkun[j].getId());
                        System.out.println("Email       : " + pengunaAkun[j].getEmail());
                        System.out.println("_________________________________________________");
                        System.out.println("Jumlah Diamond  : " + pengunaAkun[j].getJumlah());
                        double HrgTot = ((epepMax)pengunaAkun[j]).hitungTotal();
                        System.out.println("Total harga     : " + HrgTot);
                        System.out.println("Kejutan Discount : " + disc);
                        total += (HrgTot - disc);
                        disc=0;
                        System.out.println("");
                    } else if (pengunaAkun[j] instanceof Pubg) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---------------" + ((Pubg) pengunaAkun[j]).getGame() + "---------------");
                        System.out.println("User Name   : " + pengunaAkun[j].userName());
                        System.out.println("ID          : " + pengunaAkun[j].getId());
                        System.out.println("Email       : " + pengunaAkun[j].getEmail());
                        System.out.println("_________________________________________________");
                        System.out.println("Jumlah UC  : " + pengunaAkun[j].getJumlah());
                        double HrgTot = ((Pubg)pengunaAkun[j]).hitungTotal();
                        disc = ((Pubg) pengunaAkun[j]).custom();
                        System.out.println("Total harga     : " + (HrgTot - disc));
                        total += (HrgTot - disc);
                        System.out.println("");
                    } else if (pengunaAkun[j] instanceof Valorant) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---------------" + ((Valorant) pengunaAkun[j]).getGame() + "---------------");
                        System.out.println("User Name   : " + pengunaAkun[j].userName());
                        System.out.println("ID          : " + pengunaAkun[j].getId());
                        System.out.println("Email       : " + pengunaAkun[j].getEmail());
                        System.out.println("_________________________________________________");
                        disc = ((Valorant) pengunaAkun[j]).Bundel();
                        if (disc == 0) {
                            System.out.println("Jumlah Valoran Point  : " + pengunaAkun[j].getJumlah());
                            double HrgTot = ((Valorant)pengunaAkun[j]).hitungTotal();
                            System.out.println("Total harga     : " + HrgTot);
                            total += HrgTot;
                        } else {
                            System.out.println(
                                    "SELAMAT ANDA MEMPEROLEH TAMBAHAN " + ((Valorant) pengunaAkun[j]).getBonus() + " VP!!!!");
                            System.out.println("Valoran Bundel  : " + ((Valorant) pengunaAkun[j]).getNama() + " + "
                                    + ((Valorant) pengunaAkun[j]).getBonus() + "Vp");
                            System.out.println("Disc    : " + disc);
                            System.out.println("Total harga : " + (((Valorant) pengunaAkun[j]).getHarga() - disc));
                            total += (((Valorant) pengunaAkun[j]).getHarga() - disc);
                        }
                        System.out.println("");
                    } else if (pengunaAkun[j] instanceof Mole) {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---------------" + ((Mole) pengunaAkun[j]).getGame() + "---------------");
                        System.out.println("User Name   : " + pengunaAkun[j].userName());
                        System.out.println("ID          : " + pengunaAkun[j].getId());
                        System.out.println("Email       : " + pengunaAkun[j].getEmail());
                        System.out.println("_________________________________________________");
                        System.out.println("Jumlah Diamond  : " + pengunaAkun[j].getJumlah());
                        System.out.println("Bonus Skin      : " + ((Mole) pengunaAkun[j]).bonusSkin());
                        double HrgTot = ((Mole)pengunaAkun[j]).hitungTotal();
                        System.out.println("Total harga     : " + HrgTot);
                        total += HrgTot;
                        System.out.println("");
                    }
                }

                boolean wrong = true;
                
                do {
                    
                    System.out.println("======================Bayar========================");
                    System.out.printf("%-12s%-16s%-14s%-12s", "(1)", "(2)", "(3)", "(4)");
                    System.out.printf("\n%-11s%-18s%-11s%-11s", "Dana", "Transfer Bank", "Alfamart", "Indomart");
                    System.out.println("\n===================================================");
                    System.out.print("Pilih : ");
                    int Plhbayar = tampung.nextInt();
                    pengunaAkun[c].Status(Plhbayar);
                    System.out.println("=========================Nota Pembelian=======================");
                    if (Plhbayar == 1) {
                        byr = new Dana();
                        System.out.println("Harga sebelum pajak         : " + total);
                        System.out.println("Pajak                       : " + ((Dana) byr).HitungPajak(total));
                        total += ((Dana) byr).HitungPajak(total);
                        System.out.println("Discount                    : " + dsc);
                        System.out.println("Total yang harus dibayar    : " + (total - dsc));
                        System.out.println("Code                        : " + ((Dana) byr).getCode());
                        if (dsc == 0) {
                            dsc = ((Dana) byr).DiscDn(total);
                        } else {
                            dsc = 0;
                        }
                        c++;
                        wrong = false;
                    } else if (Plhbayar == 2) {
                        byr = new TransferBank();
                        System.out.println("Harga sebelum pajak         : " + total);
                        System.out.println("Pajak                       : " + ((TransferBank) byr).HitungPajak(total));
                        total += ((TransferBank) byr).HitungPajak(total);
                        System.out.println("Total yang harus dibayar    : " + total);
                        System.out.println("Code                        : " + ((TransferBank) byr).getCode());
                        c++;
                        wrong = false;
                    } else if (Plhbayar == 3) {
                        byr = new Alfamart();
                        System.out.println("AlfaPoint                   : "+alfPoint);
                        System.out.println("Harga sebelum pajak         : " + total);
                        if(alfPoint==100){
                            System.out.println("Pajak                       : " + ((Alfamart) byr).HitungPajak(0));
                            alfPoint=0;
                        }else{
                            System.out.println("Pajak                       : " + ((Alfamart) byr).HitungPajak(total));
                            total += ((Alfamart) byr).HitungPajak(total);
                        }
                        System.out.println("Total yang harus dibayar    : " + total);
                        System.out.println("Code                        : " + ((Alfamart) byr).getCode());
                        ((Alfamart) byr).AlfaPoint(total);
                        alfPoint+=((Alfamart) byr).getAlfaPoint();
                        c++;
                        wrong = false;
                    } else if (Plhbayar == 4) {
                        byr = new Indomart();
                        ((Indomart) byr).IdPoint(total);
                        System.out.println("_________________________________");
                        System.out.println("Indomart Point              : " + ((Indomart) byr).getIndoPoint());
                        System.out.println("_________________________________");
                        System.out.println("Harga sebelum pajak         : " + total);
                        System.out.print("Tukar Point (YA/TIDAK)      : ");
                        String Ip = tampung.next();
                        if (Ip.equalsIgnoreCase("YA")) {
                            System.out.println("Pajak                       : " + ((Indomart) byr).HitungPajak(total));
                            total += ((Indomart) byr).HitungPajak(total);
                            System.out.println(
                                    "Total yang harus dibayar    : " + (total - ((Indomart) byr).getIndoPoint()));
                            System.out.println("Code                        : " + ((Indomart) byr).getCode());
                            ((Indomart) byr).setIndoPoint(0);
                        } else {
                            System.out.println("Pajak                       : " + ((Indomart) byr).HitungPajak(total));
                            total += ((Indomart) byr).HitungPajak(total);
                            System.out.println("Total yang harus dibayar    : " + total);
                            System.out.println("Code                        : " + ((Indomart) byr).getCode());
                        }
                        c++;
                        wrong = false;
                    } else {
                        System.out.println("");
                        System.out.println(" ! ! ! ! ! T R A N S A K S I   G A G A L ! ! ! ! ! ");
                        System.out.println("");
                        c++;
                        wrong = false;
                    }
                    total = 0;
                    System.out.println("========================= T E R I M A  K A S I H =======================");
                } while (wrong);
                keluar = true;

            } else if (menu == 2) {
                System.out.println("=========================Riwayat pembelian=======================");
                if (x == 0) {
                    System.out.println("==============================");
                    System.out.println("|| Belum ada yang anda beli ||");
                    System.out.println("==============================");
                } else {
                    for (int i = 0; i <= lanjutan; i++) {
                        System.out.println("User Name       : " + pengunaAkun[i].userName());
                        System.out.println("ID              : " + pengunaAkun[i].getId());
                        if (pengunaAkun[i] instanceof epepMax) {
                            System.out.println("Game            : " + ((epepMax) pengunaAkun[i]).getGame());
                            System.out.println("Banyak diamond  : " + pengunaAkun[i].getJumlah());
                            System.out.println("Status          : "+pengunaAkun[i].getStatus());
                            System.out.println("______________________________");
                        } else if (pengunaAkun[i] instanceof Pubg) {
                            System.out.println("Game        : " + ((Pubg) pengunaAkun[i]).getGame());
                            System.out.println("Banyak Uc   : " + pengunaAkun[i].getJumlah());
                            System.out.println("Status          : "+pengunaAkun[i].getStatus());
                            System.out.println("______________________________");
                        } else if (pengunaAkun[i] instanceof Valorant) {
                            System.out.println("Game        : " + ((Valorant) pengunaAkun[i]).getGame());
                            System.out.println("Banyak Vp   : " + pengunaAkun[i].getJumlah());
                            System.out.println("Status          : "+pengunaAkun[i].getStatus());
                            System.out.println("______________________________");
                        } else if (pengunaAkun[i] instanceof Mole) {
                            System.out.println("Game            : " + ((Mole) pengunaAkun[i]).getGame());
                            System.out.println("Banyak diamond  : " + pengunaAkun[i].getJumlah());
                            System.out.println("Status          : "+pengunaAkun[i].getStatus());
                            System.out.println("______________________________");
                        }
                    }
                }
            } else if (menu == 3) {
                System.out.println();
                System.out.println("============================DAFTAR GAME===============================");
                System.out.println("1. Free Fire MAx");
                System.out.println("2. PUBG Mobile");
                System.out.println("3. Valorant");
                System.out.println("4. Mobile Legends");
                System.out.println("_______________________________________________________________________");
            } else if (menu == 4) {
                keluar = false;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

}
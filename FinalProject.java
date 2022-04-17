package finalproject;

import java.util.Arrays;
import java.util.Scanner;

class FinalProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih2 = 0, pilih3 = 0, pilih4 = 0, pilih5 = 0, pilih6 = 0, pilih7 = 0, pilih8 = 0, pilih9 = 0, pilih10 = 0, pilih11 = 0, pilih12 = 0;
        int b = 0, c = 0;

        String nmenumkn, ubahmakan, tubahmkn, hpsmkn, bulan, input;
        int hmenumkn, thmkn, tanggal, pass, tahun, total = 0, lihatbeli = 0;

        String nmenumnm, ubahmnm, tubahmnm, hpsmnm;
        int hmenumnm, thmnm;
        cNota transaksi = new cNota(6);
        cPembeli pembeli = new cPembeli("");

        cMakanan menumkn[] = new cMakanan[10];
        menumkn[0] = new cMakanan("Roti", 5000);
        menumkn[1] = new cMakanan("PisangGoreng", 7000);
        menumkn[2] = new cMakanan("MieInstan", 8000);
        menumkn[3] = new cMakanan("Pecel", 9000);
        menumkn[4] = new cMakanan("Cireng", 13000);
        menumkn[5] = new cMakanan("Snack", 2500);

        cMinuman menumnm[] = new cMinuman[10];
        menumnm[0] = new cMinuman("Teh", 5000);
        menumnm[1] = new cMinuman("Air", 2000);
        menumnm[2] = new cMinuman("KopiHitampekat", 8000);
        menumnm[3] = new cMinuman("Kopisusu", 10000);
        menumnm[4] = new cMinuman("Susu", 7000);

        do {
            System.out.println("**Selamat Datang Di Aplikasi Warung Corner**!");
            Scanner mem = new Scanner(System.in);
            System.out.print("Nama Member : ");
            String member = mem.nextLine();
            System.out.print("Password Member: ");
            pass = sc.nextInt();
            if (pass != 123) {
                System.out.println("");
                System.out.println("Maaf Password Yang Anda Masukan Salah!");
                System.out.println("Mohon mencoba Kembali!");
            }
        } while (pass != 123);

        System.out.println("");
        System.out.println("Login Anda Berhasil!");

        do {
            System.out.println("===Aplikasi Warung Corner Side===");
            System.out.println("1. Master Barang");
            System.out.println("2. Transaksi");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    // sub menu barang
                    do {
                        System.out.println("");
                        System.out.println(" Menu Master Barang");
                        System.out.println(" 1. Tambah Barang");
                        System.out.println(" 2. Ubah Barang");
                        System.out.println(" 3. Hapus Barang");
                        System.out.println(" 4. Lihat Barang");
                        System.out.println(" 5. Kembali");
                        System.out.print("Pilih: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Tambah Barang");
                                    System.out.println("1. Tambah Nama Makanan");
                                    System.out.println("2. Tambah Nama Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih3 = sc.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Makanan: ");
                                            nmenumkn = sc.next();
                                            System.out.print("Masukan Harga Makanan: ");
                                            hmenumkn = sc.nextInt();
                                            int i = -1;
                                            do {
                                                i++;
                                            } while (menumkn[i] != null);
                                            System.out.println("");
                                            System.out.println(
                                                    "Tambahkan " + nmenumkn + " [" + hmenumkn + "]?");
                                            System.out.println("1. Tambah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih4 = sc.nextInt();
                                            if (pilih4 == 1) {
                                                menumkn[i] = new cMakanan(nmenumkn, hmenumkn);
                                                System.out.println("Penambahan menu Makanan Sukses!");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Minuman: ");
                                            nmenumnm = sc.next();
                                            System.out.print("Masukan Harga Minuman: ");
                                            hmenumnm = sc.nextInt();
                                            int j = -1;
                                            do {
                                                j++;
                                            } while (menumnm[j] != null);
                                            System.out.println("");
                                            System.out.println(
                                                    "Tambahkan " + nmenumnm + " [" + hmenumnm + "]?");
                                            System.out.println("1. Tambah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih5 = sc.nextInt();
                                            if (pilih5 == 1) {
                                                menumnm[j] = new cMinuman(nmenumnm, hmenumnm);
                                                System.out.println("Penambahan menu Minuman Sukses!");
                                            }
                                            break;
                                    }
                                } while (pilih3 != 3);
                                break;
                            case 2:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Ubah Barang");
                                    System.out.println("1. Ubah Makanan Yang Telah Dipilih");
                                    System.out.println("2. Ubah Minuman Yang Telah Dipilih");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih6 = sc.nextInt();
                                    switch (pilih6) {
                                        case 1:
                                            System.out.println("");
                                            System.out
                                                    .print("Masukan Nama Jenis Makanan Yang Akan Diubah: ");
                                            ubahmakan = sc.next();
                                            System.out.print("Ubah Nama Jenis Makanan Menjadi: ");
                                            tubahmkn = sc.next();
                                            System.out.print("Ubah Harga Makanan Menjadi: ");
                                            thmkn = sc.nextInt();
                                            System.out.println("");
                                            System.out.println("Ubah Makanan " + ubahmakan + " Menjadi "
                                                    + tubahmkn + "Dengan Harga Rp." + thmkn + "?");
                                            System.out.println("1. Ubah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih7 = sc.nextInt();
                                            if (pilih7 == 1) {
                                                for (int i = 0; i < menumkn.length; i++) {
                                                    if (menumkn[i] != null && ubahmakan.equalsIgnoreCase(menumkn[i].getNama())) {
                                                        menumkn[i].setNama(tubahmkn);
                                                        menumkn[i].setHarga(thmkn);
                                                        System.out.println("Pengubahan Sukses!");
                                                    }
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Minuman Yang Akan Diubah: ");
                                            ubahmnm = sc.next();
                                            System.out.print("Ubah Nama Jenis Minuman Menjadi: ");
                                            tubahmnm = sc.next();
                                            System.out.print("Ubah Harga Minuman Menjadi: ");
                                            thmnm = sc.nextInt();
                                            System.out.println("");
                                            System.out.println("Ubah Cat " + ubahmnm + " Menjadi " + tubahmnm + "?");
                                            System.out.println("1. Ubah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih8 = sc.nextInt();
                                            if (pilih8 == 1) {
                                                for (int i = 0; i < menumnm.length; i++) {
                                                    if (menumnm[i] != null && ubahmnm.equalsIgnoreCase(menumnm[i].getNama())) {
                                                        menumnm[i].setNama(tubahmnm);
                                                        menumnm[i].setHarga(thmnm);
                                                        System.out.println("Pengubahan Sukses!");
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                } while (pilih6 != 3);
                                break;
                            case 3:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Hapus Barang");
                                    System.out.println("1. Hapus Jenis Makanan");
                                    System.out.println("2. Hapus Jenis Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih9 = sc.nextInt();
                                    switch (pilih9) {
                                        case 1:
                                            System.out.println("");
                                            System.out.print("Masukan Jenis Makanan Yang Akan Dihapus: ");
                                            hpsmkn = sc.next();
                                            System.out.println("Hapus Makanan " + hpsmkn + "?");
                                            System.out.println("1. Hapus");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih10 = sc.nextInt();
                                            if (pilih10 == 1) {
                                                for (int i = 0; i < menumkn.length; i++) {
                                                    if (menumkn[i] != null
                                                            && hpsmkn.equalsIgnoreCase(menumkn[i].getNama()) && menumkn[i + 1] != null) {
                                                        menumkn[i] = null;
                                                        for (int j = i; j < menumkn.length; j++) {
                                                            if (j == menumkn.length - 1) {
                                                                menumkn[j] = null;
                                                            } else {
                                                                menumkn[j] = menumkn[j + 1];
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Penghapusan Berhasil!");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Jenis minuman Yang Akan Dihapus: ");
                                            hpsmnm = sc.next();
                                            System.out.println("Hapus Cat " + hpsmnm + "?");
                                            System.out.println("1. Hapus");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih11 = sc.nextInt();
                                            if (pilih11 == 1) {
                                                for (int i = 0; i < menumnm.length; i++) {
                                                    if (menumnm[i] != null && hpsmnm.equalsIgnoreCase(menumnm[i].getNama())
                                                            && menumnm[i + 1] != null) {
                                                        menumnm[i] = null;
                                                        for (int j = i; j < menumnm.length; j++) {
                                                            if (j == menumnm.length - 1) {
                                                                menumnm[j] = null;
                                                            } else {
                                                                menumnm[j] = menumnm[j + 1];
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Penghapusan Berhasil!");
                                            }
                                            break;
                                    }
                                } while (pilih9 != 3);
                                break;
                            case 4:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Lihat Barang");
                                    System.out.println("1. Lihat Jenis Makanan");
                                    System.out.println("2. Lihat Jenis Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih12 = sc.nextInt();
                                    switch (pilih12) {
                                        case 1:
                                            System.out.println("");
                                            System.out.println("Daftar Jenis Makanan");
                                            int j = 0;
                                            for (int i = 0; i < menumkn.length; i++) {
                                                if (menumkn[i] != null) {
                                                    System.out.println((i + 1) + ". " + menumkn[i].getNama()
                                                            + " [" + menumkn[i].getHarga() + "] ");
                                                    j++;
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.println("Daftar Jenis Minuman");
                                            j = 0;
                                            for (int i = 0; i < menumnm.length; i++) {
                                                if (menumnm[i] != null) {
                                                    System.out.println((i + 1) + ". " + menumnm[i].getNama()
                                                            + " [" + menumnm[i].getHarga() + "] ");
                                                    j++;
                                                }
                                            }
                                            break;
                                    }
                                } while (pilih12 != 3);
                                break;
                        }
                    } while (pilih2 != 5);
                    break;
                case 2:
                    do {
                        System.out.println("  Pembelian");
                        System.out.println("  1. Isi Pembeli");
                        System.out.println("  2. Tambah Makanan");
                        System.out.println("  3. Hapus Makanan");
                        System.out.println("  4. Lihat Makanan Yang Telah Dipesan");
                        System.out.println("  5. Tambah Minuman");
                        System.out.println("  6. Hapus Minuman");
                        System.out.println("  7. Lihat Minuman Yang Telah Dipesan");
                        System.out.println("  8. Pembelian Selesai dan Hasil Transaksi");
                        System.out.print(" Pilih = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                // pembelian
                                System.out.print("Nama pembeli =");
                                String np = sc.next();
                                pembeli.setNamaPembeli(np);
                                transaksi.isiPembeli(pembeli);
                                break;
                            case 2:
                                // Tambah Makanan
                                int m = 0;
                                System.out.println("Daftar Makanan");
                                System.out.println("Makanan");
                                for (int i = 0; i < menumkn.length; i++) {
                                    if (menumkn[i] != null) {
                                        System.out.println(menumkn[i].ToString());

                                    }
                                }
                                System.out.print("  Masukan Nama Makanan = ");
                                String nama = sc.next();
                                boolean ada = false;
                                for (int i = 0; i < 10; i++) {
                                    if (nama.equalsIgnoreCase(menumkn[i].getNama())) {
                                        ada = true;
                                        System.out.println("  Dengan Harga : Rp. " + menumkn[i].getHarga());
                                        transaksi.tambahMakanan(menumkn[i]);
                                        break;
                                    }
                                }
                                if (ada == false) {
                                    System.out.print("  Menu tidak ada!");
                                }
                                break;
                            case 3:
                                // Menghapus Makanan
                                System.out.println("  Menu dihapus");
                                String h = sc.next();
                                transaksi.hapusMakanan(h);
                                break;
                            case 4:
                                // Melihat Makanan
                                transaksi.lihatMakanan();
                                break;
                            case 5:
                                // Tambah Minuman
                                int n = 0;
                                System.out.println("Daftar Minuman");
                                System.out.println("Minuman");
                                for (int i = 0; i < menumnm.length; i++) {
                                    if (menumnm[i] != null) {
                                        System.out.println(menumnm[i].ToString());

                                    }
                                }
                                System.out.print("  Menu = ");
                                String mint = sc.next();
                                boolean ada2 = false;
                                for (int i = 0; i < 10; i++) {
                                    if (mint.equalsIgnoreCase(menumnm[i].getNama())) {
                                        ada2 = true;
                                        System.out.println("  Dengan Harga : Rp. " + menumnm[i].getHarga());
                                        transaksi.tambahMinuman(menumnm[i]);
                                        break;
                                    }
                                }
                                if (ada2 == false) {
                                    System.out.print("  Menu tidak ada!");
                                }
                                break;
                            case 6:
                                // Menghapus Minuman
                                System.out.println("  Menu dihapus");
                                String ha = sc.next();
                                transaksi.hapusMinuman(ha);
                                break;
                            case 7:
                                // Melihat Minuman
                                transaksi.lihatMinuman();
                                break;
                            case 8:
                                System.out.println("");
                                System.out.print("Tanggal Pembelian : ");
                                tanggal = sc.nextInt();
                                System.out.print("Bulan Pembelian : ");
                                bulan = sc.next();
                                System.out.print("Tahun Pembelian : ");
                                tahun = sc.nextInt();
                                System.out.println("");
                                System.out.println("=================================================================");
                                System.out.println("                  Warung Side Corner                    ");
                                System.out.println("Waktu Transaksi     : " + tanggal + "-" + bulan + "-" + tahun);
                                System.out.println("Transaksi Atas Nama : " + pembeli.getNama());
                                for (int i = 0; i < cNota.makanan.length; i++) {
                                    if (cNota.hargamk[i] != 0) {
                                        System.out.println(" [" + cNota.makanan[i].getNama() + "]\t[" + cNota.jumlahmk[i] + "]\t[" + cNota.hargamk[i] + "]");
                                    }
                                }
                                for (int i = 0; i < cNota.minuman.length; i++) {
                                    if (cNota.hargamn[i] != 0) {
                                        System.out.println(" [" + cNota.minuman[i].getNama() + "]\t[" + cNota.jumlahmn[i] + "]\t[" + cNota.hargamn[i] + "]");
                                    }
                                }
                                total = transaksi.HitungTotal();
                                System.out.println("Total harga :  " + total);
                                System.out.println("---------------------------------------------------------");
                                System.out.println("Harga yang harus dibayarkan : Rp " + total);
                        

                        System.out.println("Total Biaya Keseluruhan = Rp" + total);
                        System.out.println("Punya Kode Pelanggan ?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("Pilih : ");
                        int pilihan = sc.nextInt();
                        if (pilihan == 1) {
                            System.out.print("Masukkan Kode Pelanggan : ");
                            int kode = sc.nextInt();
                            ada2=false;
                            System.out.print("Password Member: ");
                            pass = sc.nextInt();
                            if (pass != 555) {
                                System.out.println("");
                                System.out.println("Maaf Password Yang Anda Masukan Salah!");
                                System.out.println("Mohon mencoba Kembali!");
                            }
                        }
                        while (pass != 555);
                         
                        System.out.println("");
                        System.out.println("Anda Berhak Mendapat Diskon 10%");
                        double total2 = (double) (total * 0.1);
                            
               
               if(ada2==false){
                   System.out.println("Kode salah/Anda Belum Terdaftar");
                   System.out.println("Silahkan daftar di menu Master Pembeli");
               }
           
       
                        System.out.println("Total Biaya Keseluruhan Menjadi : Rp" + (total - total2));
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.print("Tunai\t\t\t\t:Rp");
                            int tunai = 0,
                                    Kembalian;
                            tunai = sc.nextInt();
                            Kembalian = tunai - total;
                            if (tunai == total) {
                                System.out.println("UANG PAS");
                            } else if (tunai < total) {
                                System.out.println("MAAF UANG ANDA KURANG!");
                            } else {
                                System.out.println("UANG ANDA KEMBALI SEBESAR :Rp" + Kembalian);
                            }
                            System.out.println("=================================================================");
                            System.out.println("");
                            System.out.println("Anda Yakin Ingin Mencetak Struk? [1. Ya / 2. Tidak]");
                            System.out.print("Pilih : ");
                            pilih = sc.nextInt();
                            if (pilih == 1) {
                                transaksi.HitungTotal();
                                System.out.println("Cetak Struk Berhasil!");
                            }
                            if (pilih == 2) {
                                System.out.println("Jumlah Belanja Anda adalah" + total);
                                break;

                            }
                            break;
                        }
                    } while (pilih2 != 8);
                    
                    case 3:
                    System.out.print("... 1Terima Kasih ...");
                    System.out.println("--------------------------------");
                    System.out.println("----------Terima Kasih----------");
                    System.out.println("-----Telah Mengunjungi Kami-----");
                    System.out.println("---------------Salam Senang-----------------");
                    System.out.println("--------TOKO CORNER SIDE-------");

            

        } while (pilih != 3);
    }
        }

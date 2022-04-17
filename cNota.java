package finalproject;

import java.util.Scanner;

public class cNota {

    private cPembeli pembeli;
    static cMakanan makanan[];
    static cMinuman minuman[];
    private int jmlhmenumkn, maksmenumkn, totalmk;
    static int jumlahmk[], jumlahmn[];
    private int jmlhmenumnm, maksmenumnm, minumn, totalmm;
    private int total, hrg, satuaj, makann, brg, transaksi, bl;
    static int hargamk[], hargamn[];
    static int totalhar = 0, jpbl;
    public int banyak[] = new int[5];

    Scanner sc = new Scanner(System.in);

    cNota(int maks) {
        maksmenumkn = 7;
        maksmenumnm = 7;
        maksmenumnm = maks;
        makanan = new cMakanan[maksmenumkn];
        minuman = new cMinuman[maksmenumnm];
        jumlahmk = new int[maksmenumkn];
        hargamk = new int[maksmenumkn];
        jumlahmn = new int[maksmenumnm];
        hargamn = new int[maksmenumkn];
        jmlhmenumkn = 0;
        jmlhmenumnm = 0;
        totalhar = 0;
        jpbl=0;
    
    }

    public void isiPembeli(cPembeli pbl) {
        pembeli = new cPembeli(pbl.getNama());
        System.out.println("Isi pembeli berhasil ...");
        
         
    }

    public void tambahMakanan(cMakanan m) {
        System.out.println(" Jumlah = ");
        int jml = sc.nextInt();
        jumlahmk[jmlhmenumkn] = jml;
        if (jmlhmenumkn >= maksmenumkn) {
            System.out.println("Keranjang sudah penuh!");
        } else {
            makanan[jmlhmenumkn] = m;
            System.out.println("Penambahan Sukses ..");
            jmlhmenumkn++;

            //for(int i = 0;i<jmlhmenumkn;i++){
            hargamk[jmlhmenumkn - 1] = (m.getHarga() * jumlahmk[jmlhmenumkn - 1]);
            System.out.println("Jumlah Harga = " + hargamk[jmlhmenumkn - 1]);
            //}
            //for (int i = 0; i <harga.length; i++) {
            totalhar = totalhar + hargamk[jmlhmenumkn - 1];
            // }

            System.out.println("Jumlah Biaya = " + totalhar);
        }
    }

    public void lihatMakanan() {
        System.out.println(pembeli.ToString());
        System.out.println("Daftar Makanan");
        if (jmlhmenumkn <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            for (int i = 0; i < jmlhmenumkn; i++) {
                System.out.println((i + 1) + "." + makanan[i].ToString());
            }
        }
    }

    public void hapusMakanan(String hapus) {
        if (jmlhmenumkn <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            //temukan yang akan dihapus
            //lakukan penghapusan
            boolean ada = false;
            for (int i = 0; i < jmlhmenumkn; i++) {
                if (hapus.equalsIgnoreCase(makanan[i].getNama())) {
                    ada = true;
                    makanan[i] = null;
                    //penggeseran elemen array yang dibelakang --> maju
                    for (int j = i; j < jmlhmenumkn; j++) {
                        if (j == jmlhmenumkn - 1) {
                            makanan[j] = null;
                        } else {
                            makanan[j] = makanan[j + 1]; //geser maju
                        }
                    }
                    jmlhmenumkn--;
                    System.out.println("Penghapusan Sukses ..");
                    break;
                }
            }
            if (ada == false) {
                System.out.println("Makanan tidak ada!");
            }
        }
    }

    public void tambahMinuman(cMinuman mi) {
        System.out.print(" Jumlah = ");
        int jml = sc.nextInt();
        jumlahmn[jmlhmenumnm] = jml;
        if (jmlhmenumnm >= maksmenumnm) {
            System.out.println("Keranjang sudah penuh!");
        } else {
            minuman[jmlhmenumnm] = mi;
            System.out.println("Penambahan Sukses ..");

            //for (int i = 0; i < jmlhmenumnm; i++) {
            hargamn[jmlhmenumnm] = (minuman[jmlhmenumnm].getHarga() * jumlahmn[jmlhmenumnm]);
            System.out.println("Jumlah Harga = " + hargamn[jmlhmenumnm]);

            // }
            // for (int i = 0; i < hargamn.length; i++) {
            totalhar = totalhar + hargamn[jmlhmenumnm];
            //}
            jmlhmenumnm++;
            System.out.println("Jumlah Biaya = " + totalhar);
        }
    }

    public void lihatMinuman() {
        System.out.println(pembeli.ToString());
        System.out.println("Daftar Minuman");
        if (jmlhmenumnm <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            for (int i = 0; i < jmlhmenumnm; i++) {
                System.out.println((i + 1) + "." + minuman[i].ToString());
            }
        }
    }

    public void hapusMinuman(String hapus) {
        if (jmlhmenumnm <= 0) {
            System.out.println("Keranjang kosong!");
        } else {
            boolean ada = false;
            for (int i = 0; i < jmlhmenumnm; i++) {
                if (hapus.equalsIgnoreCase(minuman[i].getNama())) {
                    ada = true;
                    minuman[i] = null;
                    for (int j = i; j < jmlhmenumnm; j++) {
                        if (j == jmlhmenumnm - 1) {
                            minuman[j] = null;
                        } else {
                            minuman[j] = minuman[j + 1];
                        }
                    }
                    jmlhmenumnm--;
                    System.out.println("Penghapusan Sukses ..");
                    break;
                }
            }
        }
    }

    public int HitungMakanan(int harga, int jml) {

        return totalhar;
    }

    public int HitungMinuman(int harga, int b) {

        return totalhar;
    }

    public int HitungTotal() {
        return totalhar;
    }

}

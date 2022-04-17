package finalproject;

import java.util.Scanner;

public class cBarang {
    protected String nama;
    protected int harga;
    private cMakanan makanan[];
   private int jmlhmenumkn,maksmenumkn,totalmk;
   private cMinuman minuman[];
   private int jmlhmenumnm,maksmenumnm,totalmnm;
   
   private Scanner sc = new Scanner(System.in);

   cBarang(){
    maksmenumkn=7;
       makanan = new cMakanan[maksmenumkn];
       jmlhmenumkn=0; totalmk=0;
    nama="";harga=0; 
    System.out.println("Objek menu dibuat...");
    maksmenumnm=7;
       minuman = new cMinuman[maksmenumnm];
       jmlhmenumnm=0; totalmnm=0;
    nama="";harga=0; 
    System.out.println("Objek menu dibuat...");
}
    cBarang (String nama, int harga){  
     this.nama = nama; this.harga = harga;
     System.out.println("Menu  "+nama+"  Dibuat");
    }

    public void setNama(String nama){
        this.nama= nama;
    }

    public void setHarga (int harga){
        this.harga = harga;
    }
    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }
    public String ToString(){
        return "Menu : "+nama+" ("+harga+")";
    }
}
package finalproject;
public class cPembeli {
 static String nama, pembeli, pbl;
static int codepbl;
    cPembeli(){
        nama=""; codepbl=0;
        System.out.println("Objek Pembeli dibuat...");
    }
    cPembeli(String n,int c){
        nama = n; codepbl=c;
        System.out.println("Objek "+nama+" di buat....");
    }
    cPembeli(String np){
        nama=np; 
        System.out.println("Object pengunjung dengan nama " +nama+ " dibuat...");
    }
    public void setNamaPembeli(String np){
        nama=np;
    }
    public String getNama(){
        return nama;
    }
     public void setCodepbl(int c){
        codepbl=c;
    }
        public int getCodepbl(){
      return codepbl;
}
    public String ToString(){
        return "Pembeli : " +nama;
    }
      public void isiPembeli(cPembeli pbl){
      }
}    


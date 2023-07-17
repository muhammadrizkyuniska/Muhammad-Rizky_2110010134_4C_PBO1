package pbo;

//Class
public class Buku {
    //Atribut dan Encapsulation
    private String judul;
    private String penulis;
    private String kode;

    //Constructor
    public Buku(String judul, String penulis, String kode) {
        this.judul = judul;
        this.penulis = penulis;
        this.kode = kode;
    }
      
    //Mutator (Setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
  
    //Accessor (Getter)
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo() {
        return "Judul: "+getJudul()+"\nPenulis: "+getPenulis()+"\nKode: "+getKode();
    }
    
    //Polymophism (Overloading)
    public String displayInfo(String tahunTerbit) {
        return displayInfo() + "\nTahun Terbit: " + tahunTerbit;
    }
    
}

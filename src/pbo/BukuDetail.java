package pbo;

//Inheritance
public class BukuDetail extends Buku {

    //Overriding
    public BukuDetail(String judul, String penulis, String kode) {
        super(judul, penulis, kode);
    }

    public int getTahunTerbit() {
        return Integer.parseInt(getKode().substring(0, 2)) + 2000;
    }

    //Seleksi
    public String getJenis() {
        if (getKode().substring(2, 3).equals("A")) {
            return "Novel";
        } else if (getKode().substring(2, 3).equals("B")) {
            return "Light Novel";
        } else {
            return "Jenis Lain";
        }
    }

    public String getGenre() {
        switch (getKode().substring(3, 5)) {
            case "01":
                return "Action";
            case "02":
                return "thriller";
            default:
                return "jenis Aksi lain";
        }
    }

    //Polymophism (Overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nTahun Terbit: " + getTahunTerbit()
                + "\nJenis Buku: " + getJenis()
                + "\nGenre: " + getGenre();
    }
}

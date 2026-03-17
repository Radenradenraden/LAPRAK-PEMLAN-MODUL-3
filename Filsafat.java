import java.util.ArrayList;
public class Filsafat {
    public String Judul;
    public int TahunTerbit;
    public String Sinopsis;
    ArrayList<String>Penulis;

    public Filsafat(String Judul, int TahunTerbit, String Sinopsis){
        this.Judul = Judul;
        this.TahunTerbit = TahunTerbit;
        this.Sinopsis = Sinopsis;
        Penulis = new ArrayList<>();
    }

    public void TambahPenulis (String NamaPenulis){
        Penulis.add(NamaPenulis);
    }
    public void TampilInformasi(){
        System.out.println("Judul Buku   : " + Judul);
        System.out.print  ("Penulis      : ");
        for(int i = 0; i < Penulis.size(); i++){
        System.out.print(Penulis.get(i));
        if(i < Penulis.size() - 1){
            System.out.print(", ");
            }
        }
        System.out.println("\nTahun Terbit : " + TahunTerbit);
        System.out.println("Sinopsis     : " + Sinopsis);
        System.out.println("Jumlah Kata  : " + HitungJumlahKata());
    }

    public int HitungJumlahKata(){
        String[] kata = Sinopsis.split(" ");
        return kata.length;
    }

    public int CekKesamaan(Filsafat bukuLain){

    int sama = 0;
    int total = 3;

    if(this.Judul.equals(bukuLain.Judul)){
        sama++;
    }

    if(this.TahunTerbit == bukuLain.TahunTerbit){
        sama++;
    }

    if(this.Sinopsis.equals(bukuLain.Sinopsis)){
        sama++;
    }

    int Hasil = (sama * 100) / total;
    return Hasil;
    }

    public Filsafat Copy(){

    Filsafat salinan = new Filsafat (this.Judul, this.TahunTerbit, this.Sinopsis);

    for(String p : Penulis){
    salinan.TambahPenulis(p);
    }

    return salinan;
    }
}

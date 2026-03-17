import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Agama {
    public String Judul;
    public int TahunTerbit;
    public String Sinopsis;
    ArrayList<String>Penulis;

    public Agama(String Judul, int TahunTerbit, String Sinopsis){
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

    public int CekKesamaan(Agama bukuLain){

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

    public Agama Copy(){
    Agama salinan = new Agama(this.Judul, this.TahunTerbit, this.Sinopsis);
    for(String p : Penulis){
    salinan.TambahPenulis(p);
    }
    return salinan;
    }

      public void BacaFile(String pathFile){
    try{
        BufferedReader BR = new BufferedReader(new FileReader(pathFile));
        String Data = BR.readLine();
        BR.close();

        String[] Bagian = Data.split(";");

        this.Judul = Bagian[0];

        this.Penulis.clear();
        String[] daftarPenulis = Bagian[1].split(",");
        for(String p : daftarPenulis){
            this.Penulis.add(p.trim());
        }

        this.TahunTerbit = Integer.parseInt(Bagian[2]);
        this.Sinopsis = Bagian[3];

    } catch(Exception e){
        System.out.println("Gagal membaca file");
       }
    }

    public void SimpanFile(String namaFile){
    try{
        BufferedWriter BW = new BufferedWriter(new FileWriter(namaFile));

        StringBuilder penulisGabung = new StringBuilder();
        for(int i = 0; i < Penulis.size(); i++){
            penulisGabung.append(Penulis.get(i));
            if(i < Penulis.size() - 1){
                penulisGabung.append(",");
            }
        }

        String data = Judul + ";" + penulisGabung.toString() + ";" + TahunTerbit + ";" + Sinopsis;

        BW.write(data);
        BW.close();

    }catch(Exception e){
        System.out.println("Gagal menyimpan file");
        }
    }

    public double HitungRoyalti (double Harga){
        return Harga*0.10;
    }

    public double HitungRoyaltiCustom (double Harga, double Persen){
        return Harga*(Persen/100);
    }
}
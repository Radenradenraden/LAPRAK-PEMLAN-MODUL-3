public class Perpustakaan {
    public static void main(String[] args) {
       
        Teknologi Tek1 = new Teknologi("Machine Learning", 2007, "Buku ini menjelaskan konsep dasar machine learning dan penerapannya dalam analisis data"); 
        Tek1.TambahPenulis("Ahmad"); Tek1.TambahPenulis("Siti");
        Teknologi Tek2 = new Teknologi("Artificial Intelligence", 2012, "Pembahasan kecerdasan buatan mulai teori algoritma hingga implementasi pada sistem modern");
        Tek2.TambahPenulis("Ahmad"); Tek2.TambahPenulis("Vincent");
        Teknologi Tek3 = new Teknologi("Pemrograman Dasar", 2012, "Panduan memahami konsep pemrograman dasar menggunakan contoh sederhana dan latihan");
        Tek3.TambahPenulis("Andi");
        Teknologi Tek4 = new Teknologi("Pemrograman Lanjut", 2005, "Membahas teknik pemrograman lanjutan struktur data algoritma dan optimasi program");
        Tek4.TambahPenulis("Dimas");
        Teknologi Tek5 = new Teknologi("Data Science", 2007, "Penjelasan proses analisis data statistik visualisasi serta penerapan pada dunia industri");
        Tek5.TambahPenulis("Dimas");
        Teknologi Tek7 = new Teknologi("", 0, "");
        System.out.println("BUKU KATEGORI TEKNOLOGI");
        Tek1.SimpanFile("buku.txt");
        Tek7.BacaFile("buku.txt");
        Tek7.TampilInformasi();
        int HargaBuku = 90000;
        System.out.println("Royalti buku adalah : " + Tek1.HitungRoyalti(HargaBuku));
        System.out.println("Royalti custom buku adalah : " + Tek1.HitungRoyaltiCustom(HargaBuku, 20));
      /*   Tek1.TampilInformasi(); System.out.println("Tingkat Sama : " + Tek1.CekKesamaan(Tek2) + "% \n" ); 
        Tek2.TampilInformasi(); System.out.println("Tingkat Sama : " + Tek2.CekKesamaan(Tek3) + "% \n" );
        Tek3.TampilInformasi(); System.out.println("Tingkat Sama : " + Tek3.CekKesamaan(Tek4) + "% \n" );
        Tek4.TampilInformasi(); System.out.println("Tingkat Sama : " + Tek4.CekKesamaan(Tek5) + "% \n" );
        Tek5.TampilInformasi(); System.out.println("Tingkat Sama : " + Tek5.CekKesamaan(Tek1) + "% \n" );
        Teknologi Tek6 = Tek3.Copy(); Tek6.TampilInformasi();  System.out.println("Tingkat Sama : " + Tek6.CekKesamaan(Tek3) + "% \n" ); */

        /* Filsafat Fil1 = new Filsafat("Dunia Sophie", 2020, "Novel filsafat menjelaskan sejarah pemikiran filsuf besar melalui cerita menarik");
        Fil1.TambahPenulis("Jostein Gaarder");
        Filsafat Fil2 = new Filsafat("Pengantar Filsafat Barat", 2015, "Buku pengantar mempelajari perkembangan filsafat barat dari masa klasik hingga modern");
        Fil2.TambahPenulis("Ahmad Fauzi");
        Filsafat Fil3 = new Filsafat("Filsafat Modern", 2015, "Pembahasan pemikiran filsafat modern serta pengaruhnya terhadap perkembangan ilmu pengetahuan");
        Fil3.TambahPenulis("Rina Kartika");
        Filsafat Fil4 = new Filsafat("Logika dan Penalaran", 2017, "Mengajarkan cara berpikir logis sistematis untuk menganalisis berbagai permasalahan kehidupan");
        Fil4.TambahPenulis("Andi Saputra");
        Filsafat Fil5 = new Filsafat("Pemikiran Para Filsuf Besar", 2020, "Mengulas gagasan penting para filsuf dunia serta kontribusinya terhadap peradaban");
        Fil5.TambahPenulis("Andi Saputra"); Fil5.TambahPenulis("Lina Sari");
        System.out.println("BUKU KATEGORI FILSAFAT");
        Fil1.TampilInformasi(); System.out.println("Tingkat Sama : " + Fil1.CekKesamaan(Fil2) + "% \n" );
        Fil2.TampilInformasi(); System.out.println("Tingkat Sama : " + Fil2.CekKesamaan(Fil3) + "% \n" );
        Fil3.TampilInformasi(); System.out.println("Tingkat Sama : " + Fil3.CekKesamaan(Fil4) + "% \n" );
        Fil4.TampilInformasi(); System.out.println("Tingkat Sama : " + Fil4.CekKesamaan(Fil5) + "% \n" );
        Fil5.TampilInformasi(); System.out.println("Tingkat Sama : " + Fil5.CekKesamaan(Fil1) + "% \n" );

        Sejarah Sej1 = new Sejarah("Sejarah Dunia Modern",2003, "Menceritakan tentang perkembangan dunia modern dari revolusi industri hingga globalisasi");
        Sej1.TambahPenulis("Jeremy Black");
        Sejarah Sej2 = new Sejarah("Indonesia dalam Arus Sejarah",2012, "Membahas perjalanan sejarah bangsa Indonesia dari masa kerajaan hingga kemerdekaan");
        Sej2.TambahPenulis("Taufik Abdullah");
        Sejarah Sej3 = new Sejarah("Peradaban Kuno Dunia",2016, "Mengulas kehidupan peradaban kuno seperti Mesir Yunani Romawi dan Mesopotamia");
        Sej3.TambahPenulis("Rudi Santosa");
        Sejarah Sej4 = new Sejarah("Jejak Kerajaan Nusantara",2019, "Menjelaskan mengenai sejarah kerajaan nusantara beserta budaya politik dan peninggalannya");
        Sej4.TambahPenulis("Dimas Prasetyo");
        Sejarah Sej5 = new Sejarah("Sejarah Revolusi Industri",2021, "Menggambarkan perubahan besar teknologi industri yang memengaruhi kehidupan masyarakat dunia");
        Sej5.TambahPenulis("Andika Saputra");
        System.out.println("BUKU KATEGORI SEJARAH");
        Sej1.TampilInformasi(); System.out.println("Tingkat Sama : " + Sej1.CekKesamaan(Sej2) + "% \n" );
        Sej2.TampilInformasi(); System.out.println("Tingkat Sama : " + Sej2.CekKesamaan(Sej3) + "% \n" );
        Sej3.TampilInformasi(); System.out.println("Tingkat Sama : " + Sej3.CekKesamaan(Sej4) + "% \n" );
        Sej4.TampilInformasi(); System.out.println("Tingkat Sama : " + Sej4.CekKesamaan(Sej5) + "% \n" );
        Sej5.TampilInformasi(); System.out.println("Tingkat Sama : " + Sej5.CekKesamaan(Sej1) + "% \n" );

        Agama Aga1 = new Agama("Tafsir Al-Mishbah", 2008, "Penafsiran ayat Al Quran dengan bahasa sederhana dan konteks kehidupan modern");
        Aga1.TambahPenulis("M. Quraish Shihab");
        Agama Aga2 = new Agama("Etika Dalam Islam", 2012, "Membahas nilai etika moral dalam Islam untuk kehidupan pribadi sosial");
        Aga2.TambahPenulis("Ahmad Hidayat");
        Agama Aga3 = new Agama("Spiritualitas dalam Kehidupan Modern", 2018, "Mengajak pembaca untuk memahami makna spiritualitas dalam kehidupan manusia modern");
        Aga3.TambahPenulis("Siti Nurzahlia");
        Agama Aga4 = new Agama("Sejarah Perkembangan Islam", 2018, "Menjelaskan bagaimana perjalanan sejarah Islam sejak masa Nabi hingga penyebarannya");
        Aga4.TambahPenulis("Rudi Haartono"); Aga4.TambahPenulis("Nurul Hidayah");
        Agama Aga5 = new Agama("Pengantar Studi Agama", 2008, "Memberikan pemahaman dasar tentang kajian agama dari berbagai perspektif ilmiah");
        Aga5.TambahPenulis("Lina Kartika");
        System.out.println("BUKU KATEGORI AGAMA");
        Aga1.TampilInformasi(); System.out.println("Tingkat Sama : " + Aga1.CekKesamaan(Aga2) + "% \n" );
        Aga2.TampilInformasi(); System.out.println("Tingkat Sama : " + Aga2.CekKesamaan(Aga3) + "% \n" );
        Aga3.TampilInformasi(); System.out.println("Tingkat Sama : " + Aga3.CekKesamaan(Aga4) + "% \n" );
        Aga4.TampilInformasi(); System.out.println("Tingkat Sama : " + Aga4.CekKesamaan(Aga5) + "% \n" );
        Aga5.TampilInformasi(); System.out.println("Tingkat Sama : " + Aga5.CekKesamaan(Aga1) + "% \n" );

        Psikologi Psi1 = new Psikologi("Psikologi Kepribadian", 2001, "Menjelaskan teori kepribadian manusia serta faktor yang memengaruhi perilaku individu");
        Psi1.TambahPenulis("Andi Wijaya");
        Psikologi Psi2 = new Psikologi("Psikologi Sosial", 2001, "Mempelajari interaksi manusia dalam kelompok serta pengaruh sosial terhadap perilaku");
        Psi2.TambahPenulis("David Myers");
        Psikologi Psi3 = new Psikologi("Mindset", 2011, "Menjelaskan pentingnya pola pikir berkembang seseorang untuk mencapai kesuksesan hidup");
        Psi3.TambahPenulis("Caarol S."); Psi3.TambahPenulis("Dweck");
        Psikologi Psi4 = new Psikologi("Psikologi Perkembangan", 2007, "Membahas perkembangan manusia dari masa anak hingga dewasa secara psikologis");
        Psi4.TambahPenulis("Caarol S."); 
        Psikologi Psi5 = new Psikologi("Memahami Perilaku Manusia", 2001, "Menguraikan bagaimana faktor psikologis yang memengaruhi perilaku dan keputusan manusia");
        Psi5.TambahPenulis("Andi Wijaya");
        System.out.println("BUKU KATEGORI PSIKOLOGI");
        Psi1.TampilInformasi(); System.out.println("Tingkat Sama : " + Psi1.CekKesamaan(Psi2) + "% \n" );
        Psi2.TampilInformasi(); System.out.println("Tingkat Sama : " + Psi2.CekKesamaan(Psi3) + "% \n" );
        Psi3.TampilInformasi(); System.out.println("Tingkat Sama : " + Psi3.CekKesamaan(Psi4) + "% \n" );
        Psi4.TampilInformasi(); System.out.println("Tingkat Sama : " + Psi4.CekKesamaan(Psi5) + "% \n" );
        Psi5.TampilInformasi(); System.out.println("Tingkat Sama : " + Psi5.CekKesamaan(Psi1) + "% \n" );

        Politik Pol1 = new Politik("Ilmu Politik : Suatu Pengantar", 2005, "Mengenalkan konsep dasar ilmu politik sistem pemerintahan serta kekuasaan negara");
        Pol1.TambahPenulis("Rudi Pratama");
        Politik Pol2 = new Politik("Demokrasi dan Pemilu di Indonesia", 2005, "Membahas tentang proses demokrasi pemilu serta dinamika politik di Indonesia");
        Pol2.TambahPenulis("Rudi Pratama"); Pol2.TambahPenulis("Andi Pratama");
        Politik Pol3 = new Politik("Politik Global Modern", 2005, "Menjelaskan hubungan politik antarnegara serta isu global dalam politik modern");
        Pol3.TambahPenulis("Rudi Pratama");
        Politik Pol4 = new Politik("Kekuasaan dan Negara", 2005, "Mengkaji tentang konsep kekuasaan negara serta peran institusi dalam pemerintahan");
        Pol4.TambahPenulis("Rudi Pratama");
        Politik Pol5 = new Politik("Sistem Politik Indonesia", 2005, "Menguraikan tentang struktur sistem politik Indonesia serta peran lembaga negara");
        Pol5.TambahPenulis("Rudi Pratama");
        System.out.println("BUKU KATEGORI POLITIK");
        Pol1.TampilInformasi(); System.out.println("Tingkat Sama : " + Pol1.CekKesamaan(Pol2) + "% \n" );
        Pol2.TampilInformasi(); System.out.println("Tingkat Sama : " + Pol2.CekKesamaan(Pol3) + "% \n" );
        Pol3.TampilInformasi(); System.out.println("Tingkat Sama : " + Pol3.CekKesamaan(Pol4) + "% \n" );
        Pol4.TampilInformasi(); System.out.println("Tingkat Sama : " + Pol4.CekKesamaan(Pol5) + "% \n" );
        Pol5.TampilInformasi(); System.out.println("Tingkat Sama : " + Pol5.CekKesamaan(Pol1) + "% \n" );

        Fiksi Fik1 = new Fiksi("Laskar Pelangi", 2005, "Kisah perjuangan anak desa meraih pendidikan dengan semangat dan persahabatan");
        Fik1.TambahPenulis("Andrea Hirata");
        Fiksi Fik2 = new Fiksi("Bumi", 2014, "Petualangan remaja menemukan dunia paralel penuh misteri kekuatan dan tantangan");
        Fik2.TambahPenulis("Tere Liye");
        Fiksi Fik3 = new Fiksi("Negeri 5 Menara", 2019, "Cerita persahabatan santri meraih mimpi besar melalui pendidikan dan usaha");
        Fik3.TambahPenulis("Ahmad Fuadi");
        Fiksi Fik4 = new Fiksi("Petualangan di Kota Tua", 2018, "Petualangan mengenai sekelompok remaja memecahkan misteri sejarah tersembunyi di kota");
        Fik4.TambahPenulis("Rudi Santoso");
        Fiksi Fik5 = new Fiksi("Rahasia Hutan Senja", 2021, "Cerita misteri tentang rahasia hutan yang menyimpan legenda dan keajaiban");
        Fik5.TambahPenulis("Lina Prasetya");
        System.out.println("BUKU KATEGORI FIKSI");
        Fik1.TampilInformasi(); System.out.println("Tingkat Sama : " + Fik1.CekKesamaan(Fik2) + "% \n" );
        Fik2.TampilInformasi(); System.out.println("Tingkat Sama : " + Fik2.CekKesamaan(Fik3) + "% \n" );
        Fik3.TampilInformasi(); System.out.println("Tingkat Sama : " + Fik3.CekKesamaan(Fik4) + "% \n" );
        Fik4.TampilInformasi(); System.out.println("Tingkat Sama : " + Fik4.CekKesamaan(Fik5) + "% \n" );
        Fik5.TampilInformasi(); System.out.println("Tingkat Sama : " + Fik5.CekKesamaan(Fik1) + "% \n" ); */
    }
}
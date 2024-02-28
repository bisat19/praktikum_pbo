/*Nama :Abisatya Hastarangga Pradana
NIM  :24060122120004
Tanggal: 28 Feb 2024
Lab C1*/
/** Main Garis  **/
public class MainGaris {
    public static void main(String[] args) {
        Garis garis2 = new Garis(new Titik(1, 2), new Titik(2, 5));
        Garis garis3 = new Garis(new Titik(9,5), new Titik(-9,-7));
        Garis garisRefleksiSumbuY = garis2.getRefleksiY();
        System.out.println("Garis2: ((" + garis2.getTitikAwal().getAbsis() +","+ garis2.getTitikAwal().getOrdinat() + ")" +","
        + "(" + garis2.getTitikAkhir().getAbsis() +","+ garis2.getTitikAkhir().getOrdinat() +"))");
        System.out.println("TitikAwal garis2: (" + garis2.getTitikAwal().getAbsis() +","+ garis2.getTitikAwal().getOrdinat() + ")");
        System.out.println("TitikAkhir garis2: (" + garis2.getTitikAkhir().getAbsis() +","+ garis2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Garis3: ((" + garis3.getTitikAwal().getAbsis() +","+ garis3.getTitikAwal().getOrdinat() + ")" +","
        + "(" + garis3.getTitikAkhir().getAbsis() +","+ garis3.getTitikAkhir().getOrdinat() +"))");
        System.out.println("TitikAwal garis3: (" + garis3.getTitikAwal().getAbsis() +","+ garis3.getTitikAwal().getOrdinat() + ")");
        System.out.println("TitikAkhir garis2: (" + garis3.getTitikAkhir().getAbsis() +","+ garis3.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Banyaknya garis yang terbuat: " + Garis.getCounterGaris());
        System.out.println("Gradien garis2: " + garis2.getGradien());
        System.out.println("Panjang garis2: " + garis2.getPanjang());
        System.out.println("Gradien garis3: " + garis3.getGradien());
        System.out.println("Panjang garis3: " + garis3.getPanjang());
        System.out.println("Refleksi Sumbu Y garis2: ((" + garisRefleksiSumbuY.getTitikAwal().getAbsis()+","+garisRefleksiSumbuY.getTitikAwal().getOrdinat()
        +"),("+ garisRefleksiSumbuY.getTitikAkhir().getAbsis() + "," + garisRefleksiSumbuY.getTitikAkhir().getOrdinat()+"))");
        System.out.println("Apakah garis2 tegak lurus garis3: " + garis2.isTegakLurus(garis3));
    }
}
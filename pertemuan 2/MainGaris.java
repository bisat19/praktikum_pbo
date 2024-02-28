/*Nama :Abisatya Hastarangga Pradana
NIM  :24060122120004
Lab C1*/
/** Main Garis  **/
public class MainGaris {
    public static void main(String[] args) {
        Garis garis2 = new Garis(new Titik(1, 2), new Titik(1, 5));
        Garis garis3 = new Garis(new Titik(9,5), new Titik(-9,-7));
        System.out.println("titikAwal garis2: (" + garis2.getTitikAwal().getAbsis() + garis2.getTitikAwal().getOrdinat() + ")");
        //System.out.println("titikAwal garis2: (" + garis2.getTitikAwal().getAbis() +garis2.getTitikAwal().getOrdinat() +")");
        System.out.println("Banyaknya garis yang terbuat: " + Garis.getCounterGaris());
        System.out.println("Gradien garis2: " + garis2.getGradien());
        System.out.println("Panjang garis2: " + garis2.getPanjang());
        System.out.println("Gradien garis3: " + garis3.getGradien());
        System.out.println("Panjang garis3: " + garis3.getPanjang());
        System.out.println("Apakah garis2 tegak lurus garis3: " + garis2.isTegakLurus(garis3));
        //System.out.println("garis2: " + garis2.getTitikAwal());
    }
}
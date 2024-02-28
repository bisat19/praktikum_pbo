/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    : 28 Feb 2024
Lab C1*/
/** Kelas yang berisi Garis Enkapsulasi **/
public class Garis {
    private  Titik titikAwal;
    private Titik titikAkhir;
    static double counterGaris;

    //konstruktor
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }
    
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    static double getCounterGaris(){
        return counterGaris;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow((titikAkhir.getAbsis()-titikAwal.getAbsis()), 2.0)+
        (Math.pow((titikAkhir.getAbsis()-titikAwal.getAbsis()), 2.0)));
    }

    public double getGradien(){
        return((titikAkhir.getOrdinat()-titikAwal.getOrdinat())/(titikAkhir.getAbsis()-titikAwal.getAbsis()));
    }

    public Garis getRefleksiX(){
        return new Garis(titikAwal.refleksiSumbuX(),titikAkhir.refleksiSumbuX());
    }

    public Garis getRefleksiY(){
        return new Garis(titikAwal.refleksiSumbuY(),titikAkhir.refleksiSumbuY());
    }

    public boolean isTegakLurus(Garis garisUji){
        return Math.abs(this.getGradien()*garisUji.getGradien()+1)<0.0001;
    }
}

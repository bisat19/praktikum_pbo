/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    : 28 Feb 2024
Lab C1*/
/** Kelas yang berisi Titik Enkapsulasi **/
public class Titik {
    private double absis;
    private double ordinat;
    static double counterTitik;

    //konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }
    
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }
    
    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    static double getCounterTitik(){
        return counterTitik;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getJarak(){
        return Math.sqrt(Math.pow(absis,2.0) + Math.pow(ordinat, 2.0));
    }

    public Titik refleksiSumbuX(){
        return new Titik(this.absis,-(this.ordinat));
    }

    public Titik refleksiSumbuY(){
        return new Titik(-(this.absis),this.ordinat);
    }

    private Titik _refleksiX(){
        return new Titik(this.absis,-(this.ordinat));
    }

    private Titik _refleksiY(){
        return new Titik(-(this.absis),this.ordinat);
    }

    public Titik refleksiX(){
        return _refleksiX();
    }

    public Titik refleksiY(){
        return _refleksiY();
    }
}
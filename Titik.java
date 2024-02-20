// Abisatya Hastarangga Pradana - 24060122120004
/**
 * Titik
 */
public class Titik {
    double absis;
    double ordinat;
    static double counterTitik;

    //konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }
    
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }
    
    double getAbsis(){
        return this.absis;
    }

    double getOrdinat(){
        return this.ordinat;
    }

    static double getCounterTitik(){
        return counterTitik;
    }

    void setAbsis(double absis){
        this.absis = absis;
    }

    void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

}

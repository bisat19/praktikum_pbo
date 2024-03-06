//Nama :  Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat class lingkaran dan asersi2

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
    
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari>0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}
//asersi tersebut kurang tepat pada bagian 
//assert (jariJari>0):"jari-jari tidak boleh nol!!!"
//karena sebaiknya "jari-jari tidak boleh nol atau tidak boleh negatif!!!"
// jika memang assersi tidak boleh 0 saja maka gunakan
// assert (jariJari != 0) : "lorem ipsum".
// Nama : Abisatya Hastarangga Pradana
// NIM  : 24060122120004
// TGL  : 29/05/2024
// DESC : membuat lambda diskon

interface IDiskon{
    public double hitungDiskon (int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga - (harga *0.3);
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga *0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = harga -> {
            return harga - (harga *0.1);
        };
        //perbedaan lambda antara lambda biasa dan dengan blok statement adalah 
        //dengan kurung kurawal dan terdapat return pada lambda block statement
        //block statement juga bisa memberikan lebih dari satu statement
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}
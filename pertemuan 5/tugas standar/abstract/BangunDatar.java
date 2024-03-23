/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 23 Maret 2024
 * Des  : Membuat abstrak BangunDatar.java
 */
public abstract class BangunDatar {
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
        luas = l;
    }
    public double getLuas(){
        return luas;
    }
}

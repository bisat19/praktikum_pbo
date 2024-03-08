//Nama : Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat class Buku

public class Buku {
    private String judul;
    private boolean tersedia;
    public Buku(String judul) {
    this.judul = judul;
    tersedia = true;
    }
    public String getJudul() {
    return judul;
    }
    public boolean isTersedia() {
    return tersedia;
    }
    public void setJudul(String judul) {
    this.judul = judul;
    }
    public void setTersedia(boolean tersedia) {
    this.tersedia = tersedia;
    }
}
    
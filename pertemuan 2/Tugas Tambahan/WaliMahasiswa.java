/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    : 29 Feb 2024
Lab C1*/
/** Kelas yang berisi Wali Mahasiswa **/
public class WaliMahasiswa {
    private  String nama;
    private String nomorHp;
    private String alamat;
    static double counterWaliMahasiswa;

    //konstruktor
    public WaliMahasiswa(){
       this.nama = "NULL";
       this.nomorHp = "NULL";
       this.alamat = "NULL";
       counterWaliMahasiswa++;
    }
   
    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        counterWaliMahasiswa++;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }
    
    public String getAlamat(){
        return this.alamat;
    }

    static double getCounterWaliMahasiswa(){
        return counterWaliMahasiswa;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    : 29 Feb 2024
Lab C1*/
/** Kelas yang berisi Mahasiswa **/
public class Mahasiswa {
    private  String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    static double counterMahasiswa;

    //konstruktor
    public Mahasiswa(){
       this.nama = "NULL";
       this.nim = "NULL";
       this.jurusan = "NULL";
       this.wali = new WaliMahasiswa();
       counterMahasiswa++;
    }
   
    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
        counterMahasiswa++;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }
    
    public String getJurusan(){
        return this.jurusan;
    }
    
    public WaliMahasiswa getWali(){
        return this.wali;
    }

    static double getCounterMahasiswa(){
        return counterMahasiswa;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }
    
    public void cetak(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan Mahasiswa: " + jurusan);
        System.out.println("Nama Wali Mahasiswa: " + wali.getNama());
        System.out.println("Nomor HP Wali Mahasiswa: " + wali.getNomorHp());
        System.out.println("Nomor Alamat Wali Mahasiswa: " + wali.getAlamat());
    }
}
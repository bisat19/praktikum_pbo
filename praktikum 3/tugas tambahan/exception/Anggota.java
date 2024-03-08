//Nama : Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat kelas Anggota

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;
    
    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }
    
    public String getNama() {
        return nama;
    }
    
    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }
    
    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }
    
    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Jumlah buku yang dipinjam sudah maksimum (3 buku).");
        }
        
        if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku dengan judul '" + buku.getJudul() + "' tidak tersedia.");
        }
        
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}

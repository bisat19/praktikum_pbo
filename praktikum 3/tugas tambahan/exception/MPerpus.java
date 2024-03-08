//Nama : Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat Main drive perpustakaan
public class MPerpus {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Alexiander");
        Anggota anggota2 = new Anggota("Emmanuel");
        System.out.println("Jumlah awal buku pinjaman Alexiander: " + anggota1.getJumlahBukuPinjaman());
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Data Structures and Algorithms");
        Buku buku3 = new Buku("Design Patterns");
        Buku buku4 = new Buku("Computer Vision");
        Buku buku5 = new Buku("Bioinformatics 101");
        Buku buku6 = new Buku("100 Ways to Enjoy Machine Learning");
        try {
            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Jumlah akhir buku pinjaman Alexiander: " + anggota1.getJumlahBukuPinjaman());
        try{
            anggota2.pinjamBuku(buku6);
        }catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            anggota1.pinjamBuku(buku4);
            anggota1.pinjamBuku(buku5);
            anggota1.pinjamBuku(buku6);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


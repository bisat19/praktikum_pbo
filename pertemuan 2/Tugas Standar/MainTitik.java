/*Nama  :Abisatya Hastarangga Pradana
NIM     :24060122120004
Tanggal :28 Feb 2024
Lab C1*/
/** Kelas Main untuk Titik Enkapsulasi **/
public class MainTitik {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(8, 3);
        Titik titikRefleksiX = titikAwal.refleksiX();
        Titik titikRefleksiY = titikAwal.refleksiY();
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Jarak titik awal:" + titikAwal.getJarak());
        System.out.println("Refleksi terhadap sumbu X: (" + titikRefleksiX.getAbsis() + ", " + titikRefleksiX.getOrdinat() + ")");
        System.out.println("Refleksi terhadap sumbu Y: (" + titikRefleksiY.getAbsis() + ", " + titikRefleksiY.getOrdinat() + ")");
    }
}

/*Kesimpulan: Dari eksperiemen yang dibuat untuk soal nomor 1 hingga nomor 4 diketahui 
bahwa access private baik yang digunakan dalam sebuah atribut maupun method
tidak dapat dipanggil selain didalam satu class yang sama. Berbeda dengan public
access baik atribut maupun method dapat dipanggil di class yang berbeda*/
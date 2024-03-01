/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :29 Feb 2024
Lab C1*/
/**Main dari Mahasiswa dan WaliMahasiswa **/

public class Main{
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("Ivy Ivory","345123D-10","Bio Medical",new WaliMahasiswa("John Ivory","234-907-756","St. Jackson 9th"));
        System.out.println("======= Data Mahasiswa 2 =======");
        m2.cetak();
        m1.setNama("Jhonny Ackerman");
        m1.setNim("345125Y-00");
        m1.setJurusan("Evolutionary Language");
        m1.setWali(new WaliMahasiswa("Jack Ackerman","233-999-657","St. Archie 10th"));
        System.out.println("\n======= Data Mahasiswa 1 =======");
        m1.cetak();
    }   
}
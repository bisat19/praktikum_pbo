//Nama :  Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat angka sial

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
//Baris dengan as.cobaAngka(12) tidak akan dieksekusi 
// karena pada saat as.cobaAngka(13) sudah masuk dalam AngkaSialException 
// dan program akan keluar dari try and catch sehingga line 21 dieksekusi 
// karena hal tersebut merupakan bagian dari AngkaSialException dan sudah ditrigger 
// dari line as.cobaAngka(13)


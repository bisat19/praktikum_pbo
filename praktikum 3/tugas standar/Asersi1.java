//Nama :  Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat asersi1
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

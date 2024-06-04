// Nama : Abisatya Hastarangga Pradana
// NIM  : 24060122120004
// TGL  : 29/05/2024
// DESC : membuat lambda koleksi list

import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama)->System.out.println(nama));
    }
    
}

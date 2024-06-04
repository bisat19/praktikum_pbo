// Nama : Abisatya Hastarangga Pradana
// NIM  : 24060122120004
// TGL  : 29/05/2024
// DESC : membuat lambda koleksi map

import java.util.HashMap;
import java.util.Map;

public class LamdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120012", "Andi");
        mahasiswaMap.put("24060122120013", "Budi");
        mahasiswaMap.put("24060122120015", "Citra");
        mahasiswaMap.put("24060122120016", "Dewi");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}

/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat Superman.java
 */
public class Superman extends Kryptonian {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void leapBuilding() {
    }

    public void stopBullet() {
    }

    @Override
    public void eat() {
        System.out.println("Nasi Goreng");
    }

    public String getName() {
        return name;
    }
}
/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat abstract Animal.java
 */
public abstract class Animal {
    abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

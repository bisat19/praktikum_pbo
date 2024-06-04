/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat abstract Kryptonian.java
 */
abstract class Kryptonian extends Animal implements IFlyer {
    @Override
    public void takeOff() {
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
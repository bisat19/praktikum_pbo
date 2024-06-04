/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat abstract Airplane.java
 */
abstract class Airplane extends Vehicle implements IFlyer {
    protected double maxLoad;

    public Airplane(double maxLoad) {
    }

    @Override
    abstract public void takeOff();

    @Override
    abstract public void land();

    @Override
    abstract public void fly();
}
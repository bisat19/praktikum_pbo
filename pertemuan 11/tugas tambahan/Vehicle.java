/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat abstrak Vehicle.java
 */

 public abstract class Vehicle{
    abstract double calcFuelEfficiency();
    abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat Helicopter.java
 */
class Helicopter extends Airplane {
    private double distance;
    public Helicopter(double maxLoad) {
        super(maxLoad);
    }

    @Override
    double calcFuelEfficiency() {
        return maxLoad;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    @Override
    double calcTripDistance() {
        return distance;
    }

    @Override
    public void takeOff() {
        // Take off logic here
    }

    @Override
    public void land() {
        // Land logic here
    }

    @Override
    public void fly() {
        // Fly logic here
    }
}
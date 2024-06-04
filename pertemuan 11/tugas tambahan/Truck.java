/*
 * Nama : Abisatya Hastarngga P
 * NIM  : 2406012212004
 * Tgl  : 4 Juni 2024
 * Des  : Membuat Truck.java
 */

public class Truck extends Vehicle {
    private double maxLoad;
    private double distance;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
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
}

public class SeaPlane extends Airplane{
    private double distance;
    public SeaPlane(double maxLoad) {
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
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }
}


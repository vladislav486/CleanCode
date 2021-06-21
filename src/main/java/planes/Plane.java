package planes;


abstract public class Plane {
    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return this.model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMaxFlightDistance() {
        return this.maxFlightDistance;
    }

    public int getMaxLoadCapacity(){ return this.maxLoadCapacity; }

    @Override
    public String toString() {
        return "Plane{" +
                "model = " + model  +
                ", maxSpeed = " + maxSpeed +
                ", maxFlightDistance = " + maxFlightDistance +
                ", maxLoadCapacity = " + maxLoadCapacity +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Plane)) return false;
        if (this == o) return true;
        Plane plane = (Plane) o;
        return this.maxSpeed == plane.maxSpeed &&
                this.maxFlightDistance == plane.maxFlightDistance &&
                this.maxLoadCapacity == plane.maxLoadCapacity &&
                this.model == plane.model;
    }
}

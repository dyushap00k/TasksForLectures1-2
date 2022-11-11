package task3;

public class Cylinder implements Shape {
    private final int volume;

    public Cylinder(int volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder " + volume;
    }
}

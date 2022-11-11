package task3;

public class Cube implements Shape {
    private final int volume;

    public Cube(int volume) {
        this.volume = volume;
    }
    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cube " + volume;
    }
}

package task3;

public class Ball implements Shape {
    private final int volume;

    public Ball(int volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Ball " + volume;
    }
}

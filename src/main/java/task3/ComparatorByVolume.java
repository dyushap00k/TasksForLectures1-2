package task3;

import java.util.Comparator;

public class ComparatorByVolume  implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return (int)(o1.getVolume()-o2.getVolume());
    }
}

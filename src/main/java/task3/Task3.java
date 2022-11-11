package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3. Реалізувати метод, який сортує геометричні 3d фігури за об'ємом.
 * Метод приймає параметром колекцію довільних геометричних фігур (куб, кулю, циліндр).
 * Написати unit-тести для методу.
 */
public class Task3 {
    private Task3() {}
    public static List<Shape> sort3DShapes(List<Shape> shapes) {
        if (shapes == null)
            return new ArrayList<>();
        return shapes.stream()
                .sorted(new ComparatorByVolume())
                .collect(Collectors.toList());
    }
}

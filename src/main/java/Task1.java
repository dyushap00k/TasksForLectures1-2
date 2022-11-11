import java.util.Arrays;
import java.util.Collections;

/**
 * 1. Зробити метод, який приймає на вхід масив цілих чисел,
 * і повертає тільки ті з них, які позитивні (>=0),
 * відсортувавши їх за спаданням. Зробити unit-тести для цього методу.
 */

public class Task1 {
    private Task1(){}
    public static int[] removeNegativeSortReverse(int[] numbers) {
        if (numbers == null)
            return new int[0];
        return  Arrays.stream( numbers ).boxed()
                .filter(x -> x >= 0)
                .sorted( Collections.reverseOrder())
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}

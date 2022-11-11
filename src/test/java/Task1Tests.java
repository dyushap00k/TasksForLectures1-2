import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task1Tests {
    @Test
    void testWhenAnArrayOfSimpleNumbersComesThenReturnPositiveValuesInDescendingOrder() {
        int[] numbers1 = new int[]{1, 8, -5, 0, 0, -3, -1, 7, 2, 1};

        assertArrayEquals(new int[]{8, 7, 2, 1, 1, 0, 0}, Task1.removeNegativeSortReverse(numbers1));
    }

    @Test
    void testWhenInputEmptyArrayThenReturnEmptyArray() {
        int[] numbers = new int[]{};

        assertArrayEquals(new int[]{}, Task1.removeNegativeSortReverse(numbers));
    }

    @Test
    void testWhenInputNullThenReturnEmptyArray() {
        assertArrayEquals(new int[0], Task1.removeNegativeSortReverse(null));
    }
}

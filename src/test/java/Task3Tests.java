import org.junit.jupiter.api.Test;
import task3.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class Task3Tests {
    private static final Ball BALL1 = new Ball(6);
    private static final Cylinder CYLINDER1 = new Cylinder(9);
    private static final Cube CUBE1 = new Cube(15);
    private static final Ball BALL2 = new Ball(7);
    private static final Cylinder CYLINDER2 = new Cylinder(6);
    private static final Cube CUBE2 = new Cube(100);

    @Test
    void testWhenInputSimpleListOfShapesThenReturnListOfShapesOrderByVolume() {
        List<Shape> shapes = List.of(CYLINDER1, BALL1, CUBE2, CUBE1, BALL2, CYLINDER2);

        List<Shape> expected = List.of(BALL1, CYLINDER2, BALL2, CYLINDER1, CUBE1, CUBE2);

        assertEquals(expected, Task3.sort3DShapes(shapes));
    }

    @Test
    void testWhenInputEmptyListThenReturnEmptyList() {
        List<Shape> expected = new ArrayList<>();
        assertEquals(expected, Task3.sort3DShapes(expected));
    }

    @Test
    void testWhenInputNullThenReturnEmptyList() {
        assertEquals(new ArrayList<>(), Task3.sort3DShapes(null));
    }
}

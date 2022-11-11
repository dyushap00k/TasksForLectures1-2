import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Tests {
    @Test
    void testWhenInputStringsWithoutDuplicatesThenReturnTopFiveTagsAndCounts() {
        List<String> text1 = List.of(
                "Модульное тестирование, или юнит-тестирование #JUnit (англ. unit testing)",
                " — процесс в программировании #programming #code , позволяющий проверить",
                " на корректность отдельные модули исходного #code кода программы.");

        Map<String, Integer> result1 = Map.of("#JUnit", 1, "#programming", 1, "#code", 2);

        assertEquals(result1, Task2.topFiveTagsInText(text1));
    }

    @Test
    void testWhenInputStringsContainDuplicatesThenReturnTopFiveTagsIgnoredDuplicates() {
        List<String> text1 = List.of(
                "#text Lorem Ipsum is simply dummy #text of #the printing and typesetting #industry",
                "#text Lorem #industry Ipsum #has been #the industry's standard #1500 dummy #text ever since the  #1500 #1500",
                "#text It is #a #long #long #industry established fact that a #reader will be distracted by the readable",
                "#text #text Contrary #the to popular #the #long belief, Lorem Ipsum #1500 is not simply random #text"
        );

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        result.put("#text", 4);
        result.put("#industry", 3);
        result.put("#the", 3);
        result.put("#long", 2);
        result.put("#1500", 2);

        assertEquals(result, Task2.topFiveTagsInText(text1));
    }

    @Test
    void testWhenInputEmptyListThenReturnEmptyMap() {
        List<String> text1 = List.of(
                "Модульное тестирование, или юнит-тестирование (англ. unit testing)",
                " — процесс в программировании, позволяющий проверить",
                " на корректность отдельные модули исходного кода программы.");

        Map<String, Integer> result1 = Map.of();

        assertEquals(result1, Task2.topFiveTagsInText(text1));
    }

    @Test
    void testWhenInputNullThenReturnEmptyMap() {
        assertEquals(new LinkedHashMap<>(), Task2.topFiveTagsInText(null));
    }
}

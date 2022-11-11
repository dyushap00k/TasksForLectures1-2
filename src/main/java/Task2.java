import java.util.*;
import java.util.stream.Collectors;

/**
 * 2. Написати метод, який на вхід приймає список рядків-текстів,
 * в яких можуть бути хеш-теги (слова, що починаються на знак "#").
 * Як результат, метод повинен повертати top-5 найчастіше згаданих
 * хеш-тегів із зазначенням кількості згадки кожного з них.
 * Декілька однакових хеш-тегів в одному рядку повинні вважатися однією згадкою.
 * Написати unit-тести для цього методу.
 */

public class Task2 {
    private Task2() {
    }

    static LinkedHashMap<String, Integer> topFiveTagsInText(List<String> text) {
        if (text == null || text.isEmpty())
            return new LinkedHashMap<>();

        Map<String, Integer> result = new LinkedHashMap<>();

        text.stream()
                .map(x -> x.split(" "))
                .forEach(x -> Arrays.stream(x)
                        .filter(y -> y.startsWith("#"))
                        .distinct()
                        .forEach(y -> result.put(y, result.getOrDefault(y, 0) + 1)));

        return result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
    }
}

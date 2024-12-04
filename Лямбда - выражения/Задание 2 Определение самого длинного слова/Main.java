import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Без", "труда", "не", "выловишь", "рыбку", "из", "пруда");

        String longestWord = Collections.max(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Самое длинное слово: " + longestWord);
    }
}

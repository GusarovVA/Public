import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> food = Arrays.asList("Хлебушек", "Пюрешка", "Макарошки", "Яблочко", "Рыбка", "Печенюшки", "Кексики");
        char startingLetter = 'Р';
        long count = food.stream()
                .filter(item -> item.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Количество продуктов в списке, начинающихся с буквы '" + startingLetter + "': " + count);
    }
}

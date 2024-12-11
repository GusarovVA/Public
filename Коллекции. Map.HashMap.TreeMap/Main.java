import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static Set<Integer> getKeys(HashMap<Integer, String> map) {
        return map.keySet();
    }

    public static Map<Integer, String> filterMapByStringLength(Map<Integer, String> inputMap, int minLength) {
        Map<Integer, String> filteredMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            if (entry.getValue().length() >= minLength) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }

        return filteredMap;
    }
// Задание 1
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");
        Set<Integer> keys = getKeys(myMap);

        System.out.println("Набор ключей: " + keys);
//Задание 2
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "red");
        colors.put(2, "green");
        colors.put(3, "black");
        colors.put(4, "white");
        colors.put(5, "gray");
        colors.put(6, "yellow");

        Map<Integer, String> filteredColors = filterMapByStringLength(colors, 4); // Corrected minLength

        System.out.println("Полный список цветов: " + colors);
        System.out.println("Список цветов с длинной строки больше 3: " + filteredColors);
    }
}

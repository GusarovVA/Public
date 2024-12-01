import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "red");
        colors.put(2, "green");
        colors.put(3, "black");
        colors.put(4, "white");
        colors.put(5, "gray");
        colors.put(6, "yellow");

        Map<Integer, String> filteredColors = filterMapByStringLength(colors, 4);

        System.out.println(colors);
        System.out.println(filteredColors);


    }


    public static Map<Integer, String> filterMapByStringLength(Map<Integer, String> inputMap, int minLength) {
        Map<Integer, String> filteredMap = new LinkedHashMap<>(); //Preserves insertion order

        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            if (entry.getValue().length() > minLength -1) {  //Correct condition (>=)
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }

        return filteredMap;
    }
}
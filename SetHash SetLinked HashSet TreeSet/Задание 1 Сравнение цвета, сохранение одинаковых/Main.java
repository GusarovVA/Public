import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> colorsSet1 = new HashSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Red"));
        Set<String> colorsSet2 = new LinkedHashSet<>(Arrays.asList("Blue", "Green", "Orange", "Red"));

        Set<String> colorsSet3 = new TreeSet<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Red"));
        Set<String> colorsSet4 = new TreeSet<>(Arrays.asList("Blue", "Green", "Orange", "Red"));

        System.out.println("Common colors (HashSet): " + findCommonColors(colorsSet1, colorsSet2));
        System.out.println("Common colors (LinkedHashSet): " + findCommonColors(colorsSet3, colorsSet4));

        System.out.println("Common colors (TreeSet): " + findCommonColors(colorsSet3, colorsSet4));
    }

    public static <T> Set<T> findCommonColors(Set<T> set1, Set<T> set2) {
        Set<T> commonElements = new HashSet<>();
        commonElements.addAll(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }
}
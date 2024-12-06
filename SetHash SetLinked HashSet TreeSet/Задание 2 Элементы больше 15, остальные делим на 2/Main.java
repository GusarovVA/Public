import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 22, 5, 18, 30, 12, 25, 8, 16, 33));

        System.out.println("Original HashSet: " + numbers);
        processAndPrintSet(numbers, "HashSet");


        numbers = new LinkedHashSet<>(Arrays.asList(10, 22, 5, 18, 30, 12, 25, 8, 16, 33));
        System.out.println("\nOriginal LinkedHashSet: " + numbers);
        processAndPrintSet(numbers, "LinkedHashSet");


        numbers = new TreeSet<>(Arrays.asList(10, 22, 5, 18, 30, 12, 25, 8, 16, 33));
        System.out.println("\nOriginal TreeSet: " + numbers);
        processAndPrintSet(numbers, "TreeSet");
    }

    public static void processAndPrintSet(Set<Integer> numbers, String setName) {
        System.out.println("\nИсполнение " + setName + ":");
        for (Integer number : numbers) {
            if (number > 15 && number % 2 == 0) {
                System.out.println("Номер > 15: " + number);
            } else {
                System.out.println("Номер < 15 / 2: " + (double) number / 2);
            }
        }
    }
}

package anonimys;
public class Main {
    public static void main(String[] args) {
        // Standard concatenation
        System.out.println(processTwoStrings("Привет ", "мир!", (a, b) -> (String) a + (String) b));

        // Concatenation with uppercase conversion of the first string
        System.out.println(processTwoStrings("Добрый", " вечер!", (a, b) -> ((String) a).toUpperCase() + (String) b));

        // Concatenation with adding a prefix to the second string
        System.out.println(processTwoStrings("Как ", "дела?", (a, b) -> (String) a + "-> " + (String) b));

        // Concatenation with generating a string from a number and adding it to the first string
        System.out.println(processTwoStrings("Число: ", 123, (a, b) -> (String) a + String.valueOf(b)));

        // Concatenation with replacing spaces in the second string
        System.out.println(processTwoStrings("Строка с пробелами: ", " много пробелов ", (a, b) -> (String) a + ((String) b).replace(" ", "_")));
    }

    public static String processTwoStrings(Object a, Object b, StringCombiner combiner) {
        return combiner.combine(a, b);
    }
}

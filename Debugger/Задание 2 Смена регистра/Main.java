import java.util.stream.Collectors;

public class Main {

    public static String invertCaseStream(String str) {
        if (str == null) {
            return null;
        }
        return str.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.isLowerCase(c) ? Character.toUpperCase(c) : c)
                .mapToObj(c -> (char)c)
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String inputString = "Привет, Александр, с праздником, с Новым Годом";
        String invertedString = invertCaseStream(inputString);
        System.out.println("Изначальный текст: " + inputString);
        System.out.println("Измененный текст: " + invertedString);

    }
}

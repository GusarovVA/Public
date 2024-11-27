import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

// Задание № 1. Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное. Необходимо протестировать ее в методе main с разными числами.

    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Число должно быть четным!");
        }
        System.out.println("Число четное: " + number);
    }
// Задание № 2. Напишите метод, который принимает строку в качестве входных данных и выдает исключение, если строка содержит числа.

    public static void checkString(String str) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            throw new IllegalArgumentException("Строка не должна содержать цифр!");
        }
        System.out.println("Строка без цифр: " + str);
    }

// Проверка выполнения кода (исключений).

    public static void main(String[] args) {
        try {
            checkEven(10);
            checkEven(7);
            checkString("Привет мир!");
            checkString("123 тест");
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена.");
        }
    }
}
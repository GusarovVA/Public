package anonimys;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long evennumberedSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("Сумма четных чисел: " + evennumberedSum);

        long oddnumberedSum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("Сумма нечетных чисел: " + oddnumberedSum);
    }
}
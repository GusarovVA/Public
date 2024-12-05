package anonimys;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 7, 66, 66, 1, 2);
        Set<Integer> uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println("Изначальный списк: " + numbers);
        System.out.println("Список после удаления повторяющихся чисел: " + new ArrayList<>(uniqueNumbers));
    }
}
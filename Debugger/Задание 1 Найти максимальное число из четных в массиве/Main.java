import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static int findMaxEvenStream(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Не может быть равен нулю, ошибка");
        }
        Optional<Integer> maxEven = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .boxed()
                .max(Integer::compare);


        return maxEven.orElseThrow(() -> new IllegalStateException("нет четных чисел в массиве"));

    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers3 = {-2, 4, -6, 8, -10};

        try {
            System.out.println("Наибольшее четное число в массиве № 1: " + findMaxEvenStream(numbers1));
        } catch (IllegalStateException e) {
            System.out.println("Исключение для массива №1: " + e.getMessage());
        }

        System.out.println("Наибольшее четное число в массиве № 2: " + findMaxEvenStream(numbers2));
        System.out.println("Наибольшее четное число в массиве № 3: " + findMaxEvenStream(numbers3));

    }
}

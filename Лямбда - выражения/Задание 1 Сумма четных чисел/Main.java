import java.util.function.IntPredicate;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] array = {6, 1, 12, 5, 7, 2, 8, 9};
        IntPredicate expression = (n) -> n % 2 == 0;
        System.out.println(sumOfEven(array, expression));
    }

    public static int sumOfEven(int[] array, IntPredicate exp) {
        int result = 0;
        for (int element : array) {
            if (exp.test(element)) {
                result += element;
            }
        }
        return result;
    }
}

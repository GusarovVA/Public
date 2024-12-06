import java.util.Arrays;

public class Main {

    public static <T> void swap(T[] arr, int index1, int index2) {

        if (arr == null || index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            throw new IllegalArgumentException("Недопустимый массив.");
        }

        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"яблоко", "банан", "вишня", "слива"};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};


        swap(intArray, 0, 2);
        swap(strArray, 1, 3);
        swap(doubleArray, 0, 1);


        System.out.println("Числовой массив после обмена: " + Arrays.toString(intArray));
        System.out.println("Строковый массив после обмена: " + Arrays.toString(strArray));
        System.out.println("Дробный массив после обмена: " + Arrays.toString(doubleArray));

        try {
            swap(intArray, 0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

    }
}
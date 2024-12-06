import java.util.Arrays;

public class Main {

    public static <T> boolean arraysEqual(T[] arr1, T[] arr2) {

        if (arr1 == null || arr2 == null) {
            return arr1 == arr2;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        return Arrays.equals(arr1, arr2);
    }


    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        Integer[] arr3 = {1, 2, 3, 4, 6};
        Integer[] arr4 = {1, 2, 3, 4};
        String[] strArr1 = {"яблоко", "банан", "вишня"};
        String[] strArr2 = {"яблоко", "банан", "вишня"};
        String[] strArr3 = {"яблоко", "банан", "слива"};


        System.out.println("arr1 and arr2 are equal: " + arraysEqual(arr1, arr2));
        System.out.println("arr1 and arr3 are equal: " + arraysEqual(arr1, arr3));
        System.out.println("arr1 and arr4 are equal: " + arraysEqual(arr1, arr4));
        System.out.println("strArr1 and strArr2 are equal: " + arraysEqual(strArr1, strArr2));
        System.out.println("strArr1 and strArr3 are equal: " + arraysEqual(strArr1, strArr3));
        System.out.println("arr1 and null are equal: " + arraysEqual(arr1, null));
        System.out.println("null and null are equal: " + arraysEqual(null, null));

    }
}
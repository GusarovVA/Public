import java.util.LinkedList;
import java.util.List;

public class Main {

    //Задание № 2. Создайте LinkedList, содержащий целые числа, т.е. Integer.
    // Напишите метод, который меняет местами первый и последний элементы
    // этого списка и возвращает этот список в новом виде.
    // Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить
    // [5, 2, 3, 4, 1].

    public static List<Integer> swapFirstAndLast(LinkedList<Integer> list) {
        if (list == null || list.size() < 2) {
            return list;
        }

        int first = list.removeFirst(); 
        int last = list.removeLast();

        list.addFirst(last);
        list.addLast(first);

        return list;
    }


    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Исходный список: " + numbers);

        LinkedList<Integer> swappedNumbers = (LinkedList<Integer>) swapFirstAndLast(numbers);

        System.out.println("Список после обмена: " + swappedNumbers);

    }
}
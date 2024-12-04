import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = generatePersons(15);

        System.out.println("Все люди:");
        persons.forEach(System.out::println);

        List<Person> olderThan30 = persons.stream()
                .filter(person -> person.age > 30)
                .collect(Collectors.toList());


        System.out.println("\nЛюди старше 30 лет:");
        olderThan30.forEach(System.out::println);
    }

    public static List<Person> generatePersons(int count) {
        List<Person> persons = new ArrayList<>();
        Random random = new Random();
        String[] names = {"Игорь", "Юрий", "Ирина", "Максим", "Богдан", "Александр", "Владимир", "Денис", "Надежда", "Светлана", "Ольга", "Андрей", "Иван", "Олег", "Диана"};

        for (int i = 0; i < count; i++) {
            persons.add(new Person(names[i % names.length], random.nextInt(60) + 1));
        }
        return persons;
    }
}

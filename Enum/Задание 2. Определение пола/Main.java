import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пол (МУЖЧИНА или ЖЕНЩИНА):");
        String genderInput = scanner.nextLine().toUpperCase();

        Gender gender = null;
        try {
            gender = Gender.valueOf(genderInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender input.");
            return;
        }


        List<Person> filteredPeople = filterByGender(people, gender);

        System.out.println("Filtered list: " + filteredPeople);
    }

    public static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Катя Иванова", 25, Gender.ЖЕНЩИНА));
        people.add(new Person("Игорь Васильев", 30, Gender.МУЖЧИНА));
        people.add(new Person("Иван Воронин", 40, Gender.МУЖЧИНА));
        people.add(new Person("Ирина Дмитракова", 35, Gender.ЖЕНЩИНА));
        people.add(new Person("Олег Григорьев", 28, Gender.МУЖЧИНА));
        people.add(new Person("Александра Сидорова", 32, Gender.ЖЕНЩИНА));
        people.add(new Person("Игорь Краморук", 22, Gender.МУЖЧИНА));
        people.add(new Person("Ольга Данилова", 27, Gender.ЖЕНЩИНА));
        people.add(new Person("Евгения Серова", 38, Gender.ЖЕНЩИНА));
        people.add(new Person("Артем Гусаров", 45, Gender.МУЖЧИНА));
        people.add(new Person("Данил Беспалов", 29, Gender.МУЖЧИНА));

        return people;
    }

    public static List<Person> filterByGender(List<Person> people, Gender gender) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender() == gender) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }
}
class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ", пол=" + gender +
                '}';
    }
}

enum Gender {
    МУЖЧИНА, ЖЕНЩИНА
}

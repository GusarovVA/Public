package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean containColors(List<String> colorsList, String colors) {

        // Задание № 1. Создайте ArrayList, содержащий разные цвета,
        // тип элемента этого динамического массива – String.
        // Напишите метод для поиска элемента в списке, содержащем эти цвета.
        // На вход метод принимает параметр поиска.
        // Например, если список содержит «red», «blue», «green» и в
        // аргументы метода передать «red», то метод должен вернуть true, символизируя то,
        // что этот цвет содержится в списке.

        for (String w : colorsList) {
            if (w.equalsIgnoreCase(colors)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("rad");
        color.add("green");
        color.add("blue");
        color.add("black");
        color.add("white");

        System.out.println(containColors(color,"black"));

    }
}
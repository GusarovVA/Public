package anonimys;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(processTwoString("Привет ", "мир!", (a, b) -> a + b));
        System.out.println(processTwoString("Добрый", " вечер!", (a, b) -> a + b));
        System.out.println(processTwoString("Как ", "дела?", (a, b) -> a + b));
    }
    public static String processTwoString(String a, String b, Concationble<String , String> concationble) {
        return concationble.concat(a, b);
    }
}
@FunctionalInterface
interface Concationble<A, B> {
String concat(A a, B b);
}
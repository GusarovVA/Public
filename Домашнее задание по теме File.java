import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendToFile {

    public static void main(String[] args) {

        // Задание: Необходимо написать программу, которая дописывает файл.
        // Программа предлагает записать данные фразой "Вводите данные для записи".
        // После того, как введены данные в консоль (необходимо использовать
        // класс Scanner для ввода данных в консоль), программа предлагает дополнить
        // информацию фразой «Введите что-нибудь еще» и данные можно дописать.
        // Вся работа по заполнению файла ведется в бесконечном цикле.
        // Если пользователь введет 0, программа завершается строкой «Файл создан».

        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = null;
        String fileName = "Мимуары айтишника.txt";

        try {
            writer = new PrintWriter(new FileWriter(fileName, true));
            String input;

            while (true) {
                System.out.println("Вводите данные для записи:");
                input = scanner.nextLine();

                if (input.equals("0")) {
                    break;
                }

                writer.println(input);

                System.out.println("Введите что-нибудь ещё (или 0 для завершения):");
                input = scanner.nextLine();
                if (input.equals("0")) {
                    break;
                }
                writer.println(input);
            }

            System.out.println("Файл создан.");


        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
            scanner.close();
        }
    }
}
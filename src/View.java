import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class View {
    public static void printList(List<String> List) {
        System.out.println();
        System.out.println("Отсортированный список: ");
        for (String t: List) {
            System.out.println(t);
        }
    }

    public static int getNumberOfWords() {
        int wordCount = 0;
        try {
            Scanner scInt = new Scanner(System.in);
            System.out.println("Введите количество слов: ");
            wordCount = scInt.nextInt();
            if (wordCount <= 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат! Введите число!");
            wordCount = getNumberOfWords();
        }
        return wordCount;
    }

    public static String getWordsString(int wordCount) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите " + wordCount + " слов через пробел: ");
        return br.readLine();
    }

    public static boolean isExit() {
        boolean exit = false;
        try {
            Scanner scInt = new Scanner(System.in);
            System.out.println();
            System.out.println("Повторить сортировку других слов? 1-да / 0-нет");
            if (scInt.nextInt() == 0) exit = true;
        } catch (InputMismatchException e) {
            System.out.println("Неправильный ввод! Повторите!");
            isExit();
        }
        return exit;
    }
}
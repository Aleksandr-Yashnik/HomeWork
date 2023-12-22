import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        System.out.println("Максимально ечисло = " + findMax());
        System.out.println("Самое длинное слово = " + findLongestWord());
        System.out.println("Индекса Массы Тела= " + calculateBMI());
        System.out.println("Форматированное Время = " + convertSecondsToFormattedTime());
      //  System.out.println(calculateArea());


    }
    // Задача 1: Вычисление Максимального Числа с использованием Math.max и тернарного оператора
    public static int findMax() {
        int a = 50;
        int b = 30;
        int c = 80;
         return Math.max(Math.max(a, b), c);
    }

    // Задача 2: Поиск Самого Длинного Слова в Строке
    public static String findLongestWord() {
         String sentence  = "qwert ttttttt";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Задача 3: Вычисление Индекса Массы Тела
    public static double calculateBMI() {
        double weight = 2;
        double height = 8;
        return weight / (height * height);
    }

    // Задача 4: Конвертация Секунд в Форматированное Время
    public static String convertSecondsToFormattedTime() {
        int seconds = 33000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }

    // Задача 5: Вычисление Площади Фигур
    public static double calculateArea() {
        double[] dimensions = {10,20,20};
        switch (dimensions.length) {
            case 1:
                return Math.PI * dimensions[0] * dimensions[0];
            case 2:
                return dimensions[0] * dimensions[1];
            case 3:
                double s = (dimensions[0] + dimensions[1] + dimensions[2]) / 2;
                return Math.sqrt(s * (s - dimensions[0]) * (s - dimensions[1]) * (s - dimensions[2]));
            default:
                return -1;
        }
    }
}

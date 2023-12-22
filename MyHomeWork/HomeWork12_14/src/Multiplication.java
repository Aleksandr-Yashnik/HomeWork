import java.util.Scanner;

/**
 * Описание задачи: Написать программу, последовательно и выводить таблицу умножений от 1 до 10. Для каждого числа от 1
 * до 10 таблица должна отображать произведение этого числа в числах от 1 до 10.
 * <p>
 * Требования к реализации: Используйте вложенные циклы for. Внешний цикл должен итерироваться по одному множителю
 * (например, от 1 до 10), внутренний цикл - по второму множителю.
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "  x  " + j + " = " + (i * j));
            }
        }
        System.out.println("Введите пожалуйста 1 цифру");
        Integer x = scanner.nextInt();
        System.out.println("Введите пожалуйста 2 цифру");
        Integer k = scanner.nextInt();
        for (int i = x; i <= k; i++) {
            for (int j = k ;j <= k ;j++) {
                System.out.println(i + "  x  " + j + " = " + (i * j));
            }
        }
    }
}

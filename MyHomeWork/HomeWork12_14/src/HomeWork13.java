

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.PI;

public class HomeWork13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     //  System.out.println("Введите время в секундах");
       // int seconds = scanner.nextInt();
       // convertSeconds(seconds);
       // canTriangleExist();
       // mergeStrings();
       // int[] numbers = {3,4,5,6};
     //   calculateAverage(numbers);
      //  isSumEven();
       double[] dimensions = {};
        double radius = 0;
        double length = 0;
        double width = 0;
        double a =0;
        double b = 0;
        double c = 0;
        calculateArea(dimensions);
        printCircleArea(radius);
        printRectangleArea( length,width);
        printTriangleArea(a, b, c);
    }
        // Задача 1: Проверка существования треугольника
        public static void canTriangleExist (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите стороны тригульника для проверки соществования");
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           int c = scanner.nextInt();
            boolean answer = (a + b > c && a + c > b && b + c > a) && (a > 0 && b > 0 && c > 0);
            System.out.println("Can triangle exist: " + answer);
        }

    // Задача 2: Объединение строк с изменением регистра
    public static void mergeStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для преобразования");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String answer = first.substring(0, first.length() / 2).toLowerCase() +
                second.substring(second.length() / 2).toUpperCase();
        System.out.println("Merged string: " + answer);

    }

    // Задача 3: Вычисление среднего арифметического
    public static void calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double answer = sum / numbers.length;
        System.out.println("Average: " + answer);
    }

    // Задача 4: Определение четности суммы чисел
    public static void isSumEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ВВедите числа для опредиления четности");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        boolean answer = (a + b) % 2 == 0;
        System.out.println("Is sum even: " + answer);
    }

    // Задача 5: Преобразование секунд в часы, минуты и секунды
    public static void convertSeconds(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        String answer = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println("Converted seconds: " + answer);
        System.out.println("Converted hours: " + hours);
        System.out.println("Converted minutes: " + minutes);
        System.out.println("Converted remainingSeconds: " + remainingSeconds);


    }

    // Задача 6: Вычисление площади различных фигур
    public static void calculateArea(double[] dimensions) {
        Scanner scanner = new Scanner(System.in);
        dimensions = new double[0];
        System.out.println("Вы хотите ввести все элементы в массив за раз через пробел или вводить элементы по одному?\n" +
                "1 - все за раз\n" +
                "2 - по одному");
        String userAnswer = scanner.nextLine();
        while (!(userAnswer.equals("1") || userAnswer.equals("2"))) {
            System.out.println("Некорректный ответ! Пожалуйста введите ваш ответ повторно 1 или 2:");
            userAnswer = scanner.nextLine();
        }
        if (userAnswer.equals("1")) {
            System.out.println("Вы выбрали ввести все значения в одну строку. " +
                    "Пожалуйста введите ниже последовательность целых чисел, " +
                    "разделяя отдельные элементы массива пробелами");
            String input = scanner.nextLine();
            String[] arrayStringInput = input.split("\\s+");
            dimensions = new double[arrayStringInput.length];
            for (int i = 0; i < dimensions.length; i++) {
                dimensions[i] = Integer.parseInt(arrayStringInput[i]);
            }
        } else {
            while (scanner.hasNextInt()) {
                dimensions = Arrays.copyOf(dimensions, dimensions.length +1 );
                dimensions[dimensions.length - 1] = scanner.nextInt();
            }
        }
        switch (dimensions.length) {
            case 1:
                printCircleArea(dimensions[0]);
                break;
            case 2:
                printRectangleArea(dimensions[0], dimensions[1]);
                break;
            case 3:
                printTriangleArea(dimensions[0], dimensions[1], dimensions[2]);
                break;
            default:
                System.out.println("Некорректное количество размеров.");
        }
    }

    private static void printCircleArea(double radius) {
        System.out.println("Площадь круга = " + PI * radius * radius);
    }

    private static void printRectangleArea(double length, double width) {
        System.out.println("Площадь прямоугольника = " +length * width);
    }

    private static void printTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Площадь триугольника =  " + area);
    }
}





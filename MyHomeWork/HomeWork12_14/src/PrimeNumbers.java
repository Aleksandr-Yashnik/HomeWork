import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        Integer v = scanner.nextInt();
        for ( int i = 2; i <= v; i++) {
            boolean isPrime = true;

            for (int j =2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " - простое число");
            }
        }
    }
}

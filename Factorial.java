import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: отрицательное число");
            return;
        }

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        try (PrintWriter writer = new PrintWriter("factorial.txt")) {
            writer.println(fact);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

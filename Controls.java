import java.util.Scanner;

public class Controls {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до 10: " + sum);

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String input;
        do {
            System.out.print("Введите строку (exit для выхода): ");
            input = scanner.nextLine();
            if (!input.equals("exit")) count++;
        } while (!input.equals("exit"));
        System.out.println("Количество введенных строк: " + count);
    }
}

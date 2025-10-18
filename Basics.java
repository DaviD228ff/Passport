import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Basics {
    public static void main(String[] args) {
        int age = 20;
        double height = 1.75;
        String name = "Иван";
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(height);
        System.out.println(name);
        System.out.println(isStudent);

        int a = 10, b = 3;
        double x = 5.5, y = 2.0;

        int sumInt = a + b;
        int subInt = a - b;
        int mulInt = a * b;
        double divInt = (double)a / b;

        double sumDouble = x + y;
        double subDouble = x - y;
        double mulDouble = x * y;
        double divDouble = x / y;

        System.out.println(sumInt + " " + subInt + " " + mulInt + " " + divInt);
        System.out.println(sumDouble + " " + subDouble + " " + mulDouble + " " + divDouble);

        String surname = "Иванов";
        String fullName = name + " " + surname;
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите число 2: ");
        double num2 = scanner.nextDouble();

        double s = num1 + num2;
        double d = num1 - num2;
        double m = num1 * num2;
        double div = num2 != 0 ? num1 / num2 : 0;

        try {
            PrintWriter writer = new PrintWriter(System.getProperty("user.dir") + "/basics_output.txt");
            writer.println("Возраст: " + age);
            writer.println("Рост: " + height);
            writer.println("Имя: " + name);
            writer.println("Статус студента: " + isStudent);
            writer.println("Сумма: " + s);
            writer.println("Разность: " + d);
            writer.println("Произведение: " + m);
            writer.println("Деление: " + div);
            writer.close();
            System.out.println("Данные успешно записаны в файл basics_output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

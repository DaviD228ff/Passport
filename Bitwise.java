public class Bitwise {
    public static void main(String[] args) {
        int a = 109, b = 17;
        System.out.println("Сумма в двоичном: " + Integer.toBinaryString(a + b));

        int num = 42;
        System.out.println("Обратное числа 42: " + ~num);
        System.out.println("Число 42 в 3-й степени: " + (int)Math.pow(num, 3));
    }
}

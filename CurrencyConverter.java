import java.util.Scanner;

// Конвертер валют из долларов США в российские рубли
public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 92.12;
        System.out.println("Текущий курс: 1 USD = " + ROUBLES_PER_DOLLAR + " RUB");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в долларах: ");
        int dollars = scanner.nextInt();

        double roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.printf("Сумма в рублях: %.2f%n", roubles);
    }
}
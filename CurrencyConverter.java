import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 92.12;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в долларах: ");
        int dollars = scanner.nextInt();
        double roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.printf("Сумма в рублях: %.2f%n", roubles);
    }
}
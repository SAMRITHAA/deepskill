import java.util.Scanner;

public class FinancialForecast {

    public static double forecast(double initialAmount, double rate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return forecast(initialAmount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount (₹): ");
        double amount = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue = forecast(amount, rate, years);

        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);

        scanner.close();
    }
}
import java.util.Scanner;

public class PowerCalculator {
    public static double calculatePower(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * calculatePower(a, n - 1);
        } else {
            return 1 / (a * calculatePower(a, -n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int exponent = scanner.nextInt();

        scanner.close();

        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}


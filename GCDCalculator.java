import java.util.Scanner;

public class GCDCalculator {
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        scanner.close();

        int gcd = calculateGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
}


import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        int result = fibonacci(n);
        System.out.println("The " + n + "-th element in the Fibonacci sequence is: " + result);
    }
}


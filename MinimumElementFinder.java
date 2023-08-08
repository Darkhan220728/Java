import java.util.Scanner;

public class MinimumElementFinder {
    public static int findMinimumRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minRest = findMinimumRecursive(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int minimum = findMinimumRecursive(numbers, 0);
        System.out.println("The minimum element in the array is: " + minimum);
    }
}

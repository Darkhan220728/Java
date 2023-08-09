import java.util.Scanner;

public class DigitCheck {
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        boolean isDigitsOnly = isAllDigits(inputString);

        if (isDigitsOnly) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


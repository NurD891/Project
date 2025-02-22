import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get password length
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        // Get character types
        System.out.print("Include lowercase letters? (y/n): ");
        boolean useLowercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean useUppercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean useNumbers = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include symbols? (y/n): ");
        boolean useSymbols = scanner.next().equalsIgnoreCase("y");

        // Build character pool
        StringBuilder charPool = new StringBuilder();
        if (useLowercase) charPool.append(LOWERCASE);
        if (useUppercase) charPool.append(UPPERCASE);
        if (useNumbers) charPool.append(NUMBERS);
        if (useSymbols) charPool.append(SYMBOLS);

        if (charPool.isEmpty()) {
            System.out.println("You must select at least one character type.");
            return;
        }

        // Generate password
        String password = generatePassword(charPool.toString(), length);
        System.out.println("Generated Password: " + password);

        // Evaluate password strength
        String strength = evaluatePasswordStrength(password);
        System.out.println("Password Strength: " + strength);
    }

    private static String generatePassword(String charPool, int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }
        return password.toString();
    }

    private static String evaluatePasswordStrength(String password) {
        int score = 0;
        if (password.length() >= 12) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*].*")) score++;

        if (score >= 4) return "Very Strong";
        else if (score == 3) return "Strong";
        else if (score == 2) return "Medium";
        else return "Weak";
    }
}
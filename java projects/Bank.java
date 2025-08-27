import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        System.out.println("------------------");
        System.out.println("Welcome to the Bank!");
        System.out.println("------------------");
        System.out.println("1. show balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
        System.out.println("------------------");

        while (isRunning) {
            System.out.println("Enter your choice (1-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    static double deposit() {
        double amount;
        System.out.println("Enter amount to deposit: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid deposit amount.");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter amount to withdraw: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount.");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return 0;
        } else {
            return amount;
        }
    }
}
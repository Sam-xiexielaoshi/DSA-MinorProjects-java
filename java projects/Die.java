import java.util.Random;
import java.util.Scanner;

public class Die {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = sc.nextInt();

        if (numOfDice > 0) {

            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(6) + 1; // Generates a number between 1 and 6
                printASCII(roll);
                System.out.println("Die " + (i + 1) + " rolled: " + roll);
                total += roll;
            }
            System.out.println("Total of all dice rolled: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }
    }

    static void printASCII(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                 """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                 """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                 """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                 """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                 """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                 """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}

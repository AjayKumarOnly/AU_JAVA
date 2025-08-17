import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        int secretNumber = 45;
        int totalGames = 0;
        int totalGuesses = 0;

        mainMenu:
        while (true) {
            System.out.println("\n--- Number Guessing Game ---");
            System.out.println("1. Play Game");
            System.out.println("2. View Status");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int attempts = 0;
                    totalGames++;
                    gameLoop:
                    for (int i = 1; i <= 10; i++) {
                        System.out.print("Enter your guess (1-100 or -1 to quit): ");
                        int guess = sc.nextInt();

                        if (guess == -1) {
                            System.out.println("You quit the current game.");
                            break gameLoop;
                        }

                        if (guess < 1 || guess > 100) {
                            System.out.println("Invalid guess! Try again.");
                            continue;
                        }

                        attempts++;
                        totalGuesses++;

                        if (guess == secretNumber) {
                            System.out.println("Congratulations! You guessed it in " + attempts + " tries.");
                            break gameLoop;
                        } else if (guess < secretNumber) {
                            System.out.println("Too low! Try again.");
                        } else {
                            System.out.println("Too high! Try again.");
                        }

                        if (i == 10) {
                            System.out.println("Out of attempts! The secret number was " + secretNumber);
                        }
                    }
                    break;

                case 2:
                    if (totalGames == 0) {
                        System.out.println("No games played yet.");
                    } else {
                        double average = (double) totalGuesses / totalGames;
                        System.out.println("Total Games Played: " + totalGames);
                        System.out.println("Total Guesses: " + totalGuesses);
                        System.out.printf("Average Guesses per Game: %.2f\n", average);
                    }
                    break;

                case 3:
                    System.out.println("Thanks for playing! Goodbye.");
                    break mainMenu;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
